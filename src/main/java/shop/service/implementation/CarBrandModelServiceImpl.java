package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarBrandModelDao;
import shop.domain.CarBrandModel;
import shop.service.CarBrandModelService;

@Service
public class CarBrandModelServiceImpl implements CarBrandModelService{
	
	@Autowired
	private CarBrandModelDao dao;

	@Transactional
	public void saveCarBrandModel(CarBrandModel carBrandModel) {
		dao.save(carBrandModel);
	}

	@Transactional
	public List<CarBrandModel> getAllCarBrandModels() {
		return dao.getAll();
	}

	@Transactional
	public void updateCarBrandModel(CarBrandModel carBrandModel) {
		dao.update(carBrandModel);
	}

	@Transactional
	public void deleteCarBrandModel(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	public CarBrandModel findOneById(Long id) {
		return dao.findOneById(id);
	}
}
