package com.yuxuan.CarRental;

public class Cargo extends Car {

	Cargo (String name,int price, int capacity)
	{
		carName = name;
		unitPrice=price;
		cargoCapacity=capacity;
	}
	
	public String showCapacity(){
		String capacity="‘ÿªı£∫"+cargoCapacity+"∂÷";
		return capacity;
	}
	public String getCarName() {
		return carName;
	}
	@Override
	public int priceEveryday() {
		// TODO Auto-generated method stub
		return unitPrice;
	}
	@Override
	public int deadWeight() {
		// TODO Auto-generated method stub
		return cargoCapacity;
	}
	
	
	@Override
	public String carStyleFlag() {
		// TODO Auto-generated method stub
		return carStyleFlag;
	}


	//private int numCar;
	final public String carStyleFlag="Cargo";
	final private String carName;
	final private int unitPrice;
	final private int cargoCapacity;

}
