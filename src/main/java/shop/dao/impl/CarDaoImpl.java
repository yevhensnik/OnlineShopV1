package shop.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarDao;
import shop.domain.Car;
import shop.domain.CarColor;

@Repository
public class CarDaoImpl extends GeneralDaoImpl<Car, Long> implements CarDao{
	
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Car> findByYearPeriod(int from, int till) {
//		return em.createNamedQuery("Car.findByYearPeriod").setParameter("from", from).setParameter("till", till).getResultList();
//	}
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Car> findByPrisePeriod(int from, int till) {
//		return em.createNamedQuery("Car.findByPrisePeriod").setParameter("from", from).setParameter("till", till).getResultList();
//	}
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Car> findByFuelConsumptionCity(double from, double till) {
//		return em.createNamedQuery("Car.findByFuelConsumptionCity").setParameter("from", from).setParameter("till", till).getResultList();
//	}
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Car> findByFuelConsumptionHighway(double from, double till) {
//		return em.createNamedQuery("Car.findByFuelConsumptionHighway").setParameter("from", from).setParameter("till", till).getResultList();
//	}
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Car> findByFuelConsumptionAvarage(double from, double till) {
//		return em.createNamedQuery("Car.findByFuelConsumptionAvarage").setParameter("from", from).setParameter("till", till).getResultList();
//	}
//	
//	
//	
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Car> findByHorsePower(int from, int till) {
//		return em.createNamedQuery("Car.findByHorsePower").setParameter("from", from).setParameter("till", till).getResultList();
//	}
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Car> findByMileage(int from, int till) {
//		return em.createNamedQuery("Car.findByMileage").setParameter("from", from).setParameter("till", till).getResultList();
//		
//	}
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Car> findByEngine(double from, double till) {
//		return em.createNamedQuery("Car.findByEngine").setParameter("from", from).setParameter("till", till).getResultList();
//		
//	}
//	
//	
//	////////////////////////////////////////////
//	//TEST
//	////////////////////////////////////////////
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Car> findByCredit(boolean credit) {
//		// TODO Auto-generated method stub
//		return em.createQuery("from Car").getResultList();
//	}
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Car> findByDefective(boolean defective) {
//		// TODO Auto-generated method stub
//		return em.createQuery("from Car").getResultList();
//	}
}
