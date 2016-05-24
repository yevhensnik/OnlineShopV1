package shop.dao;

import java.util.List;

import shop.domain.Car;

public interface CarDao {
	
	void createCar(Car car);

	void editCar(Car car);

	void deleteCar(Car car);
	
	List<Car> getAllCars();
	
	List<Car> findByYearPeriod(int from, int till);
	List<Car> findByPrisePeriod(int from, int till);
	List<Car> findByFuelConsumptionCity(double from, double till);
	List<Car> findByFuelConsumptionHighway(double from, double till);
	List<Car> findByFuelConsumptionAvarage(double from, double till);
	
	List<Car> findByHorsePower(int from, int till);
	List<Car> findByMileage(int from, int till);
	List<Car> findByEngine(double from, double till);
	
	List<Car> findByCredit(boolean credit);
	List<Car> findByDefective(boolean defective);

}
