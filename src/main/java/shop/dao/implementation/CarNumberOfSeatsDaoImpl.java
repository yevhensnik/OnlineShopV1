package shop.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarNumberOfSeatsDao;
import shop.domain.CarNumberOfSeats;

@Repository
public class CarNumberOfSeatsDaoImpl implements CarNumberOfSeatsDao{

	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void createCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats) {
		em.persist(carNumberOfSeats);
		
	}
	@Transactional
	public void editCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats) {
		em.refresh(carNumberOfSeats);
		
	}
	@Transactional
	public void deleteCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats) {
		em.remove(carNumberOfSeats);
		
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<CarNumberOfSeats> findBySeatsPeriod(int from, int till) {
		return em.createNamedQuery("CarNumberOfSeats.findBySeatsPeriod").setParameter("from", from).setParameter("till", till).getResultList();
	}

}
