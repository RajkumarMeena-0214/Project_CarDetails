package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CarDTO;

@Repository
public class CarDAOImp extends BaseDAOImpl<CarDTO> implements CarDAOInt {

	public Class<CarDTO> getDTOClass() {
		return CarDTO.class;

	}

	@Override
	public List<Predicate> getWhereClause(CriteriaBuilder builder, Root qRoot, CarDTO dto) {

		List<Predicate> whereConditon = new ArrayList<Predicate>();

		if (dto.getCompany() != null && dto.getCompany().length() > 0) {
			whereConditon.add(builder.like(qRoot.get("company"), dto.getCompany()));
		}
		if (dto.getOwnerName() != null && dto.getOwnerName().length() > 0) {
			whereConditon.add(builder.like(qRoot.get("ownerName"), dto.getOwnerName()));
		}
		if (dto.getId() != null && dto.getId() > 0) {
			whereConditon.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		return whereConditon;
	}

}
