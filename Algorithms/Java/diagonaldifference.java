import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int left = 0;
        int right = 0;
        int a[][] = new int[n][n];
        for(int j=0; j < n; j++){
            for(int k=0; k< n; k++){
                a[j][k] = in.nextInt();
                if(j == k) left += a[j][k];
                if(j == n-k-1) right += a[j][k];
            }
              
        }
        System.out.println(Math.abs(left-right));
    }
}
