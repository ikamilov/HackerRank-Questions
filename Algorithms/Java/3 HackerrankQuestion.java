//Element in a Tree
private static int isPresent(Node root, int val){
/* For your reference
class Node {
		Node left, right;
		int data;
                Node(int newData) {
			left = right = null;
			data = newData;
		}
	}
*/
    if (root == null) {
        return 0;
    }
    if (val == root.data) {
        return 1;
    }
    else if (val > root.data) {
        return isPresent(root.right, val);
    }
    else {
        return isPresent(root.left, val);
    }
}

//Redundancy in a linked list
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

//Delete Nodes Greater Than X
static LinkedListNode removeNodes(LinkedListNode list, int x) {
        LinkedListNode h = new LinkedListNode(0);
        h.next = list;
        LinkedListNode n = h;
        
        while(n.next != null) {
            if (n.next.val > x) {
                LinkedListNode next = n.next;
                n.next = next.next;
            }
            else {
                n = n.next;
            }
        }
        return h.next;
      


    }


//Can you sort?

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


//Sharing Candies JAVA
/*
     * Complete the function below.
     */
    static ArrayList<Long> factors(long n){
       ArrayList<Long> list=new ArrayList<Long>();
       
       for(int i=1;i*i <= n; ++i){
           if(n%i == 0){
                list.add((long) i);
                long b=n/i;
                list.add(b);
           }
       }
       Collections.sort(list);

       return list;
   }
    static long getCandies(long n, long p) {
        ArrayList<Long> factor=factors(n);
        System.out.println(factor.toString());
        for (int i = 1; i*i <= n; ++i) {
            if(factor.size() > (int)p){
                p=p-1;
                return factor.get((int)p);
            }
        }
       
        return 0;
    }




//Sharing Candies C++
long getCandies(long n, long p) {
     set<long> st;
    for(long i= 1; i*i <= n; ++i){
        if(n % i == 0){
            st.insert(i);
            st.insert(n / i);            
        }
        if(st.size()/2 == p) return st.size()/2;
    }
    if(st.size() < p) return 0;
    else{
        return *next(st.begin(), p-1);
    }

}

