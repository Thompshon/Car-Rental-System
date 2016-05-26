package com.yuxuan.CarRental;

public abstract class Car {
	public abstract int priceEveryday();
	public abstract String getCarName();
	public abstract String showCapacity();
	public abstract String carStyleFlag();
	public int busLoad(){
		return 0;
	}
	
	public int deadWeight(){
		return 0;
	}
	
}
