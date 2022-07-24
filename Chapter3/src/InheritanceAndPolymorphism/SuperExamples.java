package InheritanceAndPolymorphism;

public class SuperExamples {

}
class Person{
	int id;
	String name;
	Person(int x,String b){
		id=x;
		b=name;
	}
}
class Emp extends Person{
	int salary;
	Emp(int a,String b,int c){
		super(a,b);
		salary=c;
	}
	void Display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
class Main{
	public static void main(String[] args) {
		Emp e1 = new Emp(1,"meher",5000);
		e1.Display();
	}
}