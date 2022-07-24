package ControlStructures;

public class Questions2 {
	public static void main(String[] args)
	{
	int i=5;
	while(i)
	{
	System.out.println("Hello");
	i--;
	}
	}
}

class Q22
{
public static void main(String[] args)
{
int x=5,sum=0;
boolean y=true;
while(y)
{
sum=sum+x;
x--;
if(x==3)
y=!y;
}
System.out.println(sum);
}
}

class Q33
{
public static void main(String[] args)
{
int x=5,y=1;
while(--x!=++y);
System.out.println(x+y);
}
}

class Q44
{
public static void main(String[] args)
{
int k=1;
for(int i=1,j=2;i>=1 & i<=3;i++,j++)
{
k=k*j;
}
System.out.println(k);
}
}

class Q55
{
public static void main(String[] args)
{
int i=24;
for(;i>1;i>>=2)
{
System.out.println("Hello");
}
}
} 

