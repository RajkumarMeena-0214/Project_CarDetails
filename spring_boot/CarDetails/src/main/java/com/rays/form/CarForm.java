package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CarDTO;

public class CarForm extends BaseForm {

	@NotEmpty(message = "OwnerName is required")
	private String ownerName;

	@NotEmpty(message = "Company is required")
	private String company;

	@NotEmpty(message = "Model is required")
	private String model;

	@NotEmpty(message = "Price is required")
	private String price;

	private String purchaseDate;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public BaseDTO getDto() {
		CarDTO dto = initDTO(new CarDTO());
		dto.setOwnerName(ownerName);
		dto.setCompany(company);
		dto.setModel(model);
		dto.setPrice(price);
		dto.setPurchaseDate(purchaseDate);
		return dto;
	}

}