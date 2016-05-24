package shop.dao;

import java.util.List;

import shop.domain.CarGearBox;

public interface CarGearBoxDao {
	
	void createCarGearBox(CarGearBox carGearBox);

	void editCarGearBox(CarGearBox carGearBox);

	void deleteCarGearBox(CarGearBox carGearBox);
	
	List<CarGearBox> getAllCarGearBox();
	
	CarGearBox findByType(String type);

}
