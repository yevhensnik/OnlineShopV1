package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.dao.CarGearBoxDao;
import shop.domain.CarGearBox;

@Service
public class CarGearBoxServiceImpl {

	@Autowired
	private CarGearBoxDao dao;
	
	public void createCarGearBox(String type) {
		CarGearBox gearBox = new CarGearBox(type);
		dao.createCarGearBox(gearBox);
		
	}

	public void editCarGearBox(String type) {
		CarGearBox gearBox = new CarGearBox(type);
		dao.editCarGearBox(gearBox);
		
	}

	public void deleteCarGearBox(String type) {
		CarGearBox gearBox = new CarGearBox(type);
		dao.deleteCarGearBox(gearBox);
		
	}

	public List<CarGearBox> getAllCarGearBox() {
		
		return dao.getAllCarGearBox();
	}

	public CarGearBox findByType(String type) {
		return dao.findByType(type);
	}
	
}
