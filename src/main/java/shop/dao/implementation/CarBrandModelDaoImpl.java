package shop.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarBrandModelDao;
import shop.domain.CarBrandModel;

@Repository
public class CarBrandModelDaoImpl implements CarBrandModelDao{

	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void createCarBrandModel(CarBrandModel carBrandModel) {
		em.persist(carBrandModel);
		
	}
	@Transactional
	public void editCarBrandModel(CarBrandModel carBrandModel) {
		em.refresh(carBrandModel);
	}
	@Transactional
	public void deleteCarBrandModel(CarBrandModel carBrandModel) {
		em.remove(carBrandModel);
		
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<CarBrandModel> getAllCarBrandModels() {
		
		return em.createQuery("from CarBrandModel").getResultList();
	}

	public CarBrandModel findByName(String name) {
		
		return (CarBrandModel) em.createNamedQuery("CarBrandModel.findByName").setParameter("name", name).setMaxResults(1).getSingleResult();
	}

}
