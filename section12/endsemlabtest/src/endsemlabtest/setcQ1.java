package endsemlabtest;
import java.util.Scanner;
public class setcQ1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n = sc.nextInt();
	int sum =0;
	int a=n;
	int b=((n*10)+n);
	int c=((n*100)+(n*10)+n);
	int m = n+((n*10)+n)+((n*100)+(n*10)+n);
	
	System.out.println(a+" + "+b+" + "+c+" = "+m );
	}

}
