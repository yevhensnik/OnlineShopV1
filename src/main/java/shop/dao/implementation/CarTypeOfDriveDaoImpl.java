package shop.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarTypeOfDriveDao;
import shop.domain.CarTypeOfDrive;

@Repository
public class CarTypeOfDriveDaoImpl implements CarTypeOfDriveDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void createCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive) {
		em.persist(carTypeOfDrive);
	}
	@Transactional
	public void editCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive) {
		em.refresh(carTypeOfDrive);
	}
	@Transactional
	public void deleteCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive) {
		em.remove(carTypeOfDrive);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<CarTypeOfDrive> getAllCarTypeOfDrives() {
		return em.createQuery("from CarTypeOfDrive").getResultList();
	}
	@Transactional
	public CarTypeOfDrive findByName(String name) {
		return (CarTypeOfDrive) em.createNamedQuery("CarTypeOfDrive.findByName").setParameter("name", name).setMaxResults(1).getSingleResult();
	}

}
