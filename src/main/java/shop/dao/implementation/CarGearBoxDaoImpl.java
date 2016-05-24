package shop.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarGearBoxDao;
import shop.domain.CarGearBox;

@Repository
public class CarGearBoxDaoImpl implements CarGearBoxDao{

	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void createCarGearBox(CarGearBox carGearBox) {
		em.persist(carGearBox);
	}
	@Transactional
	public void editCarGearBox(CarGearBox carGearBox) {
		em.refresh(carGearBox);
	}
	@Transactional
	public void deleteCarGearBox(CarGearBox carGearBox) {
		em.remove(carGearBox);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<CarGearBox> getAllCarGearBox() {
		return em.createQuery("from CarGearBox").getResultList();
	}
	@Transactional
	public CarGearBox findByType(String type) {
		return (CarGearBox) em.createNamedQuery("CarGearBox.findByType").setParameter("type", type).setMaxResults(1).getSingleResult();
	}
}
