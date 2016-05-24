package shop.service;

import java.util.List;

import shop.domain.CarTypeOfDrive;

public interface CarTypeOfDriveService {

	
	void createCarTypeOfDrive(String name);

	void editCarTypeOfDrive(String name);

	void deleteCarTypeOfDrive(String name);
	
	List<CarTypeOfDrive> getAllCarTypeOfDrives();
	
	CarTypeOfDrive findByName(String name);
}
