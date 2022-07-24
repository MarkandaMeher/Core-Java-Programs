package NestedClassesinJava;

public class AnonymousInnerClassExamples {

}

//Java program to demonstrate need for Anonymous Inner class 
interface Age 
{ 
	int x = 21; 
	void getAge(); 
} 
class AnonymousDemo 
{ 
	public static void main(String[] args) 
	{ 
		// Myclass is implementation class of Age interface 
		MyClass obj=new MyClass(); 

		// calling getage() method implemented at Myclass 
		obj.getAge();	 
	} 
} 

//Myclass implement the methods of Age Interface 
class MyClass implements Age 
{ 
	@Override
	public void getAge() 
	{ 
		// printing the age 
		System.out.print("Age is "+x); 
	} 
} 


//java program to demonstrate Anonymous inner Class
interface Agee{
	int x =21;
	void getAge();
}

class Demoo{
	public static void main(String[] args) {
		Agee oj1 = new Agee() {
			public void getAge() {
				System.out.println("Age is "+x);
			}
		};
		oj1.getAge();
	}
}

// Extends a Class

class A{
	int x =12;
	void show() {
		System.out.println("Hello World");
	}
}

class Mains{
	public static void main(String[] args) {
		A ob = new A() {
			void show() {
				System.out.println("Overridden "+x);
			}
		};
		ob.show();
	}
}

// Implements an Interface

interface A2{
	int x = 13;
	void show();
}

class Main2{
	public static void main(String[] args) {
		A2 ob = new A2() {
			public void show() {
				System.out.println("Overridden "+x);
			}
		};
		ob.show();
	}
}

// Extends Abstract Class


abstract class Example{
	abstract void display();
}
class Main3{
	public static void main(String[] args) {
		Example ref = new Example() {
			void display() {
				System.out.println("Hello");
			}
		};
		ref.display();
	}
}





















