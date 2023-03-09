package week1.day2;

public class FindIntersection  {

	
	public static void main(String[] args) {
		//" TODO Auto-generated method stub
int arrayNum1[] = {3,2,11,4,6,7};
int arrayNum2[] = {1,2,8,4,9,7,0,5};

int len1= arrayNum1.length;
int len2= arrayNum2.length;
System.out.println("Matching numbers between two arrays are:");
for(int i=0;i<len1;i++)
{
	for(int j=0;j<len2;j++) {
		
		if(arrayNum1[i]==arrayNum2[j])
		{
			System.out.println(arrayNum1[i]);
		}
	}
}
}

}
