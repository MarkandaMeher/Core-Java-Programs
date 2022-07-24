package GenericsInJava;

public class Examples {

}
//A simple Java Program to show working of user defined Generic Classed
class Test<T>{
	T obj;
	Test(T obj){
		this.obj = obj;
	}
	public T getObject() {
		return this.obj;
	}
}
class Main{
	public static void main(String[] args) {
		//instance of Integer type
		Test<Integer> obj = new Test<Integer>(15);
		System.out.println(obj.getObject());
		
		//instance of String type
		Test<String> sObj = new Test<String>("Hello");
		System.out.println(sObj.getObject());
	}
}