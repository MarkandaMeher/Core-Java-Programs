package ArrayAndEnum;

public class EnumExamples {
public static void main(String[] args) {
	System.out.println("Nothing");
}
}

enum Color{
	RED,GREEN,BLUE;
}
class Tests{
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println(c1);
	}
}

class Example22
{
	public static void main(String args[])
	{
	enum session {WINTER,SUMMER,FALL}
	for(session s : session.values())
	System.out.println(s);
	}
}

enum session {WINTER,SUMMER,FALL}
class Example33
	{
		public static void main(String args[])
		{
		for(session s : session.values())
		System.out.println(s);
		}
	}


//Working of values(), valueOf() and ordinal() method
class Example44
	{
		public enum Season { WINTER, SPRING, SUMMER, FALL }  
		public static void main(String[] args) {  
	
		for (Season s : Season.values()){  
			System.out.println(s);  
			}  
		System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
		System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
		System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
	}
}

//An enumeration of apple varieties.
enum Apple {
Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class MainExample {
public static void main(String args[])
{
Apple ap;
ap = Apple.RedDel;
//Use an enum to control a switch statement.
switch(ap) {
case Jonathan:
System.out.println("Jonathan is red.");
break;
case GoldenDel:
System.out.println("Golden Delicious is yellow.");
break;
case RedDel:
System.out.println("Red Delicious is red.");
break;
case Winesap:
System.out.println("Winesap is red.");
break;
}
}
}


//Use an enum constructor, instance variable, and method.
enum Apple2 {
Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
private int price; // price of each apple
//Constructor
Apple2(int p) { price = p; }
int getPrice() { return price; }
}
class Main0 {
public static void main(String args[])
{
Apple2 ap;
//Display price of Winesap.
System.out.println("Winesap costs " +Apple2.Winesap.getPrice() +" cents.\n");
//Display all apples and prices.
System.out.println("All apple prices:");
for(Apple2 a : Apple2.values())
System.out.println(a + " costs " + a.getPrice() +" cents.");
}
}



