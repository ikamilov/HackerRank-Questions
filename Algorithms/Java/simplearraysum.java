import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
        
        int[] a = new int[scan.nextInt()];
        
        for(int i = 0; i < a.length; i++)
            a[i]=scan.nextInt();
        
        int sum = 0;
        
        for(int value : a)
            sum += value;
        
        System.out.println(sum);

        }
    }