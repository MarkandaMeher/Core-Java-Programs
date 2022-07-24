package ObjectClassesMethodsAndConstructors;

public class Examples {
public static void main(String[] args) {
	System.out.println("Done");
}
}
/*
class Student{
	int id;
	String name;
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}

class Student2{  
	 int id;  
	 String name;  
	}  
	class Example2
	{  
	 public static void main(String args[]){  
	  Student2 s1=new Student2();  
	  s1.id=101;  
	  s1.name="rohit";  
	  System.out.println(s1.id+" "+s1.name);
	 }  
	} 



class Student{
	int rollno;
	String name;
	void insertRecord(int r,String n) {
		rollno = r;
		name = n;
	}
	void displayInformation() {
		System.out.println(rollno+" "+name);
	}
}
class TestStudent4{
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}
}


//Defining method with in the class in which main method is defined.

class Example
{
	int max (int a,int b)
	{
		return (a>b?a:b);
	}
	public static void main(String[] args)  
	{
	Example ob = new Example();
     System.out.println("Maximum of 12 and 34 is "+ ob.max(12,34));
	}
}


//Defining a static method with in the class in which main method is defined.
//When a method is defined as static method with in the same class in which // main method is defined. We need not to create object to call that method.
class Example
{
	static int max (int a,int b)
	{
		return (a>b?a:b);
	}
	public static void main(String[] args)  
	{
	System.out.println("Maximum of 12 and 34 is "+ max(12,34));
	}
}

class Rectangle{
 int length;  
 int width;  
 void insert(int l, int w)// method
{  
  length=l;  
  width=w;  
 }  
 void calculateArea() // method
{
System.out.println(length*width);
}  
}  

class TestRectangle1{  
 public static void main(String args[])
{  
  Rectangle r1=new Rectangle();  
  Rectangle r2=new Rectangle();  
  r1.insert(11,5);  
  r2.insert(3,15);  
  r1.calculateArea();  
  r2.calculateArea();  
}  
}  



class factorial
{

    double calculate(double x)
    {
        double i,f=1;
        for(i=1;i<=x;i++)
        f*=i;
        return f;
    }
}

class Example
{
	public static void main(String[] args)  
	{
     double f= new factorial().calculate(5); 
	System.out.println(f);	
	}
}



//Example of call by value Method

 class Main
{
  void byValue(int x)
  {
      x=x+10;
  }
	public static void main(String[] args) {
		Main obj=new Main();
		int x=12;
		System.out.println("Before method call:"+x);
		obj.byValue(x);
		System.out.println("After method call:"+x);
	}
}
//Before method call:12                                                                                                                                    
//After method call:12



//In java if we pass an object of the class then we can implement call by reference method. In case of call by reference original value is changed if we made changes in the called method.

class Example
{  
 int data=50;  
 void change(Example op)
{  
 op.data=op.data+100;//changes will be in the instance variable  
 }  
      public static void main(String args[])
 {  
	Example op=new Example();  
    System.out.println("before change "+op.data);  
   op.change(op);//passing object  
   System.out.println("after change "+op.data);  
  
 }  
} 




 class Main
{
    static int method(int arr[])	
	{
	    int sum=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        sum=sum+arr[i];
	    }
	    return sum;
	}
		public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		System.out.println("Sum of array elements is:"+method(a));
	}
}





 class Main
{
    static int method(int arr[])	
	{
	    int sum=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        sum=sum+arr[i];
	    }
	    return sum;
	}
		public static void main(String[] args) {
		System.out.println("Sum of array elements is:"+method(new int[]{1,2,3,4,5}));
	}
}


 class Main
 {
     static int[] method()	
 	{
       int a[]={1,2,3,4,5};
       return a;
 	}
 		public static void main(String[] args) {
 		int arr[]=method();
 		for(int i=0;i<arr.length;i++)
 		{
 		    System.out.println(arr[i]);
 		}
 	}
 }



//Java program to demonstrate varargs 
 class Main 
{ 
 // A method that takes variable number of integer arguments. 
 static void fun(int ...a) 
 { 
     System.out.println("Number of arguments: " + a.length); 
     // using for each loop to display contents of a 
     for (int i: a) 
     System.out.print(i + " "); 
     System.out.println(); 
 } 
 public static void main(String args[]) 
 { 
     // Calling the varargs method with different number 
     // of parameters 
     fun(100);         // one parameter 
     fun(1, 2, 3, 4);  // four parameters 
     fun();            // no parameter 
 } 
}
//Output:
//Number of arguments: 1                                                                                                                                   
//100                                                                                                                                                      
//Number of arguments: 4                                                                                                                                   
//1 2 3 4                                                                                                                                                  
//Number of arguments: 0




class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}
} 
//Output:
//22
//33



class Adder{  
static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
}  
class TestOverloading2{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(12.3,12.6));  
}} 
//Output:
//22
//24.9


class Adder{  
static int add(int a,int b){return a+b;}  
static double add(int a,int b){return a+b;}  
}  
class TestOverloading3{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));//ambiguity  
}} 
//Output:
//Compile Time Error: method add(int,int) is already defined in class Adder



class OverloadingCalculation1{
	  void sum(int a,long b){System.out.println(a+b);}
	  void sum(int a,int b,int c){System.out.println(a+b+c);}
	  public static void main(String args[]){
	  OverloadingCalculation1 obj=new OverloadingCalculation1();
	  obj.sum(20,20);//now second int literal will be promoted to long
	  obj.sum(20,20,20);
	  }
	}
//	Output:
//	40
//	60


class rectangle
{
    int l,b;
    rectangle(int x,int y)
    {
        l=x;
        b=y;
    }
    int area()
    {
        return l*b;
    }
}

class Example
{
public static void main(String[] args) {
		rectangle r1 = new rectangle(12,34), r2= new rectangle(34,56);
		System.out.println(r1.area());
		System.out.println(r2.area());
	}
}

*/

class sum
{
    sum(int x,int y)
    {
    System.out.println("Sum of 2 integers are "+(x+y));
    }
    sum(int x,int y,int z)
    {
    System.out.println("Sum of 3 integers are "+(x+y+z));
    }
    sum(double x,double y)
    {
    System.out.println("Sum of 2 doubles are "+(x+y));
    }  
}

class Example
{
	public static void main(String[] args) {
		sum s1 = new sum(12,34);
		sum s2 = new sum(12,34,67);
		sum s3 = new sum(12.56,34.78);
	}
}













