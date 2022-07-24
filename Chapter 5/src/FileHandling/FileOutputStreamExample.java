package FileHandling;
import java.io.FileOutputStream;
public class FileOutputStreamExample {
public static void main(String[] args) {
	try {
		FileOutputStream fout = new FileOutputStream("D:\\Java PPT Programs\\Chapter 5\\src\\FileHandling\\test1.txt");
		fout.write(65);
		fout.close();
		System.out.println("success ....");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}

class Ex2{
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\Java PPT Programs\\Chapter 5\\src\\FileHandling\\test2.txt");
			String s= "Welcome to file Handling.";
			byte b[]=s.getBytes();//convertion string into byte array
			fout.write(b);
			fout.close();
			System.out.println("Success....");
			for(byte var : b)
				System.out.println(var);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

class Ex3{  
    public static void main(String args[]){    
         try{    
          String textToAppend = "Hello !!"; //new line in content
   FileOutputStream outputStream = new FileOutputStream("D:\\Java PPT Programs\\Chapter 5\\src\\FileHandling\\test2.txt", true);//For appending the data here we need to give true in second argument
   byte[] strToBytes = textToAppend.getBytes();
   outputStream.write(strToBytes);
   outputStream.close();   
         }catch(Exception e){System.out.println(e);}    
        }    
       } 


