package assignment3;
import java.util.Scanner;
public class checkNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[] {1,4,6,7,8,9,10};
		int mid=arr.length/2;
		int flag=0;
		
		if(num<arr[mid])
		{
			for(int i=0;i<mid;i++)
			{
				if(arr[i]==num)
				{
					flag=1;
					break;
				}
				else
					flag=0;
			}
		}
		else if(num>=arr[mid])
			{
				for(int i=mid;i<arr.length;i++)
				{
					if(arr[i]==num)
					{
						flag=1;
						break;
					}
					else
					flag=0;
				}
			}
		if(flag==1)
			System.out.print("I get the Number "+num);
		else
			System.out.print("I doesnot get the Number "+num);
			
	}

}
