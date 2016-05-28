package shop.dao.impl;

import org.springframework.stereotype.Repository;

import shop.dao.CarColorDao;
import shop.domain.CarColor;

@Repository
public class CarColorDaoImpl extends GeneralDaoImpl<CarColor, Long> implements CarColorDao {

}
