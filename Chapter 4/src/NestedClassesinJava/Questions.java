package NestedClassesinJava;

public class Questions {

}

/*
class As 
{
    private static int x=100;
    private String y="Hello";
    static class B 
    {
        void show()
        {
        System.out.print(x+" ");
        System.out.print(y);
        }
    }
}
 class Mainss
{
	public static void main(String[] args) {
		As.B ref=new As.B();
		ref.show();
	}
}
*/

/*
class As 
{
    private static int x=100;
    class B 
    {
    private int y=100;
    }
    void display()
    {
        System.out.println(x+y);
    }
}
class Mainss
{
	public static void main(String[] args) {
		As ref=new As();
		ref.display();
	}
}
*/

/*
class As 
{
    private static int x=10;
    class B 
    {
    private int y=20;
    void display()
    {
        System.out.println(x+y);
    }
    }
}
 class Mainss
{
	public static void main(String[] args) {
		As ref1=new As();
		As.B ref2=ref1.new B();
		ref2.display();
	}
}

*/
/*

class Example2 
{
    void show()
    {
        class Test
        {
            static int a=13;
            void display()
            {
                System.out.println(a);
            }
        }
        Test ob=new Test();
        ob.display();
    }
}
 class Mainss
{
public static void main(String[] args) 
	{
      Example2 obj=new Example2();
      obj.show();
	}
}

*/

/*
interface Example2
{
    int a=100;
    void show();
}
class Mainss
{
	public static void main(String[] args)
	{
Example2 ob = new Example2() // anonymous inner class
		{
		    static final int b=200;
		    public void show()
		    {
		        System.out.println(a+" "+b);
		    }
		};
		ob.show();
	}
}
*/

/*
abstract class ABCs
{
    abstract void show1();
    abstract void show2();
}
class Mainss
{
	public static void main(String[] args)
	{
ABCs ob = new ABCs() // anonymous inner class
		{
void show1(){ System.out.print("A "); }
void show2(){ System.out.print("B "); }
		};
		ob.show1();
		ob.show2();
	}
}

*/

/*
class outer 
{
    int x=2;
    static class inner 
    {
        int y=3;
        void display()
        {
        System.out.println(new outer().x+y);
        }
    }
}
 class Mainss
{
	public static void main(String[] args) {
	outer.inner ref=new outer.inner();
	ref.display();
	}
}

*/

/*
class As
{
    class B
    {
        static void methodB()
        {
            System.out.println("Method B");
        }
    }
}
 class Mainss 
{
public static void main (String[] args) 
{
As obj1=new As();
As.B obj2=obj1.new B();
}
}
*/

/*
class X
{
    static int x = 100;
     
    static class Y
    {
        static int y = x++;
         
        static class Z
        {
            static int z = y++;
        }
    }
}
 class Mainss
{
    public static void main(String[] args)
    {
        System.out.print(X.x+" ");
        System.out.print(X.Y.y+" ");
        System.out.print(X.Y.Z.z);
    }
}
*/

/*
class X
{   
    void methodX()
    {
        class Y
        {
            static void methodY()
            {
              System.out.println("Y");   
            }
        }
        Y.methodY();
    }
}
class Mainss 
{
    public static void main(String[] args)
    {
      new X().methodX();  
    }
}

*/









































































