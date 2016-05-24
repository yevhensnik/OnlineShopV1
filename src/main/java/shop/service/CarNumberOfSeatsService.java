package shop.service;

import java.util.List;

import shop.domain.CarNumberOfSeats;

public interface CarNumberOfSeatsService {

	void createCarNumberOfSeats(int carNumberOfSeats);

	void editCarNumberOfSeats(int carNumberOfSeats);

	void deleteCarNumberOfSeats(int carNumberOfSeats);
	
	List<CarNumberOfSeats> findBySeatsPeriod(int from, int till);
}
