import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for(int i_t = 0; i_t < t; i_t++) {
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            int tmp = scan.nextInt();
            if(tmp <= 0) count++;
        }
        System.out.println((count >= k) ? "NO" : "YES");
    }

}
}
