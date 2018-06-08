package assignment3;
import java.util.Scanner;
import static java.lang.Math.pow;
public class armstrong {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int x=Armstrong(num);
	if(x==1)
		System.out.println("The desired Number is A Armstrong number"+num);
	else
		System.out.println("The desired Number is not A Armstrong number"+num);
		
	}
  public static int Armstrong(int num)
  {
	  int count=0,arm=0,m;
for(int i=num;i>0;i=i/10)
	count++;
for(int j=num;j>0;j=j/10)
{
	m=j%10;
	arm=arm+(int)pow(m,count);
	
}
if(num==arm)
	return 1;
else
	return 2;
  }

}
