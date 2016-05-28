package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CarNumberOfSeatsDao;
import shop.domain.CarNumberOfSeats;
import shop.service.CarNumberOfSeatsService;

@Service
public class CarNumberOfSeatsServiceImpl implements CarNumberOfSeatsService {

	@Autowired
	private CarNumberOfSeatsDao dao;

	@Transactional
	public void saveCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats) {
		dao.save(carNumberOfSeats);
	}

	@Transactional
	public List<CarNumberOfSeats> getAllCarNumberOfSeats() {
		return dao.getAll();
	}

	@Transactional
	public void updateCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats) {
		dao.update(carNumberOfSeats);
	}

	@Transactional
	public void deleteCarNumberOfSeats(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	public CarNumberOfSeats findOneById(Long id) {
		return dao.findOneById(id);
	}
	
}
