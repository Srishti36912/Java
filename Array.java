import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=95;
        int marks[]={97, 98, 95};
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i=0;i<3;i++) {
            System.out.println(marks[i]);
        }

        for(int i=0;i<size;i++) {
            numbers[i] = sc.nextInt();
        }

        //linear search
        int p=sc.nextInt();
        for(int i=0;i<size;i++) {
            if(numbers[i]==p) {
                System.out.println(p+" found at index "+i);
            }
        }

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int num[][] = new int[rows][cols];
        int x = sc.nextInt();

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                num[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(num[i][j] == x)
                System.out.println("x found at locations ("+ i + "," + j + ")");
            }
        }

        //HOMEWORK PROBLEMS

        int arraySize= sc.nextInt();
        String name[] = new String[arraySize];
        int number[] = new int[arraySize];
        
        for(int i=0;i<arraySize;i++) {
            name[i]= sc.next();
        }

        for(int i=0;i<arraySize;i++) {
            number[i]= sc.nextInt();
        }

        int min = number[0];
        int max = number[0];

        for(int i=1;i<arraySize;i++) {
            if(number[i]< min)
            min= number[i];
        }

        for(int i=1;i<arraySize;i++) {
            if(number[i]> max)
            max= number[i];
        }

        for(int i=0;i<arraySize;i++) {
            System.out.println(name[i]);
        }

        System.out.println("Maximum value = "+max);
        System.out.println("Minimum value = "+min);

        int c=0;
        for(int i=1;i<arraySize;i++) {
            if(number[i-1]> number[i]) {
                c++;
            }
        }

        if(c>0)
        System.out.println("It is not sorted");
        else
        System.out.println("It is sorted");

        int row = sc.nextInt();
        int col = sc.nextInt();
        int numBer[][] = new int[row][col];

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                numBer[i][j] = sc.nextInt();
            }
        }

        for(int j=0;j<col;j++) {
            for(int i=0;i<row;i++) {
                System.out.print(numBer[i][j]+ " ");
            }
            System.out.println();
        }

        String names[] = new String[3];
        
        for(int i=0; i<names.length;i++) {
            names[i] = sc.next();
        }
        int totLength = 0;
        for(int i=0;i<names.length;i++) {
            totLength = totLength + names[i].length();
        }
        System.out.println(totLength);


      //spiral order matrix
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[][] = new int[n][m];

    for(int i=0;i<n; i++) {
        for(int j=0; j<m; j++) {
        a[i][j] = sc.nextInt();
        }
    } 
    int row_start = 0;
    int column_start = 0;
    int row_end = n-1;
    int column_end = m-1;

    while(row_start <= row_end && column_start <= column_end) {

        for(int i=column_start; i<=column_end; i++) {
        System.out.print(a[row_start][i] + " ");
        }
        row_start++;

        for(int i=row_start; i<=row_end; i++) {
        System.out.print(a[i][column_end] + " ");
        }
        column_end--;

        for(int i=column_end; i>=column_start; i--) {
        System.out.print(a[row_end][i] + " ");
        }
        row_end--;

        for(int i=row_end; i>=row_start; i--) {
        System.out.print(a[i][column_start] + " ");
        }
        column_start++;

        System.out.println();
    }
    }
}
