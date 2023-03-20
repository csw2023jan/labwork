package Q1;

import java.util.Arrays;
import java.util.Collections;

public class ArrayRotation{
static void leftRotate(Integer arr[], int k,int n)
{

	Collections.rotate(Arrays.asList(arr), n - k);
	for(int i = 0; i < n; i++)
		System.out.print(arr[i] + " ");
}
public static void main(String[] args)
{
	Integer arr[] = { 10,20,30,40,50,60 };
	int n = arr.length;
	int k = 2;
	leftRotate(arr, k, n);
}
}
