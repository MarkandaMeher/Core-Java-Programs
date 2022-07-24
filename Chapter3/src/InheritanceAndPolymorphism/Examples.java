package InheritanceAndPolymorphism;

public class Examples {

}
class Employee{
	float salary =40000;
}
class Progammer extends Employee{
	int bonus = 1000;
	public static void main(String[] args) {
		Progammer p = new Progammer();
		System.out.println(p.salary+" "+p.bonus);
	}
}