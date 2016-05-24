package shop.dao;

import java.util.List;

import shop.domain.CarTypeOfDrive;

public interface CarTypeOfDriveDao {
	
	void createCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive);

	void editCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive);

	void deleteCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive);
	
	List<CarTypeOfDrive> getAllCarTypeOfDrives();
	
	CarTypeOfDrive findByName(String name);

}
