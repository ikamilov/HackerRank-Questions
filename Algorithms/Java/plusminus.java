import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float pos = 0;
        float neg = 0;
        float eq = 0;
        for(int i=0; i<n; i++) {
            int in = scan.nextInt();
            if(in>0) {
                pos++;
            }
            else if (in<0) {
                neg++;
            }
            else if(in == 0) {
                eq++;
            }
                
            }
        float posi = pos/n;
        float nega = neg/n;
        float equa = eq/n;
        System.out.println(posi);
        System.out.println(nega);
        System.out.println(equa);
        }
}
  
