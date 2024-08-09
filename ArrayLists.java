import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get element
        int element = list.get(0);
        System.out.println(element);

        //add el in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

        //HOMEWORK PROBLEMS
        
        //display the string elements
        ArrayList<String> lists = new ArrayList<String>();
        lists.add("Srishti");
        lists.add("Shagun");
        lists.add("Soumya");
        lists.add("Siddh");
        lists.add("Sakshi");

        for(int i=0;i<lists.size();i++) {
            System.out.println(lists.get(i));
        }

        //maximum and minimum
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(5);
        list1.add(14);
        list1.add(64);
        list1.add(49);
        list1.add(40);
        
        int max = list1.get(0);;
        int min = list1.get(0);;
        for(int i=1;i<list1.size();i++) {
            if(list1.get(i) > max) {
            max = list1.get(i);
            }
            if(list1.get(i) < min) {
            min = list1.get(i);
            }
        }
        System.out.println("Maximum Value is: " + max);
        System.out.println("Minimum Value is: " + min);

        //if the arraylist is sorted
        for(int i=0; i<list1.size(); i++) {
            if(list1.get(i) > list1.get(i+1)) {
            break;
            }
        }
        System.out.println("Array is not sorted");
    }
}
