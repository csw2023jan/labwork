package Q2;

import java.io.*;
import java.util.*;
public class SubArray {

	public static int sum(int[] arr)
    {
        int maxSoFar = 0;
        int maxEndingHere = 0;
        for (int i: arr)
        {
            maxEndingHere = maxEndingHere + i;
            maxEndingHere = Integer.max(maxEndingHere, 0);
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
 
        return maxSoFar;
    }
 
    public static void main(String[] args)
    {
        int[] arr = { -12, 11, -13, 14, -11, 12, 11, -15, 24 };
        
 
        System.out.println("The sum of subarray with the " + "largest sum is " + sum(arr));
    }
}
