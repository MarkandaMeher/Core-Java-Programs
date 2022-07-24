package BranchingStatements;

public class Break {
	public static void main(String[] args) 
	{		
		for(int i=0; i<100; i++) 			  
				{				
			if(i == 10) 	
			break; 								
			System.out.println("i: " + i);			    					}			 
		System.out.println("Loop completed");
	}
}

class Example
{
public static void main(String[] args)
	{
	outer:	
	for(int i=0; i<3; i++)
	{
	System.out.println("Outer "+ i);
	inner:
	for(int j=0; j<3; j++)
	{
	System.out.println("Inner "+j);
	if(i== j+1)
	break outer;		   
	System.out.println("Bye");	
	}
	}
    	}
}

class Example2
{
public static void main(String[] args)
  {
	int i;
	for(i=1;i<=10;i++)
	{
	 if(i==5)
	 continue;
	System.out.println(i);
	}
    }
}


class Main
{
  public static void main (String[]args)
  {
  loop:
    for (int i = 0; i < 2; i++)
      {
	for (int j = 0; j < 5; j++)
	  {
	    if (j == 2)
	      continue loop;
	      System.out.println ("i =" + i + " j =" + j);
	  }
      }
    System.out.println ("Out of the loop");
  }
}
