package com.poly;


public class Dog extends Animal implements Hunter {

	public String makeSound(){
	//System.out.println("woof");
	return "woof";
}
	public String huntMeat(){
		//System.out.println("foodHunter");
		return "foodHunter";
	}
}
