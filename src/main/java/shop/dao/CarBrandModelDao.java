package shop.dao;

import java.util.List;

import shop.domain.CarBrandModel;


public interface CarBrandModelDao {


	void createCarBrandModel(CarBrandModel carBrandModel);

	void editCarBrandModel(CarBrandModel carBrandModel);

	void deleteCarBrandModel(CarBrandModel carBrandModel);
	
	List<CarBrandModel> getAllCarBrandModels();

	CarBrandModel findByName(String name);

}
