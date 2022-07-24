package InterfacesAndLamdaExpression;

public class LambdaExpression {

}
interface Aa{
	void cube(int x);
}
class Main3{
	public static void main(String[] args) {
		Aa ob = (x)-> System.out.println("Cube is "+(x*x*x));
		ob.cube(5);
	}
}

interface A2{
	void cube(int x,int y);
}
class Main4{
	public static void main(String[] args) {
		A2 ob = (x,y)->System.out.println("Sum is "+(x+y));
		ob.cube(5, 6);
	}
}

interface A3{
	void calculate(int x,int y);
}
class Main5{
	public static void main(String[] args) {
		A3 add = (x,y)->System.out.println("Sum is "+(x+y));
		A3 sub = (x,y)->System.out.println("Sub is "+(x-y));
		add.calculate(12, 34);
		sub.calculate(12, 34);
	}
}


//Demonstrate a lambda expression that takes a parameter.
interface NumericTest {
boolean test(int n);
}
 class Main6 {
public static void main(String args[])
{
//A lambda expression that tests if a number is even.
int num=12;
//NumericTest isEven = (int n) -> (n % 2)==0;//We can specify the type in left side
NumericTest isEven = (n) -> (n % 2)==0;//We can skip the type in left side 
//NumericTest isEven =  n -> (n % 2)==0;//When there is one argument, we can remove brackets also
if(isEven.test(num)) 
System.out.println("num is even");
else 
System.out.println("num is odd");
NumericTest isnum=(n)->n>=0;
if(isnum.test(num))
System.out.println("Number is non-negative");
else
System.out.println("Number is negative");
}
}
 
//A block lambda that computes the factorial of an int value.
interface NumericFunc {
int func(int n);
}
 class Main7 {
public static void main(String args[])
{
//This block lambda computes the factorial of an int value.
NumericFunc factorial = (n) -> {
int result = 1;
for(int i=1; i <= n; i++)
result = i * result;
return result;
};
System.out.println("The factoral of 3 is " + factorial.func(3));
System.out.println("The factoral of 5 is " + factorial.func(5));
}
}
