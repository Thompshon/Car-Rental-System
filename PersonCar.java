package com.yuxuan.CarRental;

public class PersonCar extends Car {

	PersonCar (String name,int price,int capacity)
	{
		carName = name;
		unitPrice=price;
		busload=capacity;
		//carStyleFlag=carstyleflag;
	}
	
	public int busLoad(){
		return busload;
	}
	
	
	public String showCapacity(){
		String capacity="‘ÿ»À£∫"+busload+"»À";
		return capacity;
	}
	
	@Override
	public int priceEveryday() {
		// TODO Auto-generated method stub
		return unitPrice;
	}
	
	
	public String getCarName() {
		return carName;
	}

	@Override
	public String carStyleFlag() {
		// TODO Auto-generated method stub
		return carStyleFlag;
	}
	
	
	//private int numCar;
	final private String carStyleFlag="PersonCar";
	final private int unitPrice;
	final private int busload;
	final private String carName;
}
