import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args)  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];
        int sum = 0;
        double mean,mean_sum=0,mean_dev;
        for(int i=0; i<n; i++)
        {
            A[i] = scn.nextInt();
            sum = sum+A[i];
        }
        mean = sum/n;
        for(int j=0; j<n; j++)
        {
            mean_sum = mean_sum + Math.pow((A[j]-mean),2);
        }
        mean_sum = mean_sum/n;
        mean_dev = Math.sqrt(mean_sum);
        System.out.format("%.1f",mean_dev);
    }
}
