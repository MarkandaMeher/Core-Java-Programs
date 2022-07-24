package InterfacesAndLamdaExpression;

public class Questions {

}

/*
interface A {
void show();
}
 class Mains implements A {
void show()
{
    System.out.println("Hello");
}
public static void main(String args[])
{
A ref=new Mains();
ref.show();
}
}
*/

/*
interface A {
void show();
}
interface B {
void show();
}
 class Mains implements A,B {
public void show()
{
    System.out.println("Hello");
}
public static void main(String args[])
{
Mains ref=new Mains();
ref.show();
}
}
*/

/*
interface A {
void show();
void display(){ System.out.println("Welcome");}
}
 class Mains implements A {
public void show()
{
    System.out.println("Hello");
}
public static void main(String args[])
{
A ref=new Mains();
ref.display();
}
}
*/

/*
interface A {
protected int x=12;
public void show();
}
 class Mains implements A {
public void show()
{
    System.out.println(x);
}
public static void main(String args[])
{
A ref=new Mains();
ref.show();
}
}
*/

/*
interface A {
int x=12;
}
interface B {
int y=13;
}
interface C extends A,B 
{
    static int sum(){ return x+y;}
}
 class Mains implements C {
public static void main(String args[])
{
System.out.println(C.sum());
}
}
*/

/*
interface A 
{
    boolean task(int a,int b);
}
 class Mains{
public static void main(String args[])
{
A ref=(n1,n2)->n1+2==n2;
System.out.println(ref.task(1,3));
}
}
*/

/*
interface A 
{
    int task(int a,int b);
}
 class Mains{
public static void main(String args[])
{
A ref=(n1,n2)->{
int x=n1+n2;
int y=n1-n2;
int z=x+y;
};
System.out.println(ref.task(4,3));
}
}

*/

/*
//What will be the output of following code?
interface A
{
  int i = 111;
}
class B implements A 
{
  void methodB()
  {
      i = 222;
  }
}
class Mains
{
public static void main(String[] args)
{
  B ref=new B();
  ref.methodB();
}
}
*/

interface A 
{
    int value(int x);
}
 class Mains 
{
    public static void main(String[] args)
    {
    A ref=(n)->{int x=n;return x;};
    System.out.println(ref.value(2));    
    }
}



