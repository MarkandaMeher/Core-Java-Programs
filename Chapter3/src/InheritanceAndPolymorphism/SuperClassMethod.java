package InheritanceAndPolymorphism;

public class SuperClassMethod {

}
class person{
	int id;
	String name;
	void getData(int x,String y) {
		id=x;
		name =y;
	}
}
class emp extends person{
	float salary;
	void getData(int a, String b, float c) {
		super.getData(a, b);
		salary = c;
	}
	void show() {
		System.out.println(id+" "+name+" "+salary);
	}
}
class Main{
	public static void main(String[] args) {
		emp e = new emp();
		e.getData(1, "meher", 56000);
		e.show();
	}
}
