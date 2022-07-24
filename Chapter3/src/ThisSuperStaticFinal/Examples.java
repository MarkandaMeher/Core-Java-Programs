package ThisSuperStaticFinal;

public class Examples {

}
class Test
{
	public static void main(String[] args) {
		final int x=10;
		x=x+1;//Compilation error, as we are trying to modify the final variable(constant)
		System.out.println(x);
	}
}
final class A 
{
    
}
class B extends A // Compilation error [A is final and non-inheritable]
{
    
}
class Test2
{
	public static void main(String[] args) {
		B obj=new B();
	}
}

class A2 
{
    final void show()
    {
        System.out.println("A");
    }
}
class B2 extends A2 
{
    void show()//Compilation Error:show() in B cannot override show() in A(Overridden method is final)
    {
        System.out.println("B");
    }
}
 class Test3
{
	public static void main(String[] args) {
		B2 obj=new B2();
		obj.show();
	}
}
 
 final class Employee{  
	 final String pancardNumber;  
	 public Employee(String pancardNumber){  
	 this.pancardNumber=pancardNumber;  
	 }  
	 public String getPancardNumber(){  
	 return pancardNumber;  
	 }
	 }  
	 class Main
	 {
	     public static void main(String[] args)
	     {
	         Employee obj=new Employee("123");
	         System.out.println(obj.getPancardNumber());
	     }
	 }


	 
	/* 
	 class ThisDemo1{
         int a = 0;
         int b = 0;
         ThisDemo1(int x, int y)
	{
	    this.a = x;
	    this.b = y;
	}

         public static void main(String [] args)
	 {
	     ThisDemo1 td = new ThisDemo1(10,12);
	     ThisDemo1 td1 = new ThisDemo1(100,23);
	     System.out.println(td.a); 
	     System.out.println(td.b);
	     System.out.println(td1.a);
	     System.out.println(td1.b);
	     }
    }
    
    */
	
	 
	// Java program to illustrate Constructor Chaining within same class Using this() keyword 
	  class Temp 
	 { 
	 	// default constructor 1 
	 	// default constructor will call another constructor 
	 	// using this keyword from same class 
	 	Temp() 
	 	{ 
	 		// calls constructor 2 
	 		this(5); 
	 		System.out.println("The Default constructor"); 
	 	} 
	 // parameterized constructor 2 
	 	Temp(int x) 
	 	{ 
	 		// calls constructor 3 
	 		this(5, 15); 
	 		System.out.println(x); 
	 	} 

	 // parameterized constructor 3 
		Temp(int x, int y) 
		{ 
			System.out.println(x * y); 
		} 

		public static void main(String args[]) 
		{ 
			// invokes default constructor first 
			new Temp(); 
		} 
	} 


	 
	  class As 
	  {
	      As(int x)
	      {
	          System.out.println(x);
	      }
	  }
	  class Bs extends As 
	  {
	      Bs(int x,int y)
	      {
	          super(x);
	          System.out.println(x+" "+y);
	      }
	  }

	  class Cs extends Bs 
	  {
	      Cs(int x,int y,int z)
	      {
	          super(x,y);
	          System.out.println(x+" "+y+" "+z);
	      }
	  }
	  class Main2 
	  { 
	  	public static void main(String args[]) 
	  	{ 
	  		Cs obj=new Cs(1,2,3);
	  	} 
	  } 


	  
	  class T2 { 
	        static int triple (int n) 
		{return 3*n;}
	     } 

	  class T1 { 
	         public static void main(String[] arg) 
		{  
		    System.out.println( T2.triple(4) ); 
	           	    T2 x1 = new T2(); 
		    System.out.println( x1.triple(5) ); 
		} 
	       }

	  
	  
	  class T22 { 
			int x = 3; 
			static int returnIt () { return x;} 
		           } 

	         class T12 { 
			public static void main(String[] arg) { 				
				System.out.println( T22.returnIt() ); } 
		          }
 