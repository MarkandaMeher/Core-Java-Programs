package NestedClassesinJava;

public class StaticNestedClasses {

}
class OuterClass{
	static int outer_x= 10;
	int outer_y=20;
	private static int outer_private = 30;
	
	static class StaticNestedClass{
		 void display() {
			//can access static member of outer class
			System.out.println("Outer_x="+outer_x);
			
			//can access display private static member of outer class
			System.out.println("outer_pirvate = "+outer_private);
			
			//The following statement will give complication error
			//as static nested class cannot directly access non-static members
//			System.out.println("outer_y = "+outer_y);
			
		}
	}
}

class Demo{
	public static void main(String[] args) {
		OuterClass.StaticNestedClass ob = new OuterClass.StaticNestedClass();
		ob.display();
		//OuterClass.StaticNestedClass.display(); if display is static
	}
}