package shop.service;

import java.util.List;

import shop.domain.CarGearBox;

public interface CarGearBoxService {
	
	public void saveCarGearBox(CarGearBox carGearBox);

	public List<CarGearBox> getAllCarGearBoxs();

	public void updateCarGearBox(CarGearBox carGearBox);

	public void deleteCarGearBox(Long id);

	public CarGearBox findOneById(Long id);
}
