package assignment3;
import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
	  findEven(number);

	}
	public static void findEven(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
