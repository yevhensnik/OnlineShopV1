package shop.dao;

import java.util.List;

import shop.domain.CarBrand;

public interface CarBrandDao {

	void createCarBrand(CarBrand carBrand);

	void editCarBrand(CarBrand carBrand);

	void deleteCarBrand(CarBrand carBrand);
	
	List<CarBrand> getAllCarBrands();

	CarBrand findByName(String name);
}
