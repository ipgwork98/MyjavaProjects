
import java.util.Scanner;
 public class UserPrime {

	public static void main(String[] args) {
		
	boolean isprime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int Number = sc.nextInt();
	
		if(Number<1) {
			
			System.out.println("Number should be greater than 1");
			
		}else if(Number==1) {
			
			System.out.println("1 is neither prime or not composite number");
			
		}else {
		for(int div=2;div<=(Number/2);div++)
			{
				if((Number % div) ==0)
				
					isprime = false;
				break;
			}
		if(isprime)
		{
			System.out.printf("%d is Prime",Number);
		}else {
				System.out.printf("%d is not Prime",Number);
				}
		    }
         }
	}
