package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.dao.CarBrandModelDao;
import shop.domain.CarBrandModel;

@Service
public class CarBrandModelServiceImpl {
	
	@Autowired
	private CarBrandModelDao dao;
	
	public void createCarBrandModel(String name) {
		CarBrandModel brandModel = new CarBrandModel(name);
		dao.createCarBrandModel(brandModel);
		
	}

	public void editCarBrandModel(String name) {
		CarBrandModel brandModel = new CarBrandModel(name);
		dao.editCarBrandModel(brandModel);
		
	}

	public void deleteCarBrandModel(String name) {
		CarBrandModel brandModel = new CarBrandModel(name);
		dao.deleteCarBrandModel(brandModel);
		
	}

	public List<CarBrandModel> getAllCarBrandModels() {
		
		return dao.getAllCarBrandModels();
	}

	public CarBrandModel findByName(String name) {
		return dao.findByName(name);
	}

}
