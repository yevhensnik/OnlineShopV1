package shop.service;

import java.util.List;

import shop.domain.CarBrandModel;

public interface CarBrandModelService {

	void createCarBrandModel(String name);

	void editCarBrandModel(String name);

	void deleteCarBrandModel(String name);
	
	List<CarBrandModel> getAllCarBrandModels();

	CarBrandModel findByName(String name);
}
