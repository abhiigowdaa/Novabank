
import java.util.Scanner;

public class main {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0 ; i<arr.length; i++)
		{

		arr[i]=scan.nextInt();
			
		}
		for(int i =0 ; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
			System.out.print(arr[i]+" ");
			}
		}
	}

}
