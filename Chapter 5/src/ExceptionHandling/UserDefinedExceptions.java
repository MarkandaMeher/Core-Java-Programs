package ExceptionHandling;

public class UserDefinedExceptions {

}
//Java program to demonstrate user defined exception
class MyException extends Exception
{
private static int accno[] = {1001, 1002, 1003, 1004,1005};
private static String name[] = {"Nish", "Shubh", "Sush", "Abhi", "Akash"};
private static double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
MyException() { }
MyException(String str) { super(str);
}
public static void main(String[] args)
{
try {
for (int i = 0; i < 5 ; i++)
{			    System.out.println(accno[i] + "\t" + name[i] +"\t" + bal[i]);
if (bal[i] < 1000)
{
MyException me = new MyException("Balance is less than 1000");
throw me;
}
}
}
catch (MyException e) {
e.printStackTrace();
}
System.out.println("Program is running fine after handlng the exception.");
}
}
