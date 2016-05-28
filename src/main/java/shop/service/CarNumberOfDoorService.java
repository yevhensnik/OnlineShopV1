package shop.service;

import java.util.List;

import shop.domain.CarNumberOfDoor;

public interface CarNumberOfDoorService {
	
	public void saveCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor);

	public List<CarNumberOfDoor> getAllCarNumberOfDoors();

	public void updateCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor);

	public void deleteCarNumberOfDoor(Long id);

	public CarNumberOfDoor findOneById(Long id);
}
