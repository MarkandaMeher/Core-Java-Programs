package FileHandling;
import java.io.*;
public class PrintWriterExample {
public static void main(String[] args) {
	PrintWriter pw = new PrintWriter(System.out,true);
	pw.println("Using Pring Writer Object");
	int i = -7;
	pw.println(i);
	double d = 4.5e-7;
	pw.println(d);
}
}

class printwriter{  
    public static void main(String args[]){    
                  try{    
           PrintWriter pw=new PrintWriter(new File("D:\\Java PPT Programs\\Chapter 5\\src\\FileHandling\\target.txt"));
           pw.print("Hi");
           pw.flush();
           pw.close();
           }catch(Exception e){System.out.println(e);}    
        }    
       } 
