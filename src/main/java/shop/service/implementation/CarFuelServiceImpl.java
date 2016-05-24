package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.dao.CarFuelDao;
import shop.domain.CarFuel;

@Service
public class CarFuelServiceImpl {

	@Autowired
	private CarFuelDao dao;
	
	public void createCarFuel(String name) {
		CarFuel fuel = new CarFuel(name);
		dao.createCarFuel(fuel);
		
	}

	public void editCarFuel(String name) {
		CarFuel fuel = new CarFuel(name);
		dao.editCarFuel(fuel);
		
	}

	public void deleteCarFuel(String name) {
		CarFuel fuel = new CarFuel(name);
		dao.deleteCarFuel(fuel);
		
	}

	public List<CarFuel> getAllCarFuel() {
		
		return dao.getAllCarFuels();
	}

	public CarFuel findByType(String type) {
		return dao.findByType(type);
	}
	
}
