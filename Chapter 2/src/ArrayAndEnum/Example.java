package ArrayAndEnum;

import java.util.Scanner;

public class Example {
	public static void main(String args[])
	{
		int a[] = new int[5];
		a[0]=12;a[1]=34;a[2]=56;a[3]=78;a[4]=90;
		System.out.println("Length of the array is "+a.length);
		System.out.println("Printing the elements of array");
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}

}

class Example2
{
    public static void main(String args[])
	{
		int n;// number of elements in array
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		n=ob.nextInt();
		int a[] = new int[n];
		System.out.println("Enter"+n+"elements of array");
		for(int i=0;i<a.length;i++)
		a[i]=ob.nextInt();
		System.out.println("Printing the elements of array");
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
}

class Example3{
	public static void main(String[] args) {
		int []a = new int[] {1,2,3,4,5};
		for(int i : a)
			System.out.println(i);
	}
}

class Example4
{
    public static void main(String args[])
	{
		int i;
		String s[] = new String[5];
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the 5 strings");
		for(i=0;i<s.length;i++)
		s[i]=ob.nextLine();
		System.out.println("5 strings are");
		for(String x : s)
		System.out.println(x);
	}
}

class TwoDimArr
{
   public static void main(String args[])
	 {
	    int twoD[][]= new int[4][5];
	    int i, j, k = 0;
	    for(i=0; i<4; i++)
	          for(j=0; j<5; j++) 
		{
		   twoD[i][j] = k;
		   k++;
		}
	          for(i=0; i<4; i++) 
		{
	          for(j=0; j<5; j++)
		   System.out.print(twoD[i][j] + " ");
		   System.out.println();
		}
	   }
}


class Matrix {
	public static void main(String args[]) {
		double m[][] = {
					{ 0*0, 1*0, 2*0, 3*0 },
					{ 0*1, 1*1, 2*1, 3*1 },
					{ 0*2, 1*2, 2*2, 3*2 }, 
					{ 0*3, 1*3, 2*3, 3*3 }
				};
		int i, j;
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
				}
			}
		}


//Program to demonstrate 2-D jagged array in Java
class Jagged2DArray
{
	public static void main(String[] args)
	{
		int arr[][] = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		int count = 0;
		for (int i=0; i<arr.length; i++)
			for(int j=0; j<arr[i].length; j++)
				arr[i][j] = count++;
		System.out.println("Contents of 2D Jagged Array");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
}

//Java program to demonstrate 
//cloning of one-dimensional arrays 
class Test 
{	 
	public static void main(String args[]) 
	{ 
		int intArray[] = {1,2,3}; 
		int cloneArray[] = intArray.clone(); 
		// will print false as deep copy is created 
		// for one-dimensional array 
		System.out.println(intArray == cloneArray); 
		for (int i = 0; i < cloneArray.length; i++) { 
			System.out.print(cloneArray[i]+" "); 
		} 
	} 
} 

//Java program to demonstrate 
//cloning of multi-dimensional arrays 
class Test2 
{	 
	public static void main(String args[]) 
	{ 
		int intArray[][] = {{1,2,3},{4,5}}; 
		int cloneArray[][] = intArray.clone(); 
		// will print false 
		System.out.println(intArray == cloneArray); 
		// will print true as shallow copy is created 
		// i.e. sub-arrays are shared 
		System.out.println(intArray[0] == cloneArray[0]); 
		System.out.println(intArray[1] == cloneArray[1]); 
	} 
} 
