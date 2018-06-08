package assignment3;
import java.util.Scanner;

public class Prime {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		prime(num);
		
	}
	public static void prime(int num)
	{
		
		for(int i=2;i<=num;i++)
		{
			int flag=0;
			if(i==2)
			{
				flag=0;
			}
			for(int j=2;j<i;j++)
			{
				
				if(i%j==0)
					flag=1;
			}
			if(flag==0)
				System.out.println(i);
		}
	}

}
