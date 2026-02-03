
import java.util.Scanner;

public class loancalculator {
	
	public static int printindexofK(int []arr,int k)
	{
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]==k)
			{
				
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int []arr=new int[n];
		
		
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int k = scan.nextInt();
		

		int res=printindexofK(arr,k);
		System.out.print(res);
	}

}
