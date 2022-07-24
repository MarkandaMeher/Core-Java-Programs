package BranchingStatements;

public class Questions {
	public static void main (String[]args)
	  {
	  label:	
	for(int i=0; i<2; i++)
	 {
	for(int j=0; j<2; j++)
	{
	System.out.println(i + ", "+ j); 
	  if(j!=2)
	 continue label;
	}
	 }
	  }
}

class Q2
{
  public static void main (String[]args)
  {
  label:
    for (int i = 0; i < 2; i++)
      {
	for (int j = 0; j < 2; j++)
	  {
	    if (j>0)
	      break label;
	    System.out.print(i+" ");
	  }
      }
  }
}

class Q3
{
  public static void main (String[]args)
  {
  label1:
    for (int i = 1; i <=2; i++)
      {
  label2:
	for (int j = 2; j <=5; j++)
	  {
	    System.out.print(j+" ");
	    if (j%2==0)
	      break label1;
	      else 
	      continue label2;
	  }
	   
      }
  }
}

class Q4
{
  public static void main (String[]args)
  {
      int i=1,j=1;
  label1:
    while(i<=2)
    {
        i++;
	  while(j<=2)
	  {
	  j++;
	  System.out.println(i);
	  if(i==j)
	  break label1;
	  }
      }
  }
}
