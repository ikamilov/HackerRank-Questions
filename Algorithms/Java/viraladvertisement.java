import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        int people = 2;
        int count  = 2;
        for (int i = 2; i <= n; i++) {
            people = (people * 3) / 2;
            count += people;
        }
        System.out.println(count);
    
    }
}
