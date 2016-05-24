package shop.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarFuelDao;
import shop.domain.CarFuel;

@Repository
public class CarFuelDaoImpl implements CarFuelDao{
	

	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void createCarFuel(CarFuel carFuel) {
		em.persist(carFuel);
		
	}
	@Transactional
	public void editCarFuel(CarFuel carFuel) {
		em.refresh(carFuel);
	}
	@Transactional
	public void deleteCarFuel(CarFuel carFuel) {
		em.remove(carFuel);		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<CarFuel> getAllCarFuels() {
		return em.createQuery("from CarFuel").getResultList();
	}
	@Transactional
	public CarFuel findByType(String type) {
		return (CarFuel) em.createNamedQuery("CarFuel.findByType").setParameter("type", type).setMaxResults(1).getSingleResult();
	}

}
