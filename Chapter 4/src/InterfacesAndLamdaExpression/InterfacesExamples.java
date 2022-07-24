package InterfacesAndLamdaExpression;

public class InterfacesExamples {

}
interface Shape{
	int l = 12,b = 34;
	void area();
	default void msg() {
		System.out.println("Welcome to interfaces");
	}
}
class Rectangle implements Shape{
	public void area() {
		System.out.println("Area of rec is +"+l*b);
	}
}
class Circle implements Shape{
	float r;
	Circle(float r){
		this.r = r;
	}
	public void area() {
		System.out.println("Area of cir is + "+3.14*r*r);
	}
}
class Main{
	public static void main(String[] args) {
		Shape r = new Rectangle();
		r.msg();
		r.area();
		r = new Circle(2.34f);
		r.area();
	}
}