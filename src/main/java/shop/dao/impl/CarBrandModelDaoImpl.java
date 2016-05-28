package shop.dao.impl;

import org.springframework.stereotype.Repository;

import shop.dao.CarBrandModelDao;
import shop.domain.CarBrandModel;

@Repository
public class CarBrandModelDaoImpl extends GeneralDaoImpl<CarBrandModel, Long> implements CarBrandModelDao{

}
