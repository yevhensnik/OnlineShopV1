package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarNumberOfDoorDao;
import shop.domain.CarNumberOfDoor;
import shop.service.CarNumberOfDoorService;

@Service
public class CarNumberOfDoorServiceImpl implements CarNumberOfDoorService {

	@Autowired
	private CarNumberOfDoorDao dao;

	@Transactional
	public void saveCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor) {
		dao.save(carNumberOfDoor);
	}

	@Transactional
	public List<CarNumberOfDoor> getAllCarNumberOfDoors() {
		return dao.getAll();
	}

	@Transactional
	public void updateCarNumberOfDoor(CarNumberOfDoor carNumberOfDoor) {
		dao.update(carNumberOfDoor);
	}

	@Transactional
	public void deleteCarNumberOfDoor(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	public CarNumberOfDoor findOneById(Long id) {
		return dao.findOneById(id);
	}
	
}
