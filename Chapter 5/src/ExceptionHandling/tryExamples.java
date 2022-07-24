package ExceptionHandling;

public class tryExamples {

}
class try1{
	public static void main(String[] args) {
		int d,a;
		try {
			d=0;
			a = 34/d;
			System.out.println("This will not be Printed");
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero.");
		}
		System.out.println("After catch Statement");
	}
}

class try2 
{
public static void main(String args[]) 
{
int d, a;
d = 0;
a = 42 / d;//Exception will be raised here and message after this will not be printed, as program will be terminated
System.out.println("Statement after expression");
}
}

class TryCatches {  
    public static void main(String[] args) {  
           try{ 
               String x="ABC";
                int a[]=new int[5];    
                 a[0]=30/0;//It will raise ArithmeticException    
                //System.out.println(a[7]);//It will raise ArrayIndexOutOfBoundsException
                //System.out.println(Integer.parseInt(x));//It can raise NumberFormatException, but its specific catch is not written so catch with Exception class will work
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }    
               System.out.println("rest of the code");    
    }  
}

//Demonstrate the multi-catch feature.
 class Multicatch {
public static void main(String args[]) {
int a=10, b=0;
int vals[] = { 1, 2, 3 };
try {
int result = a / b; // generate an ArithmeticException
//vals[10] = 19; // generate an ArrayIndexOutOfBoundsException
//This catch clause catches both exceptions.
} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
System.out.println("Exception caught: " + e);
}
System.out.println("After multi-catch.");
}
}

 
 
 class TryExample1 {  
	    public static void main(String[] args) {  
	           try{ 
	               String x="ABC";
	                int a[]=new int[5];    
	                 a[0]=30/0;//It will raise ArithmeticException    
	                //System.out.println(a[7]);//It will raise ArrayIndexOutOfBoundsException
	                //System.out.println(Integer.parseInt(x));//It can raise NumberFormatException, but its specific catch is not written so catch with Exception class will work
	               }  
	               catch(Exception e)  
	                  {  
	                   System.out.println("Parent Exception occurs");  
	                  }  
	               catch(ArithmeticException e)  
	                  {  
	                   System.out.println("Arithmetic Exception occurs");  
	                  }    
	               catch(ArrayIndexOutOfBoundsException e)  
	                  {  
	                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
	                  }    
	               System.out.println("rest of the code");    
	    }  
	}
	//Here compilation error will come, as general catch handler with super class is written first and then the subclass catches are written

 
 class NestedTry{  
	 public static void main(String args[]){  
	  try{  
	      int arr[]=new int[5];
	    try{  
	     System.out.println("going to divide");  
	     int b =39/0;  
	    }catch(ArithmeticException e){System.out.println(e+" inner");}  
	   
	    try{  
	    int a[]=new int[5];  
	    a[5]=4;  
	    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e+" inner");}  
	     
	    System.out.println(arr[6]);  
	  }catch(Exception e){System.out.println(e+" outer");}  
	  System.out.println("After try catch");  
	 }  
	}  

