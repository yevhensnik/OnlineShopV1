package shop.service;

import java.util.List;

import shop.domain.CarColor;

public interface CarColorService {

	public void saveCarColor(CarColor carColor);

	public List<CarColor> getAllCarColors();

	public void updateCarColor(CarColor carColor);

	public void deleteCarColor(Long id);

	public CarColor findOneById(Long id);
}
