package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.dao.CarTypeOfDriveDao;
import shop.domain.CarTypeOfDrive;

@Service
public class CarTypeOfDriveServiceImpl {
	
	@Autowired
	private CarTypeOfDriveDao dao;
	
	public void createCarTypeOfDrive(String name) {
		CarTypeOfDrive typeOfDrive = new CarTypeOfDrive(name);
		dao.createCarTypeOfDrive(typeOfDrive);
		
	}

	public void editCarTypeOfDrive(String name) {
		CarTypeOfDrive typeOfDrive = new CarTypeOfDrive(name);
		dao.editCarTypeOfDrive(typeOfDrive);
		
	}

	public void deleteCarTypeOfDrive(String name) {
		CarTypeOfDrive typeOfDrive = new CarTypeOfDrive(name);
		dao.deleteCarTypeOfDrive(typeOfDrive);
		
	}

	public List<CarTypeOfDrive> getAllCarTypeOfDrives() {
		
		return dao.getAllCarTypeOfDrives();
	}

	public CarTypeOfDrive findByName(String name) {
		return dao.findByName(name);
	}

}
