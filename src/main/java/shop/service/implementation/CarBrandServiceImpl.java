package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.dao.CarBrandDao;
import shop.domain.CarBrand;

@Service
public class CarBrandServiceImpl {
	
	@Autowired
	private CarBrandDao dao;
	
	public void createCarBrand(String name) {
		CarBrand brand = new CarBrand(name);
		dao.createCarBrand(brand);
		
	}

	public void editCarBrand(String name) {
		CarBrand brand = new CarBrand(name);
		dao.editCarBrand(brand);
		
	}

	public void deleteCarBrand(String name) {
		CarBrand brand = new CarBrand(name);
		dao.deleteCarBrand(brand);
		
	}

	public List<CarBrand> getAllCarBrands() {
		
		return dao.getAllCarBrands();
	}

	public CarBrand findByName(String name) {
		return dao.findByName(name);
	}

}
