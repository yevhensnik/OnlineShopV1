package shop.service;

import java.util.List;

import shop.domain.CarFuel;

public interface CarFuelService {

	public void saveCarFuel(CarFuel carFuel);

	public List<CarFuel> getAllCarFuels();

	public void updateCarFuel(CarFuel carFuel);

	public void deleteCarFuel(Long id);

	public CarFuel findOneById(Long id);
}
