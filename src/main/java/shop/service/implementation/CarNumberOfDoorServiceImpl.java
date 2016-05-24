package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.dao.CarNumberOfDoorDao;
import shop.domain.CarNumberOfDoor;

@Service
public class CarNumberOfDoorServiceImpl {

	@Autowired
	private CarNumberOfDoorDao dao;
	
	public void createCarNumberOfDoor(int numberOfDoor) {
		CarNumberOfDoor carNumberOfDoor = new CarNumberOfDoor(numberOfDoor);
		dao.createCarNumberOfDoor(carNumberOfDoor);
		
	}

	public void editCarNumberOfDoor(int numberOfDoor) {
		CarNumberOfDoor carNumberOfDoor = new CarNumberOfDoor(numberOfDoor);
		dao.editCarNumberOfDoor(carNumberOfDoor);
		
	}

	public void deleteCarNumberOfDoor(int numberOfDoor) {
		CarNumberOfDoor carNumberOfDoor = new CarNumberOfDoor(numberOfDoor);
		dao.deleteCarNumberOfDoor(carNumberOfDoor);
		
	}
	
	public List<CarNumberOfDoor> findByDoorsPeriod(int from, int till){
		return dao.findByDoorsPeriod(from, till);
		
	}
	
}
