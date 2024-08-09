import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
public class hashing {
    static class HashMap<K,V> { //generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //nodes
        private int N; //buckets
        private LinkedList<Node> buckets[];// N- buckets.length

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for(int i=0; i<ll.size(); i++) {
                if(ll.get(i).key == key) {
                    return i;
                }
            } 
            return -1;
        }

        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<N*2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i<oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);// data index

            if(di == -1) { //key doesn't exists
            buckets[bi].add(new Node(key, value));
            n++;
            } else { //key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0) {
                //rehashing
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);// data index

            if(di == -1) { //key doesn't exists
            return false;
            } else { //key exists
                return true;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);// data index

            if(di == -1) { //key doesn't exists
            return null;
            } else { //key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);// data index

            if(di == -1) { //key doesn't exists
            return null;
            } else { //key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++) {//bi
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++) {//di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n==0;
        }
    }

    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(int key : map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.println(key);
            }
        }
    }

    public static void union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;

        for(int i=0; i<n1; i++) {
            set.add(arr1[i]);
        }
        for(int i=0; i<n2; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set.size());
    }

    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int count = 0;

        for(int i=0; i<n1; i++) {
            set.add(arr1[i]);
        }
        for(int i=0; i<n2; i++) {
            if(set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        return count;
    }

    public static String getStart(HashMap<String,String> tick) {
        HashMap<String,String> revMap = new HashMap<>();

        for(String key: tick.keySet()) {
            revMap.put(tick.get(key),key);
        }

        for(String key: tick.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size
        System.out.println(("Size of set is: " + set.size()));

        //print all elements
        System.out.println(set);
        
        //search - contains
        if(set.contains(1)) {
            System.out.println("contains 1");
        }

        if(!set.contains(6)) {
            System.out.println("Does not contain");
        }

        //delete
        // set.remove(1);
        // if(!set.contains(1)) {
        //     System.out.println("Does not contain 1 - we deleted 1");
        // }

        //Iterator
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // //HashMap
        // HashMap<String,Integer> map = new HashMap<>();

        // //Insertion
        // map.put("India",120);
        // map.put("US",30);
        // map.put("China",150);

        // System.out.println(map);

        // map.put("China",180);
        // System.out.println(map);

        // //Search
        // if(map.containsKey("China")) {
        //     System.out.println("Key is present in the map");
        // } else {
        //     System.out.println("Key is not present in the map");
        // }

        // System.out.println(map.get("China")); //key exists
        // System.out.println(map.get("Indonesia")); //key doesn't exists

        // int arr[] = {12, 15, 18};
        // for(int i=0; i<3; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for(int val: arr) {
        //     System.out.print(val + " ");
        // }
        // System.out.println();

        // for(Map.Entry<String,Integer> e: map.entrySet()) {
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        // Set<String> keys = map.keySet();
        // for(String key: keys) {
        //     System.out.println(key + " " + map.get(key));
        // }

        // //remove
        // map.remove("China");
        // System.out.println(map);

        //HashMap Implementation
        // HashMap<String,Integer> map = new HashMap<>();

        // map.put("India",190);
        // map.put("US",50);
        // map.put("China",200);

        // ArrayList<String> keys = map.keySet();
        // for(int i=0; i<keys.size(); i++) {
        //     System.out.println(keys.get(i)+ " " + map.get(keys.get(i)));
        // }

        // map.remove("India");
        // System.out.println(map.get("India"));

        //HashMap ques
        // int nums[] = {1,3,2,5,1,3,1,5,1};
        int nums[] = {1,2};
        majorityElement(nums);

        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        union(arr1, arr2);
        System.out.println(intersection(arr1, arr2));

        HashMap<String,String> tickets = new HashMap<>();//itinery
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)) {
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);

        //subarray sum
        int arr[] = {10,2,-2,-20,10};
        int k = -10;
        HashMap<Integer,Integer> map = new HashMap<>();//<Sum, Freq>

        map.put(0,1);//empty subarray
        int ans = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];

            if(map.containsKey(sum-k)) {
                ans += map.get(sum-k); 
            }

            if(map.containsKey(sum)) {
                map.put(sum, map.get(sum)+1); 
            } else {
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
}
