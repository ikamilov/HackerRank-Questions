import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j, k;
         for(i=1;i<=n;i++)
        {
             for(k=1;k<=n-i;k++)
        {
                 System.out.print(" ");
        }

            for (j = n; j>=k; j--)
       {
                System.out.print("#");
       }

            System.out.println();
    }
    
}
}


