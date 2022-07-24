package Variables;

public final class Examples {
	String name;
	final static String section ="K19DUMMY";	
		public static void main(String args[])
		{
			Examples ob1= new Examples();
			Examples ob2= new Examples();
			Examples ob3= new Examples();
			ob1.name="rohan";
			ob2.name="mohan";
			ob3.name="Ram";
            System.out.println(ob1.name+ob1.section);
            System.out.println(ob2.name+ob2.section);
            System.out.println(ob3.name+ob3.section);
}

}
