package com.poly;

public class ClientAnimalClass {

	public static void main(String[] args) {
		Animal animalAnimal = new Animal();
		System.out.println("I am an Animal: " + animalAnimal.makeSound());
		
		Dog dog = new Dog();
		System.out.println("I am a Dog: " + dog.makeSound());
		System.out.println("I am a Dog and I can hunt: " + dog.huntMeat());
		
		Animal animalDogAsAnimal =  (Animal)dog;
		System.out.println("I am still a Dog cast to an Animal: " + animalDogAsAnimal.makeSound() + " but I cant huntFood because my reference var is Animal");
		
		
		Dog againADog = (Dog)animalDogAsAnimal;//only dogs can be cast down to dogs if i was just a Animal this would not work
		System.out.println("I a Dog reference again so I can hunt food: " + againADog.huntMeat());
		
		

	}

}
