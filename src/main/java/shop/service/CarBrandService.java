package shop.service;

import java.util.List;

import shop.domain.CarBrand;

public interface CarBrandService {

	void createCarBrand(String name);

	void editCarBrand(String name);

	void deleteCarBrand(String name);
	
	List<CarBrand> getAllCarBrands();

	CarBrand findByName(String name);
}
