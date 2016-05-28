package shop.service;

import java.util.List;

import shop.domain.CarNumberOfSeats;

public interface CarNumberOfSeatsService {

	public void saveCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats);

	public List<CarNumberOfSeats> getAllCarNumberOfSeats();

	public void updateCarNumberOfSeats(CarNumberOfSeats carNumberOfSeats);

	public void deleteCarNumberOfSeats(Long id);

	public CarNumberOfSeats findOneById(Long id);
}
