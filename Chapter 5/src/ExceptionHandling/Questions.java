package ExceptionHandling;

public class Questions {

}
class Test2 extends Exception { }
 class Maina {
   public static void main(String args[]) { 
      try {
         throw new Test2();
      }
      catch(Test2 t) {
    	  System.out.println(t);
         System.out.println("Got the Test Exception");
      }
      finally {
         System.out.println("Inside finally block ");
      }
  }
}

 
 
 class Test
 {   int count = 0;
     void A() throws Exception
     {
         try
         {
             count++;
             try
             {
                 count++;
  
                 try
                 {
                     count++;
                     throw new Exception();
                 }
                 catch(Exception ex)
                 {
                     count++;
                     throw new Exception();
                 }
             }
             catch(Exception ex)
             {
                 count++;
             }
         }        
         catch(Exception ex)
         {
             count++;
         }
     }
       
     void display()
     {
         System.out.println(count);
     }
     public static void main(String[] args) throws Exception
     {
         Test obj = new Test();
         obj.A();
         obj.display();
     }
 }
