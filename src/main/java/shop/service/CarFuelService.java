package shop.service;

import java.util.List;

import shop.domain.CarFuel;

public interface CarFuelService {

	void createCarFuel(String type);

	void editCarFuel(String type);

	void deleteCarFuel(String type);
	
	List<CarFuel> getAllCarFuels();
	
	CarFuel findByType(String type); 
}
