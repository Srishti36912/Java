package array_practice;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        // m = Integer.max();
        // System.out.println(m);
        int max = a[0];
        int min = a[0];
        for(int i=1; i<a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            } else if(min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
