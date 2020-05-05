import java.util.Scanner;
public class UserArmstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int len=0;
		sc.close();
		int temp = num;
		while (temp!=0)
		{
			
			len=len+1;
			temp=temp/10;
		}
		
		int t2 = num;
		int arm = 0;
		while(t2!=0)
		{
			int mul=1;
			int rem = t2 % 10;
			int i;
			for(i=1;i<=len;i++)
			{
				mul=mul*rem;
			}
			arm = arm+mul;
			t2=t2/10;
		}
	if(arm==num)
	{
		System.out.println(num+"is a armstrong number");
	}
	else
	{
		System.out.println(num+"is NOT a armstrong number");
	}
	}

}
