package shop.service;

import java.util.List;

import shop.domain.Car;

public interface CarService {
	
	void createCar(int carPrice, int carYear, int horsePower, int mileage, 
			double engine, double fuelConsumptionCity, double fuelConsumptionHighway, double fuelConsumptionAvarage,
			boolean credit, boolean defective, 
			String brandName, String brandModelName,
			String wheelDriveType,
			String gearBoxTypeName,
			String fuelTypeName,
			String colorName,
			int numberOfSeats,
			int numberOfDoors);

	void editCar(int carPrice, int carYear, int horsePower, int mileage, 
			double engine, double fuelConsumptionCity, double fuelConsumptionHighway, double fuelConsumptionAvarage,
			boolean credit, boolean defective, 
			String brandName, String brandModelName,
			String wheelDriveType,
			String gearBoxTypeName,
			String fuelTypeName,
			String colorName,
			int numberOfSeats,
			int numberOfDoors);

	void deleteCar(int id);
	
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
