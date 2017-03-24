import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        
        System.out.println(getNumberOfPairs(a,k));
    }
    
    public static int getNumberOfPairs(int [] arr, int k) {
        int count =0;
        
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0 ; j < arr.length; j++) {
                 if (i < j && ((arr[i] + arr[j]) % k == 0))  { 
                
                        count++;            
                    }
            }       
        }     
        return count;
    }
}
