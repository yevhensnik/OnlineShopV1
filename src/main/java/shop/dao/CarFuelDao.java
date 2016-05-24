package shop.dao;

import java.util.List;

import shop.domain.CarFuel;

public interface CarFuelDao {
	
	void createCarFuel(CarFuel carFuel);

	void editCarFuel(CarFuel carFuel);

	void deleteCarFuel(CarFuel carFuel);
	
	List<CarFuel> getAllCarFuels();
	
	CarFuel findByType(String type);

}
