package assignment2;


abstract class Animal {
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Zzz");
	}
}


class Dog extends Animal {
	public void animalSound() {
		System.out.println("Bow Bow");
	}
}

class Assigment2Q4 {
	public static void main(String[] args) {
		Dog myDog = new Dog(); 
		myDog.animalSound();
		myDog.sleep();
	}
}