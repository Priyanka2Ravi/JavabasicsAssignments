package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstnum = 0;
int secondnum = 1;
System.out.println(firstnum);
for ( int i=0 ; i<9 ; i++)
{
	int sum = firstnum + secondnum;
	System.out.println(sum);
	firstnum = secondnum;
	secondnum = sum;
}
	}

}
