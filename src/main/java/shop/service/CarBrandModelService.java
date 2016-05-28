package shop.service;

import java.util.List;

import shop.domain.CarBrandModel;

public interface CarBrandModelService {

	public void saveCarBrandModel(CarBrandModel carBrandModel);

	public List<CarBrandModel> getAllCarBrandModels();

	public void updateCarBrandModel(CarBrandModel carBrandModel);

	public void deleteCarBrandModel(Long id);

	public CarBrandModel findOneById(Long id);
}
