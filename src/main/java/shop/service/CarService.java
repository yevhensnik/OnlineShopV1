package shop.service;

import java.util.List;

import shop.domain.Car;

public interface CarService {
	
	public void saveCar(Car car);

	public List<Car> getAllCars();

	public void updateCar(Car car);

	public void deleteCar(Long id);

	public Car findOneById(Long id);
	
//	List<Car> findByYearPeriod(int from, int till);
//	List<Car> findByPrisePeriod(int from, int till);
//	List<Car> findByFuelConsumptionCity(double from, double till);
//	List<Car> findByFuelConsumptionHighway(double from, double till);
//	List<Car> findByFuelConsumptionAvarage(double from, double till);
//	
//	List<Car> findByHorsePower(int from, int till);
//	List<Car> findByMileage(int from, int till);
//	List<Car> findByEngine(double from, double till);
//	
//	List<Car> findByCredit(boolean credit);
//	List<Car> findByDefective(boolean defective);
}
