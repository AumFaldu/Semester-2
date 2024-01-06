import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int flag=0;
		System.out.print("Enter an integer : ");
		int n = sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Entered number is prime");
		}
		else
		{
			System.out.println("Entered number is not prime");
		}
	}
}