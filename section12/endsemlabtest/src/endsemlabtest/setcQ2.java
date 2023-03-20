package endsemlabtest;
import java.util.Scanner;
public class setcQ2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE NO. OF ARRAY ELEMENT :");
	int n = sc.nextInt();
	int arr[]=new int[n];
	System.out.println("ENTER THE ARRAY ELEMENT :");
	arr[n]= sc.nextInt();
	
	int sum =0;
	for(int i=0; i<n;i++)
	{
		if(n%2==0)
		{
			System.out.println(n);
			sum = sum+n;
		}
	}
	System.out.println("sum of even elements = "+sum);
	}

}

