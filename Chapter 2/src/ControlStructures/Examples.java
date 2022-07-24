package ControlStructures;

public class Examples {
	public static void main(String args[])
	{
	    int number=13;  
	    if(number%2==0)
	    {  
	        System.out.println("even number");  
	    }
	else
	    {  
	        System.out.println("odd number");  
		    }  
	}

}

class IfElseLadder
{
	public static void main(String args[])
	{
	    int number=13;  
	    if(number>0)
		        System.out.println("Positive number");  
	    else if(number<0)
	        System.out.println("Negative Number");    
	    else
		System.out.println("Number is zero");  
	}
}

//class JavaNestedIfExample{
//	public static void main(String args[]) {
//		int age = 20;
//		int weight = 80;
//		if(age>=18) {
//			
//			if(weight>50) {
//				System.out.println("You are eligible to donate blood");
//			}
//		}
//		else
//			System.out.println("Done");
//	} 
//}

class SampleSwitch {
	public static void main(String args[]) {
		for(int i=0; i<6; i++)
			switch(i) {
				case 0:
					System.out.println("i is zero.");
					break;
				case 1:
					System.out.println("i is one.");
					break;
				case 2:
					System.out.println("i is two.");
					break;
				default:
					System.out.println("i is greater than 2.");
				     }
				}
			       }

class MissingBreak{
	public static void main(String[] args) {
		for(int i =0;i<12;i++) {
			switch(i) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("i is less than 5");
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("i is less than 10");
				break;
			default:
				System.out.println("i is 10 or more");
			}
		}
	}
}

class StringSwitch{
	public static void main(String[] args) {
		String str = "two";
		switch(str) {
		case "one":
			System.out.println("One");
			break;
		case "two":
			System.out.println("Two");
			break;
		case "three":
			System.out.println("three");
			break;
		default:
			System.out.println("No Match");
			break;
		}
	}
}
