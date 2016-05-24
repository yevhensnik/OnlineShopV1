package shop.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarBrandDao;
import shop.domain.CarBrand;

@Repository
public class CarBrandDaoImpl implements CarBrandDao{

	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void createCarBrand(CarBrand carBrand) {
		em.persist(carBrand);
		
	}
	@Transactional
	public void editCarBrand(CarBrand carBrand) {
		em.refresh(carBrand);
		
	}
	@Transactional
	public void deleteCarBrand(CarBrand carBrand) {
		em.remove(carBrand);
		
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<CarBrand> getAllCarBrands() {
		
		return em.createQuery("from CarBrand").getResultList();
	}
	@Transactional
	public CarBrand findByName(String name) {
		
		return (CarBrand) em.createNamedQuery("CarBrand.findByName").setParameter("name", name).setMaxResults(1).getSingleResult();
	}

}
