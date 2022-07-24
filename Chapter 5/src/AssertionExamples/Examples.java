package AssertionExamples;

public class Examples {
	/*
public static void main(String[] args) {
	public static double calculatInt(int amt,double roi,int years) {
		//Usint assertion
		assert amt>0;
		double interest = (amt*roi*years);
		return interest;
	}
	 System.out.println(calculatInt(1000,2.0f,3));
}
*/
}


class pqr{
	public static void main(String[] args) {
		//get a number in the first argument
		int num = Integer.parseInt(args[0]);
		//assert num <= 10;//stops if number >10
		assert num<=10:"Number is greater than 10";
		System.out.println("All assumptions are correct");
	}
}
//Compile: javac AssertionExample.java 
//Run: java -ea AssertionExample



