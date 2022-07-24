package InterfacesAndLamdaExpression;

public class MultipleInheritance {

}
/*
interface A{
	void print();
}
interface B{
	void print();
}
class C implements A,B{
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		C obj = new C();
		obj.print();
	}
}
*/

/*
interface A 
{
    default void show()
    {
        System.out.println("A");
    }
}
interface B 
{
    default void show()
    {
        System.out.println("B");
    }
}

class C implements A,B 
{
     public void show()
    {
        System.out.println("New definition of show");
    }
}
 class Main2
{
	public static void main(String[] args) {
	A obj1=new C();
	obj1.show();
	B obj2=new C();
	obj2.show();
	}
}
*/
/*
interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}  
class Rectangle2 implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class TestInterfaceDefault{  
public static void main(String args[]){  
Drawable d=new Rectangle2();  
d.draw();  
d.msg();  
}
} 
*/
interface Drawable{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle3 implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  
class TestInterfaceStatic{  
public static void main(String args[]){  
Drawable d=new Rectangle3();  
d.draw();  
System.out.println(Drawable.cube(3));  
}} 


