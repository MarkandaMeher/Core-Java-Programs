package InheritanceAndPolymorphism;

public class AbstractExamples {

}
abstract class A5{
	abstract void callme();
	void callmetoo() {
		System.out.println("This is a concrete method");
	}
}
class B5 extends A5{
	void callme() {
		System.out.println("B's implementation of callme");
	}
}
class ABstractDemo{
	public static void main(String[] args) {
		B5 b = new B5();
		b.callme();
		b.callmetoo();
	}
}


//to show the working of abstract class
abstract class Shape
{
 int l,b;
 double r;
 abstract void area();
}
class Rectangle extends Shape
{
 Rectangle(int x,int y)
 {
     l=x;
     b=y;
 }
 void area()
 {
     System.out.println(l*b); 
 }
}

class Circle extends Shape
{
    Circle(double y)
    {
        r=y;
    }
    void area()
    {
        System.out.println("Area of circle  is "+ (3.14*r*r));
    }
}
 class Test
{
public static void main(String[] args) {
Shape s;// Null
s= new Rectangle(12,34);
s.area();
s= new Circle(34.56);
s.area();
}
}



