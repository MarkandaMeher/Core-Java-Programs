package NestedClassesinJava;

public class InnerLocalClassExample {

}
class abc{
	int a = 12,b =34;
	void calculate() {
		class def{
			int sumCalculate() {
				return (a+b);
			}
			int mulCalculate() {
				return (a*b);
			}
		}
		def ob = new def();
		System.out.println("Sum is "+ob.sumCalculate());
		System.out.println("Mul is "+ob.mulCalculate());
	}
}
class Main{
	public static void main(String[] args) {
		abc ob = new abc();
		ob.calculate();
	}
}