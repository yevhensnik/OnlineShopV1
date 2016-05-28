package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarBrandDao;
import shop.domain.CarBrand;
import shop.service.CarBrandService;

@Service
public class CarBrandServiceImpl implements CarBrandService{
	
	@Autowired
	private CarBrandDao dao;

	@Transactional
	public void saveCarBrand(CarBrand carBrand) {
		dao.save(carBrand);
	}

	@Transactional
	public List<CarBrand> getAllCarBrands() {
		return dao.getAll();
	}

	@Transactional
	public void updateCarBrand(CarBrand carBrand) {
		dao.update(carBrand);
	}

	@Transactional
	public void deleteCarBrand(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	public CarBrand findOneById(Long id) {
		return dao.findOneById(id);
	}
}
