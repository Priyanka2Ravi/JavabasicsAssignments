package week1.day2;


public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arrayList[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
int len = arrayList.length;
//int count;

for (int i=0;i<len;i++)
{
	for (int j=i+1 ;j<len;j++)
	{
		if(arrayList[i]==arrayList[j]) {
			System.out.println(arrayList[i]);
		 	
		}
	}
}


	}

}
