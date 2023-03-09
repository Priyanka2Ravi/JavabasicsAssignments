package week1.day2;

public class Calculator {

	public int add(int i,int j, int k)
	{
		int sum = i+j+k;
		return sum;
	}
	
	public int mul(int i , int j)
	{
		int results = i *j;
		return results;
	}
	public void sub() {
		
		System.out.println("Nothing to display here");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj1 = new Calculator();
		System.out.println(obj1.add(3, 10, 55));
		System.out.println(obj1.mul(13,23));
		obj1.sub();
	}

}
