package FileHandling;
import java.io.*;
public class FileClassExample {
public static void main(String[] args) {
	File ref1 = new File("D:\\Java PPT Programs\\Chapter 5\\src\\FileHandling");
	System.out.println(ref1.isFile());
	System.out.println(ref1.isDirectory());
	File ref2 = new File("D:\\Java PPT Programs\\Chapter 5\\src\\FileHandling\\abc.txt");
	System.out.println(ref2.isFile());
	System.out.println(ref2.isDirectory());
	System.out.println(ref2.exists());
	System.out.println(ref2.getName());
	System.out.println(ref2.getPath());
	File ref3 = new File("D:\\Java PPT Programs\\Chapter 5\\src\\FileHandling\\abc2.txt");
	File ref4 = new File("D:\\Java PPT Programs\\Chapter 5\\src\\FileHandling\\newname.txt");
	System.out.println(ref3.isHidden());
	System.out.println(ref3.canRead());
	System.out.println(ref3.canWrite());
	File ref5 = new File("abc.txt");
	System.out.println(ref5.getPath());
	System.out.println(ref5.getAbsolutePath());
	System.out.println("Last modified on "+new java.util.Date(ref5.lastModified()));
	System.out.println("Length : "+ref5.length());
	/*File ref6 = new File("abc3.txt");
	if(ref6.delete())
		System.out.println("File deleted Successfully");
	else
		System.out.println("File does not exists");*/
	File x[] = ref1.listFiles();
	for(File var : x)
		System.out.println(var);
	boolean flag = ref5.renameTo(ref4);
	if(flag==true)
		System.out.println("File Successfully Renamed");
	else
		System.out.println("Operation Failded");
}
}
