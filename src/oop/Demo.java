package oop;

class Person {

	String name;
	String email;
	String phone;

	void walk() {
		System.out.println(name + " is walking");

	}

	void eat() {
		System.out.println(name + " is eating");

	}

	void sleep() {
		System.out.println(name + " is sleeping");

	}
}

public class Demo {

	public static void main(String[] args) {
		
		// Instantiating an object
		Person person = new Person();
		
		// Define some properties
		person.name = "Joe";
		person.email = "joe@testemail.com";
		person.phone = "7656578289";
		
		//Abstraction
		person.walk();
		person.eat();
		person.sleep();
		
		/*
		// Person

		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7656578289";

		// Action, Activity, behavior
		// System.out.println(name +" is walking");
		walking(name);
		System.out.println(name + " is eating");

		// what if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "9646787828";

		// Action, Activity, behavior
		// System.out.println(name2 +" is walking");
		walking(name2);
		System.out.println(name2 + " is eating");

		// What about binding attributes and properties together
      */
	}
 
	/*
	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
	}
	*/

}
