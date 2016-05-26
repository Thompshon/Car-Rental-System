package com.yuxuan.CarRental;
import java.util.*;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用答答租车系统：");
		System.out.println("您是否要租车：1是 0否");
		Scanner input=new Scanner(System.in);
		int need=input.nextInt();
		
		if(need==1){
			
			Car[] carStyle={new PersonCar("奥迪A4",500,4), new PersonCar("马自达6",400,4), new PersonCar("金龙",800,20), 
					new MultiRoleCar("皮卡雪6",450,4,2),new Cargo("松花江",400,4), new Cargo("依维柯",1000,20)};

			System.out.println("您可租车的类型及其价目表：");
			System.out.println("序号	骑车名称	租金	容量");
			for(int i=0;i<carStyle.length;i++){
				System.out.println(i+1+"	"+carStyle[i].getCarName()+"	"+carStyle[i].priceEveryday()+"/天	"+carStyle[i].showCapacity());
			}
			
			System.out.println("请输入您要租骑车的数量：");
			int numCar=input.nextInt();
			int[] carIndex=new int[numCar];
			for(int i=0;i<numCar;i++){
				System.out.println("请输入第"+ (i+1) +"辆车的序号：");
				carIndex[i]=input.nextInt()-1;
			}
			
			System.out.println("请输入第租车的天数：");
			int numDay=input.nextInt();
			System.out.println("您的账单：");
			System.out.println("***可载人的车有：");
			int numPersonCapacity=0;
			for(int i=0;i<numCar;i++){
				if(carStyle[carIndex[i]].carStyleFlag()=="PersonCar"||"MultiRoleCar"==carStyle[carIndex[i]].carStyleFlag()){
					System.out.print(carStyle[carIndex[i]].getCarName()+"	");
					numPersonCapacity+=carStyle[carIndex[i]].busLoad();
				}
			}
			System.out.println("共载人："+numPersonCapacity+"人");
			
			System.out.println("***可载货的车有：");
			int numCargoCapacity=0;
			for(int i=0;i<numCar;i++){
				if(carStyle[carIndex[i]].carStyleFlag()=="Cargo"||"MultiRoleCar"==carStyle[carIndex[i]].carStyleFlag()){
					System.out.print(carStyle[carIndex[i]].getCarName()+"	");
					numCargoCapacity+=carStyle[carIndex[i]].deadWeight();
				}
			}
			System.out.println("共载货："+numCargoCapacity+"吨");
			
			
			int totalPrice=0;
			for(int i=0;i<numCar;i++){
				totalPrice+=carStyle[carIndex[i]].priceEveryday()*numDay;
			}
			System.out.println("***租车的总价格："+totalPrice+"元");
		}
		else
			System.out.println("谢谢！拜拜");
		input.close();
	}

}
