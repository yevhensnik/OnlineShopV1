package shop.dao;

import java.util.List;

import shop.domain.CarColor;

public interface CarColorDao {
	
	void createCarColor(CarColor carColor);

	void editCarColor(CarColor carColor);

	void deleteCarColor(CarColor carColor);
	
	List<CarColor> getAllCarColor();
	
	CarColor findByName(String name);


}
