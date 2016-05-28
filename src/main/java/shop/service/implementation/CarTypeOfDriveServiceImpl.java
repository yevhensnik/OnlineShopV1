package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarTypeOfDriveDao;
import shop.domain.CarTypeOfDrive;
import shop.service.CarTypeOfDriveService;

@Service
public class CarTypeOfDriveServiceImpl implements CarTypeOfDriveService{
	
	@Autowired
	private CarTypeOfDriveDao dao;

	@Transactional
	public void saveCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive) {
		dao.save(carTypeOfDrive);
	}

	@Transactional
	public List<CarTypeOfDrive> getAllCarTypeOfDrives() {
		return dao.getAll();
	}

	@Transactional
	public void updateCarTypeOfDrive(CarTypeOfDrive carTypeOfDrive) {
		dao.update(carTypeOfDrive);
	}

	@Transactional
	public void deleteCarTypeOfDrive(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	public CarTypeOfDrive findOneById(Long id) {
		return dao.findOneById(id);
	}
	
}
