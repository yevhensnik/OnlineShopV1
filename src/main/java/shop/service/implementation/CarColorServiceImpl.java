package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarColorDao;
import shop.domain.CarColor;
import shop.service.CarColorService;

@Service
public class CarColorServiceImpl implements CarColorService {

	@Autowired
	private CarColorDao dao;

	@Transactional
	public void saveCarColor(CarColor carColor) {
		dao.save(carColor);	
	}

	@Transactional
	public List<CarColor> getAllCarColors() {
		return dao.getAll();
	}

	@Transactional
	public void updateCarColor(CarColor carColor) {
		dao.update(carColor);
	}

	@Transactional
	public void deleteCarColor(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	public CarColor findOneById(Long id) {
		return dao.findOneById(id);
	}
	
	

}
