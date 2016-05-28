package shop.dao.impl;

import org.springframework.stereotype.Repository;

import shop.dao.CarBrandDao;
import shop.domain.CarBrand;


@Repository
public class CarBrandDaoImpl extends GeneralDaoImpl<CarBrand, Long> implements CarBrandDao{

}
