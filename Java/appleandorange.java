import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
    int app = 0;
    int ora = 0;
    int s = in.nextInt();
    int t = in.nextInt();
    int a = in.nextInt();
    int b = in.nextInt();
    int m = in.nextInt();
    int n = in.nextInt();
    int[] apple = new int[m];
    for(int apple_i=0; apple_i < m; apple_i++){
        apple[apple_i] = in.nextInt();
    }
    int[] orange = new int[n];
    for(int orange_i=0; orange_i < n; orange_i++){
        orange[orange_i] = in.nextInt();
    }

    for(int x: apple){
        if(x > 0 && x+a >= s && x + a<= t)
            app +=1;
    }



    for(int y: orange){
        if(y < 0 && y + b >= s && y+b <= t)
            ora+=1;
    }

    System.out.println(app);
    System.out.println(ora);

    }
}


