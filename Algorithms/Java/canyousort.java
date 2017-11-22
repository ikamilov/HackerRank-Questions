import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 /*
     * Complete the function below.
     */
    static void customSort(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> n = new ArrayList<>();
        
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
            
            if (!n.contains(i)) {
                n.add(i);
            }
        }
        Collections.sort(n);
        
        List<Integer> returning = new ArrayList<>(n);
        int count = 1;
        while(!returning.isEmpty()) {
            returning = print(returning, map, count);
            count++;
            
        }
    }

    static List<Integer> print(List<Integer> n, Map<Integer, Integer> map, int items) {
        List<Integer> returning = new ArrayList<>();
        
        for (Integer integer : n) {
            if(map.get(integer) == items) {
                for (int i = 1; i <= items; i++) {
                    System.out.println(integer);
                }
                
            }
            else {
                returning.add(integer);
            }
        }
        
        return returning;
    }

 public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int arr_size = 0;
        arr_size = Integer.parseInt(in.nextLine().trim());

        int[] arr = new int[arr_size];
        for(int i = 0; i < arr_size; i++) {
            int arr_item;
            arr_item = Integer.parseInt(in.nextLine().trim());
            arr[i] = arr_item;
        }

        customSort(arr);
        
    }
}


