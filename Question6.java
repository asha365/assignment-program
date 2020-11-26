//6. Create class named as a and create a sub class b. Which is extends
//from class a. And use these classes in inherit class.

class A{
	void eat(){System.out.println("Eating!!!");}
}
class B{
	void bark(){System.out.println("Barking!!!");}
}

class Cat extends A{
	void meow(){System.out.println("meowing!!!");}
}

class Question6{
	public static void main(String args[]){
		Cat c = new Cat();
		c.meow();
		c.eat();

		
	}
}