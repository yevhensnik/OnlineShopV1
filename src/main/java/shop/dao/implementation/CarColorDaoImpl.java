package shop.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarColorDao;
import shop.domain.CarColor;

@Repository
public class CarColorDaoImpl implements CarColorDao {

	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void createCarColor(CarColor carColor) {
		em.persist(carColor);		
	}
	@Transactional
	public void editCarColor(CarColor carColor) {
		em.refresh(carColor);
	}
	@Transactional
	public void deleteCarColor(CarColor carColor) {
		em.remove(carColor);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<CarColor> getAllCarColor() {
		
		return em.createQuery("from CarColor").getResultList();
	}
	
	@Transactional
	public CarColor findByName(String name) {
		
		return (CarColor) em.createNamedQuery("CarColor.findByName").setParameter("name", name).setMaxResults(1).getSingleResult();
	}

}
