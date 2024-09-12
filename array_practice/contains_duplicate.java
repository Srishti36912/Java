package array_practice;

import java.util.*;

public class contains_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        int m = 0;
        int c = 0;
        for(int i=0; i<5; i++) {
            array[i] = sc.nextInt();
        }
        while(m<5) {
        for(int i=0; i<4; i++) {
            if(m == i) {
                continue;
            }
            else
            {
                if(array[m] == array[i]) {
                    c++;
                    break;
                }
            }
        }
        m++;
        }
        if(c>0) {
            System.out.println("Contains Duplicate");
        } else {
        System.out.println("Does not contain duplicate");
        }
    }
}
