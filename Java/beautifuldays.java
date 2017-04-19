import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
    int i=sc.nextInt();
    int j=sc.nextInt();
    int k=sc.nextInt();
    int res = 0;
    for(;i<=j;i++)
    {
        int rev_i = 0;
        int temp = i;
        while (temp>0)
        {
            rev_i = rev_i*10 + temp%10;  
            temp = temp/10;
        }   /*reverse i and store in rev_i*/
        if ((rev_i-i)%k==0) {res+=1;}
    }
    System.out.println(res);
    }
}
