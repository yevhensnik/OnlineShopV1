package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.dao.CarColorDao;
import shop.domain.CarColor;
import shop.service.CarColorService;

@Service
public class CarColorServiceImpl implements CarColorService {

	@Autowired
	private CarColorDao dao;
	
	public void createCarColor(String name) {
		CarColor color = new CarColor(name);
		dao.createCarColor(color);
		
	}

	public void editCarColor(String name) {
		CarColor color = new CarColor(name);
		dao.editCarColor(color);
		
	}

	public void deleteCarColor(String name) {
		CarColor color = new CarColor(name);
		dao.deleteCarColor(color);
		
	}

	public List<CarColor> getAllCarColor() {
		
		return dao.getAllCarColor();
	}

	public CarColor findByName(String name) {
		return dao.findByName(name);
	}

}
