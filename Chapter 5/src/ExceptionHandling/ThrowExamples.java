package ExceptionHandling;

public class ThrowExamples {

}
class Ex2{
	static void demo() {
		try {
			throw new NullPointerException("Demo");
		}
		catch(NullPointerException e) {
			System.out.println("Caught inside demo");
			throw e;//rethrow the exception
		}
	}
	public static void main(String[] args) {
		try {
			demo();
		}
		catch(NullPointerException e) {
			System.out.println("Recaught "+e);
		}
	}
}