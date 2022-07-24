package Variables;

public class Questions {
	public static void main(String [] args)
	{
		 public int x = 10;
		System.out.print(x);
	}
}
//Q2
class VariableDemo
{
   static int x=10;
   public static void main(String [] args)
	{
		 int x;
		System.out.print(x);	
	}
}
//Q3
class Q3
{
   static int x=5;
   public static void main(String [] args)
	{
		 int x;
		System.out.print(Q3.x);	
	}
}
//Q4
class Main
{
    static int x;
    void increment()
    {
        System.out.print(x);
        x--;
    }
	public static void main(String[] args) {
		Main obj1=new Main();
		Main obj2=new Main();
		obj1.increment();
		obj2.increment();
	}
}
//Q5
class Main2
{
     int x;
    void increment()
    {
        System.out.print(x+" ");
        x=x+2;
    }
	public static void main(String[] args) {
		Main2 obj1=new Main2();
		Main2 obj2=new Main2();
		obj1.increment();
		obj2.increment();
	}
}
