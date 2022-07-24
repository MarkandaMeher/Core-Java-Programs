package GenericsInJava;

public class Example3 {

}
//A Simple Java program to show working of user defined
//Generic functions
class Test3
{	static <T> void genericDisplay (T element)
	{
	System.out.println(element.getClass().getName() +" = " + element);
	}
	public static void main(String[] args)
	{
		// Calling generic method with Integer argument
		genericDisplay(11);

		// Calling generic method with String argument
		genericDisplay("Hello");

		// Calling generic method with double argument
		genericDisplay(1.0);
	}
}
