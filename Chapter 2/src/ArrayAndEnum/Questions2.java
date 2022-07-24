package ArrayAndEnum;

public class Questions2 {
public static void main(String[] args) {
	
}
}

enum Season 
{
    WINTER,SUMMER,SPRING;
}
class Main11
{
	public static void main(String[] args) {
	Season var;
	var=SPRING;
	System.out.println(var);
	}
}

enum Flowers
{
    SUNFLOWER,JASMINE,LOTUS;
}
class Main12
{
	public static void main(String[] args) {
	Flowers var[]=Flowers.values();
	for(int i=1;i<2;i++)
	System.out.println(var[i]);
	}
}


enum Colours
{
    WHITE,GREEN,RED,YELLOW
}
class Main13
{
	public static void main(String[] args) {
	System.out.println(Colours.valueOf("YELLOW").ordinal());
}
}

enum Colours2
{
   WHITE(23),GREEN(78),RED(7),YELLOW(100);
    int colour_code;
    Colours2(int code){
        colour_code=code;
    }
    int get_code(){
        return colour_code;
    }
}
class Main14
{
	public static void main(String[] args) {
	System.out.println(Colours2.RED.get_code());
}
}


