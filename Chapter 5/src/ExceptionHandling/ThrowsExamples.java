package ExceptionHandling;
import java.io.*;
public class ThrowsExamples {

}
/*
class abc {
	  public static void findFile() throws IOException {
	    // code that may produce IOException
	    File newFile=new File("test.txt");
	    FileInputStream stream=new FileInputStream(newFile);
	  }
	  public static void main(String[] args) {
	    findFile();//try catch block must be used as method throws checked exception
	  }
	}
*/

class abc2 {
	  public static void findFile() throws IOException {
	    // code that may produce IOException
	    File newFile=new File("test.txt");
	    FileInputStream stream=new FileInputStream(newFile);
	  }
	  public static void main(String[] args) {
	    try{
	      findFile();
	    } catch(IOException e){
	      System.out.println(e);
	    }
	  }
	}
