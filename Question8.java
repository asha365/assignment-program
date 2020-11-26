//8. Write a program to give a simple example for abstract class.

abstract class Animal{
	String name;
	abstract String sound(); //all classes that implement Animal must have a sound method
}
class Cat extends Animal{
	public Cat(){
		this.name = "Tomy";
	}
	public String sound(){
		return "Meow! (This is abstraction Example)";
	}
}
public class Question8{
	public static void main (String args[]){
		Cat cat = new Cat();
		System.out.println("Sound of cat is "+cat.sound());
	}
}