package WrapperClasses;
import java.util.ArrayList;
public class ArrayListExample {
	public static void main(String[] args) 
	{ 
		int n = 5; 
		ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
		for (int i = 1; i <= n; i++) 
		arrli.add(i); 
		System.out.println(arrli); 
		arrli.remove(3); 
		System.out.println(arrli); 
		for (int i = 0; i < arrli.size(); i++) 
		System.out.print(arrli.get(i) + " "); 
	} 

}

class ABS{
public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Welcome");
		al.add("Java");
		al.add(1,"to");
		System.out.println(al);
	}
}

//Java program to change elements 
//in an ArrayList 

 class ABC { 
	public static void main(String args[]) 
	{ 
		ArrayList<String> al = new ArrayList<>(); 

		al.add("welcome"); 
		al.add("java"); 
		al.add(1, "to"); 

		System.out.println("Initial ArrayList " + al); 

		al.set(1, "the"); 

		System.out.println("Updated ArrayList " + al); 
	} 
} 

//Java program to remove elements 
//in an ArrayList 


 class ABCc { 

	public static void main(String args[]) 
	{ 
		ArrayList<String> al = new ArrayList<>(); 

		al.add("Welcome"); 
		al.add("java"); 
		al.add(1, "to"); 
		System.out.println("Initial ArrayList " + al); // Welcome to java
		al.remove(1); 
		System.out.println("After the Index Removal " + al); //Welcome java
		al.remove("java"); 
		System.out.println("After the Object Removal " + al); //Welcome
	} 
} 
 
 class ABCs { 
 	public static void main(String args[]) 
 	{ 
 		ArrayList<String> al = new ArrayList<>(); 
 		al.add("Welcome"); 
 		al.add("java"); 
 		al.add(1, "to"); 

 		for (int i = 0; i < al.size(); i++) { 

 			System.out.print(al.get(i) + " "); 
 		} 

 		System.out.println(); 
 		for (String str : al) 
 			System.out.print(str + " "); 
 	} 
 } 

 class ABCd { 
		public static void main(String[] args) 
		{ 
			ArrayList<Integer> arr = new ArrayList<Integer>(4); 
			arr.add(1); 
			arr.add(2); 
			arr.add(3); 
			arr.add(4); 
			System.out.println("The list initially: " + arr); 
			arr.clear(); 
			System.out.println("The list after using clear() method: " + arr); //[]
		} 
	} 

 class ABCf { 
		public static void main(String[] args) 
		{ 
			ArrayList<Integer> arr = new ArrayList<Integer>(4); 
			arr.add(1); 
			arr.add(2); 
			arr.add(3); 
			arr.add(4); 
			boolean ans = arr.contains(2); 
			if (ans) 
				System.out.println("The list contains 2"); 
			else
				System.out.println("The list does not contains 2"); 
		}
	} 
