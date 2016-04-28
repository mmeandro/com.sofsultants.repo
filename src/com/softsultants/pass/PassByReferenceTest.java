package com.softsultants.pass;

public class PassByReferenceTest {

	public static void main(String[] args) {
			PassByReferenceTest pt = new PassByReferenceTest();
			Car car = pt.new Car (8, "This is a String to instanciatate a Car");
			System.out.println("The cars primative int car.carint is  " + car.carint);
			System.out.println("The cars object string car.nameOfCar is " + car.nameOfCar);
			pt.methodPT(car, car.carint);
			System.out.println("The cars primative int member car.carint AFTER still is " + car.carint);
			System.out.println("But, the cars string object member car.nameOfCar AFTER is " + car.nameOfCar);
	}

	public void methodPT ( Car car , int i){
		System.out.println("The cars primative int car.carint INSIDE method BEFORE adding is " + car.carint);
		System.out.println("The passed in primative int i INSIDE method BEFORE adding is " + i);
		i = i + 5;
		System.out.println("The passed in primative int i INSIDE method AFTER adding is " + i);
		System.out.println("But, the cars primative int car.carint INSIDE method AFTER adding still is " + car.carint);
		
		System.out.println("The cars object string car.nameOfCar member INSIDE method BEFORE adding is " + car.nameOfCar);
		car.nameOfCar = car.nameOfCar + " and this is added to the Car's member";
		System.out.println("The cars object string car.nameOfCar member INSIDE method AFTER adding is " + car.nameOfCar);
	}
	class Car {
		int carint;
		String nameOfCar;
		public Car (int i, String nameOfCar){
			this.carint = i;
			this.nameOfCar = nameOfCar;
		}
	}
}
