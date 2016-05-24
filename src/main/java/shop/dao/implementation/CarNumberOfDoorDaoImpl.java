package shop.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarNumberOfDoorDao;
import shop.domain.CarNumberOfDoor;

@Repository
public class CarNumberOfDoorDaoImpl implements CarNumberOfDoorDao{

	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void createCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor) {
		em.persist(carNumberOfDoor);
		
	}
	@Transactional
	public void editCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor) {
		em.refresh(carNumberOfDoor);
		
	}
	@Transactional
	public void deleteCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor) {
		em.remove(carNumberOfDoor);
		
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<CarNumberOfDoor> findByDoorsPeriod(int from, int till) {
		
		return em.createNamedQuery("CarNumberOfDoor.findByDoorsPeriod").setParameter("from", from).setParameter("till", till).getResultList();
	}

}
