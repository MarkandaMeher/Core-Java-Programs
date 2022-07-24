package InheritanceAndPolymorphism;

public class MethodOverloading {

}
//CompileTime Polymorphism

class A2{
	static int Multiply(int a, int b) {
		return a*b;
	}
	static double Multiply(double a, double b) {
		return a*b;
	}
}
class Main2{
	public static void main(String[] args) {
		System.out.println(A2.Multiply(2, 3));
		System.out.println(A2.Multiply(2.2, 5.5));
	}
}