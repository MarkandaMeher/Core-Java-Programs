package InterfacesAndLamdaExpression;

import java.util.ArrayList;

public class ForEachMethod {

}
class Main{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("PQR");
		list.add("STU");
		list.add("XYZ");
		list.forEach(
				(n)->System.out.println(n)
				);
	}
}