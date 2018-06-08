package assignment3;

public class pattern {

	public static void main(String[] args) {
		int i,j;
		int n=5;
		char k='*';
		for(i=0;i<5;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(k);
			}
			n--;
			System.out.println();
		}

	}

}
