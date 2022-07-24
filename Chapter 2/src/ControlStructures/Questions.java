package ControlStructures;

public class Questions {
	public static void main(String[] args)
	{
	boolean x=true;
	int a=10;
	if(x)
	a++;
	else
	a--;
	System.out.println(a);
	}

}

class Q2
{
public static void main(String[] args)
{
float x=3.45f;
if(x==3.45f)
System.out.println("Hello");
else
System.out.println("World");
}
}

class Q3
{
public static void main(String[] args)
{
int a=10;
if(a==11);
System.out.println(++a);
}
}

class Q4
{
public static void main(String[] args)
{
int a=9;
if(a>9)
if(a%2==0)
System.out.println("Hi");
else
System.out.println("Hello");
else
System.out.println("Bye");
}
}

class Q5
{
public static void main(String[] args)
{
int a=1;
switch(a)
{
case 1:
a=a+2;
case 2:
a=a*3;
case 3:
a=a/2;
break;
case 4:
a=100;
break;
default:
a=-99;
}
System.out.println(a);
}
}

/* class Q6
{
public static void main(String[] args)
{
int a=1;
switch(a)
{
case 1:
a=12;
break;
case 2-1:
a=13;
break;
case 3:
a=14;
break;
}
System.out.println(a);
}
}

*/

class Q7
{
public static void main(String[] args)
{
char c='B';
switch(c)
{
case 65:
System.out.print("1");
case 66:
System.out.print("2");
case 67:
System.out.print("3");
break;
}
}
}
