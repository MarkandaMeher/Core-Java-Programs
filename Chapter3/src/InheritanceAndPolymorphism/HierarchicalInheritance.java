package InheritanceAndPolymorphism;

public class HierarchicalInheritance {

}
class A{
	int x;
}
class B extends A{
	int y;
	void assignValues(int a, int b) {
		x=a;
		y=b;
	}
	int sum() {
		return x+y;
	}
	
}
class C extends A{
	int z;
	void assignValues(int a,int b) {
		x=a;
		z=b;
	}
	int product() {
		return x*z;
	}
	public static void main(String[] args) {
		B ob1 = new B();
		ob1.assignValues(10, 20);
		System.out.println(ob1.sum());
		C ob2 = new C();
		ob2.assignValues(10, 20);
		System.out.println(ob2.product());
	}
}