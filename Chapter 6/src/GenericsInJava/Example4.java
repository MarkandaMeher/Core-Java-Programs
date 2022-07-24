package GenericsInJava;

public class Example4 {

}
//A Simple Java program to show working
//of user-defined Generic classes

//We use < > to specify Parameter type
class Tests<T>
{
	// An object of type T is declared
	T obj;
	Tests(T obj) { this.obj = obj; } // constructor
	public T getObject() { return this.obj; }
}

//Driver class to test above
class Main5
{
	public static void main (String[] args)
	{
		// instance of Integer type
		Tests <Integer> iObj = new Tests<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Tests <String> sObj =new Tests<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		iObj = sObj; //This results an error
	}
}
