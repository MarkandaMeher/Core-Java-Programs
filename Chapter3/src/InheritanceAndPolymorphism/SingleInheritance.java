package InheritanceAndPolymorphism;

public class SingleInheritance {

}
class abc{
	int x;
}
class Example extends abc{
	int y;
	void assignValues(int x1,int y1) {
		x=x1;
		y=y1;
	}
	int sum() {
		return (x+y);
	}
	public static void main(String[] args) {
		Example ob = new Example();
		ob.assignValues(10, 15);
		System.out.println(ob.sum());
	}
}