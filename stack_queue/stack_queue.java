package stack_queue;
import java.util.*;

public class stack_queue {


    

    //queue
    static class Queue {
        //queue using 2 stacks
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        
        public static int remove() {
            if(isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
                }
            return s1.pop();
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
                }
            return s1.peek();
        }
    }
    // static class Node {
    //     int data;
    //     Node next;

    //     Node(int data) {
    //         this.data = data;
    //         next = null;
    //     }
    // }
    // static class Queue {
    //     // static int size;
    //     // static int arr[];
    //     // static int rear = -1;
    //     // static int front = -1;

    //     static Node head = null;
    //     static Node tail = null;

    //     // Queue(int n) {
    //     //     arr = new int[n];
    //     //     this.size = n;
    //     // }

    //     public static boolean isEmpty() {
    //         // return rear == -1;
    //         // return rear == -1 && front == -1;
    //         return head == null && tail == null;
    //     }

    //     // public static boolean isFull() {
    //     //     return (rear+1) % size == front;
    //     // }

    //     public static void add(int data) {
    //         // if(rear == size-1) {
    //         //     System.out.println("The queue is full");
    //         //     return;
    //         // }

    //         // if(isFull()) {
    //         //     System.out.println("The queue is full");
    //         //     return;
    //         // }

    //         // if(front == -1) {
    //         //     front = 0;
    //         // }

    //         // // rear++;
    //         // rear = (rear+1) % size;
    //         // arr[rear] = data;

    //         Node newNode = new Node(data);
    //         if(tail == null) {
    //             tail = head = newNode;
    //             return;
    //         }

    //         tail.next = newNode;
    //         tail = newNode;
    //     }

    //     public int remove() {
    //         if(isEmpty()) {
    //             System.out.println("The queue is empty");
    //             return -1;
    //         }

    //         // int front = arr[0];
    //         // int result = arr[front];

    //         // for(int i=0; i<size-1; i++) {
    //         //     arr[i] = arr[i+1];
    //         // }

    //         //single element condition
    //         // if(rear == front) {
    //         //     rear = front = -1;
    //         // } else {
    //         //     front = (front + 1) % size;
    //         // }

    //         int front = head.data;
    //         if(head == tail) {
    //             tail = null;
    //         }
    //         head = head.next;
    //         // rear--;
    //         // return result;
    //         return front;
    //     }

    //     public int peek() {
    //         if(isEmpty()) {
    //             System.out.println("The queue is empty");
    //             return -1;
    //         }

    //         // return arr[0];
    //         // return arr[front];
    //         return head.data;
    //     }
    // }

    public static void main(String[] args) {
        

        // Queue q = new Queue(5);
        Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // System.out.println(q.remove());
        // q.add(6);
        // System.out.println(q.remove());
        // q.add(7);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
