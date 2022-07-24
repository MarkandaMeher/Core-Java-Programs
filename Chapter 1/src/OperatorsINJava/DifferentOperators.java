package OperatorsINJava;

public class DifferentOperators {
public static void main(String[] args) {
	int a=10;  
	int b=5;  
	System.out.println(a+b);//15  
	System.out.println(a-b);//5  
	System.out.println(a*b);//50  
	System.out.println(a/b);//2  
	System.out.println(a%b);//0
}
}
class RelationalOperators
{
	public static void main(String args[])
	{
	int a=10;  
	int b=5;  
	System.out.println(a>b);//true  
	System.out.println(a<b);//false
	System.out.println(a==b);//false 
	System.out.println(a!=b);//true
	}
}
class Unary
{
	public static void main(String args[])
	{
	int x=10;  
	System.out.println(x++);//10 (11)  
	System.out.println(++x);//12  
	System.out.println(x--);//12 (11)  
	System.out.println(--x);//10  
	}
}
class LogicalAndShortCircuited
{
	public static void main(String args[])
	{
	int a=10;  
	int b=5;  
	int c=20; 
	System.out.println(a>b||a++<c);// true  
	System.out.println(a);//10 because second condition is not checked  
	System.out.println(a>b|a++<c);//true | true = true  
	System.out.println(a);//11 because second condition is checked  
	}
}
class LogicalAndCircuited
{
	public static void main(String args[])
	{
	int a=10;  
	int b=5;  
	int c=20;  
	System.out.println(a<b&&a++<c);//false  
	System.out.println(a);//10 because second condition is not checked  
	System.out.println(a<b&a++<c);//false & true = false  
	System.out.println(a);//11 because second condition is checked  
	}
}
class Bitwise
{
	public static void main(String args[])
	{
	byte a=4; // 00000100
	byte b=5; // 00000101
	System.out.println(a&b);//(00000100)4
	System.out.println(a|b);//(00000101)5
	System.out.println(a^b);//(00000001)1
	}
}
//To show the working of  << and >> operator for Positive number
class shift
	{
		public static void main(String args[])
		{
		byte x=10;  
		System.out.println(x<<2);// 10*2^2=40
		System.out.println(x>>2);// 10/2^2=2
		}
	}
//To show the working of  << and >> operator for negative
class shift2
	{
		public static void main(String args[])
		{
		byte x=-10;  
		System.out.println(x<<2);// 10*2^2=-40
		System.out.println(x>>2);// 10/2^2 -1=-3[-1 will be added if not completely divisible,otherwise Number/2^no.of bits]
		}
	}

 