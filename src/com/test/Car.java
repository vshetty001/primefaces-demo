package com.test;

import java.io.Serializable;

public class Car implements Serializable {

	private String id;
	private String brand;
	private int year;
	private String color;
	private int randomPrice;
	private boolean randomSoldState;

	public Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice,
			boolean randomSoldState) {
		
				this.id = randomId;
				this.brand = randomBrand;
				this.year = randomYear;
				this.color = randomColor;
				this.randomPrice = randomPrice;
				this.randomSoldState = randomSoldState;
	}

	public String getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return randomPrice;
	}

	public boolean isSoldState() {
		return randomSoldState;
	}
}
