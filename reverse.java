package assignment3;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int p=reverse(num);
		System.out.print("The Reverse Of The Deseried Number Is "+p);
		
	}
	public static int reverse(int num)
	{
		int rev=0,m;
		for(int i=num;i>0;i=i/10)
		{
			m=i%10;
			rev=rev*10+m;
		}
		return rev;
	}

}
