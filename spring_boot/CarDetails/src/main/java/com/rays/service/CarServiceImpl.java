package com.rays.service;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImp;
import com.rays.dao.CarDAOInt;
import com.rays.dto.CarDTO;

@Service
@Transactional
public class CarServiceImpl extends BaseServiceImp<CarDTO, CarDAOInt> implements CarServiceInt {
	
	
}