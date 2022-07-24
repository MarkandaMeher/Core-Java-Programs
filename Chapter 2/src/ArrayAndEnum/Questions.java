package ArrayAndEnum;

public class Questions {
	public static void main(String args[]) 
    {
        int array_variable [] = new int[10];
    for (int i = 0; i < 10; ++i) 
        {
            array_variable[i] = i;
            System.out.print(array_variable[i] + " ");
            i++;
        }
    } 
}

class evaluate 
{
    public static void main(String args[]) 
        {
        int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 6;
            n = arr[arr[n] / 2];
        System.out.println(arr[n] / 2);
        } 
}

class array_output 
{
    public static void main(String args[]) 
    {
        int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j <  3 ; ++j)
                sum = sum + array_variable[i][j];
        System.out.print(sum / 5);
    } 
}

class Mains
{
	public static void main(String[] args) {
		int a[][]=new int[2][2];
		System.out.println(a[0][1]);
	}
}

