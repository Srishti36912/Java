package array_practice;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=4; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
