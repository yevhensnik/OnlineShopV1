package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarFuelDao;
import shop.domain.CarFuel;
import shop.service.CarFuelService;

@Service
public class CarFuelServiceImpl implements CarFuelService {

	@Autowired
	private CarFuelDao dao;

	@Transactional
	public void saveCarFuel(CarFuel carFuel) {
		dao.save(carFuel);
	}

	@Transactional
	public List<CarFuel> getAllCarFuels() {
		return dao.getAll();
	}

	@Transactional
	public void updateCarFuel(CarFuel carFuel) {
		dao.update(carFuel);
	}

	@Transactional
	public void deleteCarFuel(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	public CarFuel findOneById(Long id) {
		return dao.findOneById(id);
	}
	
}
