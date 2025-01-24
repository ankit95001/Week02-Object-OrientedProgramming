/*
Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. 
Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
*/
package AssistedProblems;

class Animal{
	protected String name;
	protected int age;
	Animal(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void makeSound(){
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{
	Dog(String name,int age){
		super(name,age);
	}
	@Override
	public void makeSound(){
		System.out.println("Dogs make Bark sound");
	}
}

class Cat extends Animal{
	Cat(String name,int age){
		super(name,age);
	}
	@Override
	public void makeSound(){
		System.out.println("Cat make meao sound");
	}
}

class Bird extends Animal{
	Bird(String name,int age){
		super(name,age);
	}
	@Override
	public void makeSound(){
		System.out.println("Birds make cheep sound");
	}
}

public class AnimalHierarchy{
	public static void main(String[] args){
		Animal animal = new Animal("Animal",10);
		animal.makeSound();
		
		Animal dog = new Dog("Dog",5);
		dog.makeSound();
		
		Animal cat = new Cat("Cat",10);
		cat.makeSound();
		
		Animal bird = new Bird("Bird", 10);
		bird.makeSound();
		
	}
}
