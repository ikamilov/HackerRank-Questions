import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        long[] a = new long[scan.nextInt()];
        
        for(int i = 0; i < a.length; i++)
            a[i] = scan.nextLong();
        long sum = 0;
        for(long value : a)
            sum += value;
        System.out.println(sum);
        
        
    }
}
