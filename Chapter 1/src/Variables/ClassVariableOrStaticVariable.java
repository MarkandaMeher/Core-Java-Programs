package Variables;

public class ClassVariableOrStaticVariable {
	static int count;	
		int return_count()
		{
			count++;
			return count;
		}
/*	If we do not use the static keyword then output will be
1
1
1*/
		public static void main(String args[])
		{
		ClassVariableOrStaticVariable ob1= new ClassVariableOrStaticVariable();
		ClassVariableOrStaticVariable ob2= new ClassVariableOrStaticVariable();
		ClassVariableOrStaticVariable ob3= new ClassVariableOrStaticVariable();
	System.out.println(ob1.return_count());
	System.out.println(ob2.return_count());
	System.out.println(ob3.return_count());
		}
	}


