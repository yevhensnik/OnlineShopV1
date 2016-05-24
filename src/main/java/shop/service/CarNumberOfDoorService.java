package shop.service;

import java.util.List;

import shop.domain.CarNumberOfDoor;

public interface CarNumberOfDoorService {

	void createCarNumberOfDoor(int carNumberOfDoor);

	void editCarNumberOfDoor(int carNumberOfDoor);

	void deleteCarNumberOfDoor(int carNumberOfDoor);
	
	List<CarNumberOfDoor> findByDoorsPeriod(int from, int till);
}
