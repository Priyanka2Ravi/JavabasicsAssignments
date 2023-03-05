package week1.day1;

public class Isprime {

	public static void main(String[] args) {
	
		int num = 29;
		boolean flag = true;
		for (int i=2; i<num ; i++)
		{
			if( num%i == 0)
			{
				flag = false;
				break;
			}
		}
		if ( flag == false) {
			System.out.println(num + " " + "is not prime number");
		}
		else {
			System.out.println(num + " " + "is a prime number " );
		}
	
	
	}
	
	
	}
