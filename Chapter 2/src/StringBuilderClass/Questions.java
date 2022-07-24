package StringBuilderClass;

public class Questions {
	public static void main(String[] args) {
		 StringBuilder sb=new StringBuilder(2);
		 sb.append("Exam");
		 System.out.println(sb.capacity()+" "+sb.length());
		}

}

class Q2
{
	public static void main(String[] args) {
	 StringBuilder sb = new StringBuilder("Programming");
	 sb.setLength(7);
     System.out.println(sb.length()+" "+sb);
	}
}

class Q3
{
	public static void main(String[] args) {
	 StringBuilder str = new StringBuilder("Evaluation"); 
     System.out.println(str.substring(1)); 
	}
}

class Q4
{
	public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Programming"); 
        char[] array = new char[5]; 
        str.getChars(0, 5, array, 0); 
        System.out.print("Char array contains : "); 
        for (int i = 0; i < array.length; i++) { 
            System.out.print(array[i]); 
        } 
	}
}

class Q5
{
	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("PollingQuestion");
	sb.delete(1, 4);
	System.out.println(sb);
	}
}

class Q6

{
	public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Object");
           sb.insert(6,"ive");
           System.out.println(sb);
	}
}

