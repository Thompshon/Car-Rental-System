package com.yuxuan.CarRental;

public class MultiRoleCar extends Car {

	MultiRoleCar (String name,int price,int busload,int cargocapacity)
	{
		carName = name;
		unitPrice=price;
		cargoCapacity=cargocapacity;
		this.busload=busload;
	}
	
	
	public String getCarName() {
		return carName;
	}
	
	public String showCapacity(){
		String capacity="‘ÿ»À£∫"+busload+"»À ‘ÿªı£∫"+cargoCapacity+"∂÷";
		return capacity;
	}
	
	@Override
	public int deadWeight() {
		// TODO Auto-generated method stub
		return cargoCapacity;
	}

	@Override
	public int priceEveryday() {
		// TODO Auto-generated method stub
		return unitPrice;
	}

	@Override
	public int busLoad() {
		// TODO Auto-generated method stub
		return busload;
	}
	
	@Override
	public String carStyleFlag() {
		// TODO Auto-generated method stub
		return carStyleFlag;
	}

	//private int numCar;
	final public String carStyleFlag="MultiRoleCar";
	final private String carName;
	final private int unitPrice;
	final private int cargoCapacity;
	final private int busload;
}
