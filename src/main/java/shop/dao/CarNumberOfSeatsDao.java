package shop.dao;

import java.util.List;

import shop.domain.CarNumberOfSeats;

public interface CarNumberOfSeatsDao {
	
	void createCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats);

	void editCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats);

	void deleteCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats);
	
	List<CarNumberOfSeats> findBySeatsPeriod(int from, int till);

}
