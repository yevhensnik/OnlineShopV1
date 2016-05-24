package shop.service;

import java.util.List;

import shop.domain.CarGearBox;

public interface CarGearBoxService {
	
	void createCarGearBox(String type);

	void editCarGearBox(String type);

	void deleteCarGearBox(String type);
	
	List<CarGearBox> getAllCarGearBox();
	
	CarGearBox findByType(String type);

}
