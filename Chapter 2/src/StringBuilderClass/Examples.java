package StringBuilderClass;

public class Examples {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		
		StringBuilder sb2 = new StringBuilder(85);
		System.out.println(sb2.capacity());
		
		StringBuilder sb3 = new StringBuilder("A");
		System.out.println(sb3.capacity()); 
		//Capacity: Default+No. of characters in the string, i.e. 16+1=17

		StringBuilder sb4 = new StringBuilder('A');
		System.out.println(sb4.capacity());
		
		
		
	}
}

class StringBuilderDemo{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("New Zeland");
		System.out.println("length = "+sb.length());
		System.out.println("Capacity = "+sb.capacity());
	}
}

class StringBuilderCapacity{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());//default 16
		
		sb.append("Hello");
		System.out.println(sb.capacity());//now 16
		
		sb.append("java is may favorite language");
		System.out.println(sb.capacity());//now 2*(16+1)=34
		
		sb.append("string");
		System.out.println(sb.capacity());//now 2*(34+1)=70
		System.out.println(sb);
	}
}

 class Main
{
	public static void main(String[] args) {
	StringBuilder sb=new StringBuilder(12);
    System.out.println(sb.capacity());//12
    sb.ensureCapacity(18);
    System.out.println(sb.capacity());//2*(12+1)=26
	}
}

 class Main2
 {
 	public static void main(String[] args) {
 	StringBuilder sb = new StringBuilder("Hello");
 	System.out.println(sb.length()); //length is here
 	sb.setLength(2);
          System.out.println("New length is:"+sb.length()+" with content:"+sb);
 	}
 }

 class Main3
 {
         public static void main(String[] args) {
         StringBuilder str = new StringBuilder("Welcome"); 
         System.out.println("String = " + str); 
         // set char at index 2 to 'L' 
         str.setCharAt(2, 'L'); 
         // print string 
         System.out.println("After setCharAt() String = "+ str); //WeLcome
         System.out.println(str.charAt(0));//W 
 	}
 }


class Main4{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("WelcomeJava");
		char[] array = new char[7];
		sb.getChars(0, 7, array, 0);
		System.out.println("Char array Cointains :");
		for(int i =0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}


class Main5
{  
public static void main(String args[])
{  
StringBuilder sb=new StringBuilder("Hello ");  
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java  
}  
} 

class Main6{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.insert(1, "Java");
		System.out.println(sb);
	}
}

class Main7{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.replace(1,3, "Java");
		System.out.println(sb);
	}
}

 class Main8
{
	public static void main(String[] args) {
StringBuilder sb = new StringBuilder("WelcomeJava");
	sb.delete(3, 7);
	System.out.println("After delete: " + sb);//WelJava
	sb.deleteCharAt(2);
System.out.println("After deleteCharAt: " + sb);//WeJava
	}
}

 class Main9
 {
 	public static void main(String[] args) {
 	 StringBuilder str = new StringBuilder("WelcomeJava"); 
      System.out.println("SubSequence = " + str.substring(7)); //Java
      System.out.println("SubSequence = " + str.substring(0,7)); //Welcome
 	}
 }

class Main10{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.reverse();
		System.out.println(sb);
	}
}















