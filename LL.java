// import java.util.*;

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

            //add - first, last
            public void addFirst(int data) {
                Node newNode = new Node(data);
                if(head == null) {
                    head = newNode;
                    return;
                }
    
                newNode.next = head;
                head = newNode;
            }
    
            public void addLast(int data) {
                Node newNode = new Node(data);
                if(head == null) {
                    head = newNode;
                    return;
                }
    
                Node currNode = head;
                while(currNode.next != null) {
                    currNode = currNode.next;
                }
    
                currNode.next = newNode;
            }
    
            public void printList() {
                if(head == null) {
                    System.out.println("List is empty");
                    return;
                }
                Node currNode = head;
                while(currNode != null) {
                    System.out.print(currNode.data + "->");
                    currNode = currNode.next;
                }
                System.out.println("NULL");
            }

             //delete first
            public void deleteFirst() {
                if(head == null) {
                    System.out.println("The list is empty");
                    return;
                }

                size--;
                head = head.next;
            }

             //delete last
            public void deleteLast() {
                if(head == null) {
                    System.out.println("The list is empty");
                    return;
                }

                size--;
                if(head.next == null) {
                    head = null;
                    return;
                }

                Node secondLast = head;
                Node lastNode = head.next; //head.next = null -> lastNode = null
                while(lastNode.next != null) { // null.next
                    lastNode = lastNode.next;
                    secondLast = secondLast.next;
                }

                secondLast.next = null;
            }

            public int getSize() {
                return size;
            }

            public void  reverseIterate() {
                if(head == null || head.next == null) {
                    return;
                }

                Node prevNode = head;
                Node currNode = head.next;
                
                while(currNode != null) {
                    Node nextNode = currNode.next;
                    currNode.next = prevNode;

                    //update
                    prevNode = currNode;
                    currNode = nextNode;
                }
                head.next = null;
                head = prevNode;
            }

            public Node reverseRecursive(Node head) {
                if(head == null || head.next == null) {
                    return head;
                }
                Node newHead = reverseRecursive(head.next);
                head.next.next = head;
                head.next = null;

                return newHead;
            }

            public Node removeNthFromEnd(Node head, int n) {
                if(head.next == null) {
                    return null;
                }

                //size
                int size = 0;
                Node curr = head;
                while(curr != null) {
                    curr = curr.next;
                    size++;
                }

                if(n == size) {
                    return head.next;
                }

                int indexToSearch = size - n;
                Node prev = head;
                int i = 1;
                while(i < indexToSearch) {
                    prev = prev.next;
                    i++;
                }
                prev.next = prev.next.next;
                return head;
            }

            public Node findMiddle(Node head) {
                Node hare = head;
                Node turtle = head;

                while(hare.next != null && hare.next.next != null) {
                    hare = hare.next.next;
                    turtle = turtle.next;
                }
                return turtle;
            }

            public boolean isPalindrome(Node head) {
                if(head == null || head.next == null) {
                    return true;
                }
                Node middle = findMiddle(head);
                Node secondHalfStart = reverseRecursive(middle.next);

                Node firstHalfStart = head;
                while(secondHalfStart != null) {
                    if(firstHalfStart.data != secondHalfStart.data){
                        return false;
                    }
                    firstHalfStart = firstHalfStart.next;
                    secondHalfStart = secondHalfStart.next;
                }
                return true;
            }

            //Floyd's Algorithm or  hare-turtle method
            public boolean hasCycle(Node head) {
                if(head == null) {
                    return false;
                }
                Node hare = head; //fast
                Node turtle = head; //slow
                while(hare != null && hare.next != null) {
                    hare = hare.next.next;
                    turtle = turtle.next;

                    if(hare == turtle) {
                        return true;
                    }
                }
                return false;
            }

            //remove a cycle
            public Node removeCycle(Node head) {
                if(head == null) {
                return null;
                }
                if(head.next == null) {
                return head;
                }
                Node hare = head;
                Node turtle = head;
                Node ptr = head;
                Node pre = null; 
                while(hare != null && hare.next != null) {
                hare = hare.next.next;
                pre = turtle;
                turtle = turtle.next;
            
                if(hare == turtle) {
                    while(turtle != ptr) {
                    ptr = ptr.next;
                    pre = turtle;
                    turtle = turtle.next;
                    }
                    pre.next = null;
                    }
                }
                return head;
                }

                //HOMEWORK PROBLEMS

                public Node swapInPairs(Node head) {
                    if(head == null) {
                    return head;
                    }
                    if(head.next == null) {
                    return head;
                    }
                
                    Node prev = head;
                    Node curr = head.next.next;
                    head = head.next;
                    head.next = prev;
                    
                    while(curr.next != null && curr != null) {
                    prev.next = curr.next;
                    prev = curr;
                    Node temp = curr.next.next;
                    curr.next.next = curr;
                    curr = temp;
                    }
                    prev.next = curr;
                    return head;
                }

                //reverse linked list
                public Node reverseLL(Node head) {
                    if(head == null) {
                    return null;
                    }

                    if(head.next == null) {
                    return head;
                    }
                    Node middle = findMiddle(head);
                    Node left = head.next;
                    Node right = middle.next;
                    if(left.data <= right.data){
                    left.next = right.next;
                    right.next = middle;
                    middle.next = left;
                    head.next = right;
                    } 
                    return head;
                }
            public static void main(String args[]) {
                LL list = new LL();
                // list.addFirst("a");
                // list.addFirst("is");
                // list.printList();

                // list.addLast("list");
                // list.printList();

                // list.addFirst("This");
                // list.printList();

                // list.deleteFirst();
                // list.printList();

                // list.deleteLast();
                // list.printList();

                // System.out.println(list.getSize());
                // list.addFirst("this");
                // System.out.println(list.getSize());

                // LinkedList<String> list = new LinkedList<String>();
                // list.addFirst("a");
                // list.addFirst("is");
                // System.out.println(list);

                // list.addFirst("this");
                // list.add("list"); //addLast
                // System.out.println(list);

                // System.out.println(list.size());

                // for(int i=0; i<list.size(); i++) {
                //     // if(list.get(i) == value)
                //     System.out.print(list.get(i) + "->");
                // }
                // System.out.println("null");

                // // list.removeFirst();
                // // System.out.println(list);

                // // list.removeLast();
                // // System.out.println(list);

                // list.remove(3);
                // System.out.println(list);

                list.addLast(1);
                list.addLast(2);
                list.addLast(3);
                list.addLast(4);
                list.addLast(5);
                list.printList();

                // list.reverseIterate();
                // list.printList();

                // list.head = list.reverseRecursive(list.head);
                // list.printList();

                // list.head = list.removeNthFromEnd(list.head, 2);
                // list.printList();

                // if(list.isPalindrome(list.head) == true) {
                //     System.out.println("The list is palindrome");
                // }
                // else {
                //     System.out.println("The list is not palindrome");
                // }

                // if(list.hasCycle(list.head) == true) {
                //     System.out.println("The list has cycle");
                //     removeCycle(list.head)
                // }
                // else {
                //     System.out.println("The list does not have cycle");
                // }

                //HOMEWORK PROBLEMS

                // LinkedList<Integer> list = new LinkedList<Integer>();
                // list1.addLast(1);
                // list1.addLast(3);
                // list1.addLast(7);
                // list1.addLast(5);
                // list1.addLast(8);
                // list1.addLast(2);
                // // list.add(3);
                // list1.printList();

            // list1.head = list1.swapInPairs(list1.head);
            // list1.printList();

            // list1.head = list1.reverseLL(list1.head);
            // list1.printList();

            //   for(int i=0; i<list.size(); i++) {
            //     if(list.get(i) == num) {
            //       System.out.println("The element is present at index: " + i);
            //     }
            //   }

            //   int number = sc.nextInt();
            //   LinkedList<Integer> list1 = new LinkedList<Integer>();
            //   for(int i=0; i<number; i++) {
            //     list1.add(i,sc.nextInt());
            //   }

            //   for(int i=0; i<list1.size(); i++) {
            //     if(list1.get(i) > 25) {
            //       list1.remove(i);
            //     }
            //     else {
            //       System.out.println(list1.get(i));
            //     }
                
            // }

                list.swapInPairs(list.head);
                list.printList();
            }
}
