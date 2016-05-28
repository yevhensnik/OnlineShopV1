package shop.service;

import java.util.List;

import shop.domain.CarTypeOfDrive;

public interface CarTypeOfDriveService {
	
	public void saveCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive);

	public List<CarTypeOfDrive> getAllCarTypeOfDrives();

	public void updateCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive);

	public void deleteCarTypeOfDrive(Long id);

	public CarTypeOfDrive findOneById(Long id);
}
