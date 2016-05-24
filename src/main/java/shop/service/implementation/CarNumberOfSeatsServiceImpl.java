package shop.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.dao.CarNumberOfSeatsDao;
import shop.domain.CarNumberOfSeats;

@Service
public class CarNumberOfSeatsServiceImpl {

	@Autowired
	private CarNumberOfSeatsDao dao;
	
	public void createCarNumberOfSeats(int numberOfSeats) {
		CarNumberOfSeats carNumberOfSeats = new CarNumberOfSeats(numberOfSeats);
		dao.createCarNumberOfSeats(carNumberOfSeats);
		
	}

	public void editCarNumberOfSeats(int numberOfSeats) {
		CarNumberOfSeats carNumberOfSeats = new CarNumberOfSeats(numberOfSeats);
		dao.editCarNumberOfSeats(carNumberOfSeats);
		
	}

	public void deleteCarNumberOfSeats(int numberOfSeats) {
		CarNumberOfSeats carNumberOfSeats = new CarNumberOfSeats(numberOfSeats);
		dao.deleteCarNumberOfSeats(carNumberOfSeats);
		
	}
	
	public List<CarNumberOfSeats> findBySeatsPeriod(int from, int till){
		return dao.findBySeatsPeriod(from, till);
		
	}
}
