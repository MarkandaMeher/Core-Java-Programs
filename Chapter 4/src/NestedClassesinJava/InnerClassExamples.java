package NestedClassesinJava;

public class InnerClassExamples {

}

//Example 1
class OuterClass2{
	int outer_x = 10;
	static int outer_y = 20;
	private int outer_P = 30;
	
	class InnerClass{
		void display() {
			System.out.println("Outer_x ="+outer_x);
			System.out.println("Outer_y = "+outer_y);
			System.out.println("Outer_P = "+outer_P);
		}
	}
}

class InnerClassDemo{
	public static void main(String[] args) {
		OuterClass2 ob = new OuterClass2();
		OuterClass2.InnerClass obb = ob.new InnerClass();
		obb.display();
	}
}

//Example 2
class TestMemberOuter1{
	private int data = 30;
	class inner{
		void msg() {
			System.out.println("data is "+data);
		}
	}
	void display() {
		inner in = new inner();
		in.msg();
	}
	public static void main(String[] args) {
		TestMemberOuter1 obj1 = new TestMemberOuter1();
		obj1.display();
	}
}

























