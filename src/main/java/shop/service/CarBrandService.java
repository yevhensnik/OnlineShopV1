package shop.service;

import java.util.List;

import shop.domain.CarBrand;

public interface CarBrandService {

	public void saveCarBrand(CarBrand carBrand);

	public List<CarBrand> getAllCarBrands();

	public void updateCarBrand(CarBrand carBrand);

	public void deleteCarBrand(Long id);

	public CarBrand findOneById(Long id);
}
