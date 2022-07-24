package InheritanceAndPolymorphism;

public class MultilevelInheritance {

}
class A{
	int x;
}
class B extends A{
	int y;
}
class C extends B{
	int z;
	void assignValues(int a,int b, int c) {
		x=a;
		y=b;
		z=c;
	}
	int sum() {
		return x+y+z;
	}
	public static void main(String[] args) {
		C ob = new C();
		ob.assignValues(10, 20, 30);
		System.out.println(ob.sum());
	}
}