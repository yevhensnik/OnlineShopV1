package shop.dao.impl;

import org.springframework.stereotype.Repository;


import shop.dao.CarNumberOfSeatsDao;
import shop.domain.CarNumberOfSeats;

@Repository
public class CarNumberOfSeatsDaoImpl extends GeneralDaoImpl<CarNumberOfSeats, Long> implements CarNumberOfSeatsDao{

}
