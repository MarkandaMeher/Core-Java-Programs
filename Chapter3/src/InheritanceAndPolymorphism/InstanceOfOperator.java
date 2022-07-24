package InheritanceAndPolymorphism;

public class InstanceOfOperator {

}
class Simple1{
	public static void main(String[] args) {
		Simple1 s = new Simple1();
		System.out.println(s instanceof Simple1);
	}
}

class ABCs{}
class PQRs extends ABCs{
 public static void main(String args[]){
 PQRs obj=new PQRs();
 System.out.println(obj instanceof ABCs);//true
 }
}

class ABCd{}
class PQRd extends ABCd{
 public static void main(String args[]){
ABCd obj1=new PQRd();
if(obj1 instanceof PQRd) //It will return true
{
  PQRd obj2=(PQRd)obj1;
  System.out.println("Downcasting done");
}
else
{
System.out.println("Downcasting not possible");
 }
}
}

