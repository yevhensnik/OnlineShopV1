package shop.service;

import java.util.List;

import shop.domain.CarColor;

public interface CarColorService {

	void createCarColor(String name);

	void editCarColor(String name);

	void deleteCarColor(String name);
	
	List<CarColor> getAllCarColor();
	
	CarColor findByName(String name);
}
