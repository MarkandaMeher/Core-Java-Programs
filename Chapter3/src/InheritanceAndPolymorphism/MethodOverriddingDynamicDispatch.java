package InheritanceAndPolymorphism;

public class MethodOverriddingDynamicDispatch {

}
class A4 
{ 
	void m1() 
	{ 
System.out.println("Inside A's m1 method"); 
	} 
} 

class B4 extends A4 
{ 
	// overriding m1() 
	void m1() 
	{ 
System.out.println("Inside B's m1 method"); 
	} 
} 

class C4 extends A4 
{ 
	// overriding m1() 
	void m1() 
	{ 
System.out.println("Inside C's m1 method"); 
	} 
} 
//Driver class 
class Dispatch 
{ 
public static void main(String args[]) 
	{ 
	A4 a = new A4(); 
	B4 b = new B4(); 
	C4 c = new C4(); 
	// obtain a reference of type A 
	A4 ref; 
	// ref refers to an A object 
	ref = a; 
	// calling A's version of m1() 
	ref.m1(); 
	ref = b; 
	ref.m1(); 
	ref = c; 
	ref.m1(); 
	} 
} 



