package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarDao;
import shop.domain.Car;
import shop.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarDao dao;

	@Transactional
	public void saveCar(Car car) {
		dao.save(car);
	}

	@Transactional
	public List<Car> getAllCars() {
		return dao.getAll();
	}

	@Transactional
	public void updateCar(Car car) {
		dao.update(car);
	}

	@Transactional
	public void deleteCar(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	public Car findOneById(Long id) {
		return dao.findOneById(id);
	}

	

//	public List<Car> findByYearPeriod(int from, int till) {
//		
//		return dao.findByYearPeriod(from, till);
//	}
//
//	public List<Car> findByPrisePeriod(int from, int till) {
//		
//		return dao.findByPrisePeriod(from, till);
//	}
//
//	public List<Car> findByFuelConsumptionCity(double from, double till) {
//		
//		return dao.findByFuelConsumptionCity(from, till);
//	}
//
//	public List<Car> findByFuelConsumptionHighway(double from, double till) {
//		
//		return dao.findByFuelConsumptionHighway(from, till);
//	}
//
//	public List<Car> findByFuelConsumptionAvarage(double from, double till) {
//		
//		return dao.findByFuelConsumptionAvarage(from, till);
//	}
//
//	public List<Car> findByHorsePower(int from, int till) {
//		
//		return dao.findByHorsePower(from, till);
//	}
//
//	public List<Car> findByMileage(int from, int till) {
//		
//		return dao.findByMileage(from, till);
//	}
//
//	public List<Car> findByEngine(double from, double till) {
//		
//		return dao.findByEngine(from, till);
//	}
//
//	public List<Car> findByCredit(boolean credit) {
//		
//		return dao.findByCredit(credit);
//	}
//
//	public List<Car> findByDefective(boolean defective) {
//		
//		return dao.findByDefective(defective);
//	} 
}
