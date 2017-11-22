import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class LinkedListNode {
        int val;
        LinkedListNode next;

        LinkedListNode(int node_value) {
            val = node_value;
            next = null;
        }
    };

    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val) {
        if(head == null) {
            head = new LinkedListNode(val);
            tail = head;
        }
        else {
            tail.next = new LinkedListNode(val);
            tail = tail.next;
        }
        return tail;
    }

 /*
     * Complete the function below.
     */
    /*
    For your reference:
    LinkedListNode {
        int val;
        LinkedListNode next;
    };
    */
    static LinkedListNode distinct(LinkedListNode head) {
        LinkedListNode p = null;
        LinkedListNode n = null;
        p = head;
        while (p != null && p.next != null) {
            n = p;
            while (n.next != null) {
                if (p.val == n.next.val){
                    n.next = n.next.next;
                }
                else {
                    n = n.next;
                }
            }
            p = p.next;
        }
    return head;
        
    }
 public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        LinkedListNode res;
        int head_size = 0;

        LinkedListNode head = null;
        LinkedListNode head_tail = null;

        head_size = Integer.parseInt(in.nextLine());

        for(int i = 0; i < head_size; i++) {
            int head_item;
            head_item = Integer.parseInt(in.nextLine().trim());
            head_tail = _insert_node_into_singlylinkedlist(head, head_tail, head_item);

            if(i == 0) {
                head = head_tail;
            }
        }


        res = distinct(head);
        while (res != null) {
            bw.write(String.valueOf(res.val));
            bw.newLine();
        res = res.next;
        }

        bw.close();
    }
}


