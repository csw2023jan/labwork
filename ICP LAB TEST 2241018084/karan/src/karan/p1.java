package karan;
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	int lar=arr[0];
	int sma=arr[0];
	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]>lar)
	lar=arr[i];
	if(arr[i]<sma)
		sma=arr[i];
	}
	boolean check=false;
	
	for(int i=sma;i<=lar;i++)
	{
		check=false;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==i)
				check=true;
		}
		if(check==false)
			{
			System.out.println(i);
			break;
			}
			}
	
	}

}
 
