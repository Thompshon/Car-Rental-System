package com.yuxuan.CarRental;
import java.util.*;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		System.out.println("���Ƿ�Ҫ�⳵��1�� 0��");
		Scanner input=new Scanner(System.in);
		int need=input.nextInt();
		
		if(need==1){
			
			Car[] carStyle={new PersonCar("�µ�A4",500,4), new PersonCar("���Դ�6",400,4), new PersonCar("����",800,20), 
					new MultiRoleCar("Ƥ��ѩ6",450,4,2),new Cargo("�ɻ���",400,4), new Cargo("��ά��",1000,20)};

			System.out.println("�����⳵�����ͼ����Ŀ��");
			System.out.println("���	�ﳵ����	���	����");
			for(int i=0;i<carStyle.length;i++){
				System.out.println(i+1+"	"+carStyle[i].getCarName()+"	"+carStyle[i].priceEveryday()+"/��	"+carStyle[i].showCapacity());
			}
			
			System.out.println("��������Ҫ���ﳵ��������");
			int numCar=input.nextInt();
			int[] carIndex=new int[numCar];
			for(int i=0;i<numCar;i++){
				System.out.println("�������"+ (i+1) +"��������ţ�");
				carIndex[i]=input.nextInt()-1;
			}
			
			System.out.println("��������⳵��������");
			int numDay=input.nextInt();
			System.out.println("�����˵���");
			System.out.println("***�����˵ĳ��У�");
			int numPersonCapacity=0;
			for(int i=0;i<numCar;i++){
				if(carStyle[carIndex[i]].carStyleFlag()=="PersonCar"||"MultiRoleCar"==carStyle[carIndex[i]].carStyleFlag()){
					System.out.print(carStyle[carIndex[i]].getCarName()+"	");
					numPersonCapacity+=carStyle[carIndex[i]].busLoad();
				}
			}
			System.out.println("�����ˣ�"+numPersonCapacity+"��");
			
			System.out.println("***���ػ��ĳ��У�");
			int numCargoCapacity=0;
			for(int i=0;i<numCar;i++){
				if(carStyle[carIndex[i]].carStyleFlag()=="Cargo"||"MultiRoleCar"==carStyle[carIndex[i]].carStyleFlag()){
					System.out.print(carStyle[carIndex[i]].getCarName()+"	");
					numCargoCapacity+=carStyle[carIndex[i]].deadWeight();
				}
			}
			System.out.println("���ػ���"+numCargoCapacity+"��");
			
			
			int totalPrice=0;
			for(int i=0;i<numCar;i++){
				totalPrice+=carStyle[carIndex[i]].priceEveryday()*numDay;
			}
			System.out.println("***�⳵���ܼ۸�"+totalPrice+"Ԫ");
		}
		else
			System.out.println("лл���ݰ�");
		input.close();
	}

}
