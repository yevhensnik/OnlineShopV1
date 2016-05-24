package shop.dao;

import java.util.List;

import shop.domain.CarNumberOfDoor;


public interface CarNumberOfDoorDao {
	
	void createCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor);

	void editCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor);

	void deleteCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor);
	
	List<CarNumberOfDoor> findByDoorsPeriod(int from, int till);
}
