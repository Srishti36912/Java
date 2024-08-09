import java.util.*;
public class bitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        //  int pos = 2;
        int pos = 1;
        int oper = sc.nextInt();
        int bitMask = 1<<pos;
        
        int notBitMask = ~(bitMask);

        int newNumber = bitMask | n;
        System.out.println(newNumber);
        if(oper == 1) {
            int newNum = bitMask | n;
            System.out.println(newNum);
        }
        else {
            int NotBitMask = ~(bitMask);
            int newNum = NotBitMask & n;
            System.out.println(newNum);
        }
        int newNum = notBitMask & n;
        System.out.println(newNum);


        if((bitMask & n) == 0)
            System.out.println("bit was zero");
            else
            System.out.println("bit was one");


        //HOMEWORK PROBLEM

        //toggle a bit
        int position = 2;
        if((bitMask & n) == 0 ) {
            int newNumBer = bitMask | n;
            System.out.println(newNumBer);  
        }
        else {
            int notBitMasK = ~ (bitMask);
            int newNumBer = notBitMasK & n; 
            System.out.println(newNumBer);
        }

        //power of 2
        int number = sc.nextInt();
        int pos1 = 0;
        while(number > 0) {
            if((number & 1) == 1) {
            pos1++;
            }
            number = number >> 1;
        }
        if(pos1 == 1) {
            System.out.println("Number is a power of 2");
        }  
        else 
            System.out.println("Number is not a power of 2");

        // count no of 1's
        int num = sc.nextInt();
        int c = 0;
        while (num > 0) {
            if((num & 1) == 1) {
            c++;
            }
            num = num >> 1;
        }
        System.out.println("Number of 1's =  "+c);

        //decimal to binary
        int x = sc.nextInt();

        decimalToBinary(x);
        binaryToDecimal(x);

    }

    //decimal to binary
    public static void decimalToBinary(int n) {
        String s = "";
        while (n > 0) {
            s = (n & 1) + s;
            n = n >> 1;
        }
        System.out.println(s);
    }

    //binary to decimal
    public static void binaryToDecimal(int n) {
        int sum = 0;
        int c = 0;
        int i = 0;
        while (n > 0) {
        c = (n & 1) * (int) Math.pow(2,i);
        sum = sum + c;
        n = n >> 1;
        i++;
        }
        System.out.println(sum);
        
    }
}
