package ControlStructures;

public class Iteration {
	public static void main(String[] args) {
		int n =10;
		char a ='G';
		while(n>0) {
			System.out.println(a);
			n--;
			a++;
		}
	}
}

class NoBody {
public static void main(String args[]) {
int i, j;
i = 100;
j = 200;
// find midpoint between i and j
while(++i < --j); // no body in this loop
System.out.println("Midpoint is " + i);//150 is output[i=150,j=150]
}
}

class dowhileloopDemo 
{ 
	public static void main(String args[]) 
	{ 
		int x = 21; 
		do
		{ 
			// The line will be printed even 
			// if the condition is false 
			System.out.println("Value of x:" + x); 
			x++; 
		} 
		while (x < 20); 
	} 
} 

class ForTable
{
	public static void main(String args[])
	 {
		int n; 
		int x=5;
		for(n=1; n<=10; n++) 
		  {	
		   int p = x*n; 
		   System.out.println(x+"*"+n +"="+ p);
		  } 
	}
}

class ForVar {
public static void main(String args[]) {
int i;
boolean done = false;
i = 0;
for( ; !done; ) {
System.out.println("i is " + i);
if(i == 10) done = true;
i++;
}
}
}

class Comma {
public static void main(String args[]) {
int a, b;
for(a=1, b=4; a<b; a++, b--) {
System.out.println("a = " + a);
System.out.println("b = " + b);
}
}
}
