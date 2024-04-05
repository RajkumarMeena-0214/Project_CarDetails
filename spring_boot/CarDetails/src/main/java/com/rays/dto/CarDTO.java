package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CAR")
public class CarDTO extends BaseDTO {

	@Column(name = "OWNER_NAME", length = 50)
	private String ownerName;

	@Column(name = "COMPANY")
	private String company;

	@Column(name = "MODEL")
	private String model;

	@Column(name = "IMAGE_ID")
	private Long imageId;
	
	@Column(name = "PURCHASE_DATE")
	private String purchaseDate;

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	@Column(name = "PRICE")
	private String price;

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

	public String getValue() {
		return ownerName;
	}

	

	
}
