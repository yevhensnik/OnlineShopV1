package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarGearBoxDao;
import shop.domain.CarGearBox;
import shop.service.CarGearBoxService;

@Service
public class CarGearBoxServiceImpl implements CarGearBoxService {

	@Autowired
	private CarGearBoxDao dao;

	@Transactional
	public void saveCarGearBox(CarGearBox carGearBox) {
		dao.save(carGearBox);
	}

	@Transactional
	public List<CarGearBox> getAllCarGearBoxs() {
		return dao.getAll();
	}

	@Transactional
	public void updateCarGearBox(CarGearBox carGearBox) {
		dao.update(carGearBox);
	}

	@Transactional
	public void deleteCarGearBox(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	public CarGearBox findOneById(Long id) {
		return dao.findOneById(id);
	}
	
}
