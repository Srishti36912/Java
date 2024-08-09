import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.next();

        printMyName(name);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum= calculateSum(a,b);
        System.out.println(sum);

        System.out.println(calculateProduct(a, b));
        int n=sc.nextInt();
        
        printFactorial(n);

        //HOMEWORK PROBLEMS

        System.out.println("Enter the number of elements");
        int number = sc.nextInt();

        System.out.println("Enter the number");
        int x = sc.nextInt();
        
        int p=0; int ne=0; int z=0;
        int r= sc.nextInt();
        int s= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int age= sc.nextInt();

        System.out.println("Enter the power");
        int num= sc.nextInt();
        

        System.out.println("The new number will be "+givePower(x, num));

        for(int i=1;i<=num;i++) {
            System.out.println("Enter the element");
            int y= sc.nextInt();
            if(y>0) {
            p++;
            }
            else if(y<0) {
            ne++;
            }
            else if(y==0) {
            z++;
            }
            else {
            System.out.println("Invalid");
            }
            y=0;
        }
        System.out.println("Positive numbers= "+p);
        System.out.println("Negative numbers= "+ne);
        System.out.println("Zeros = "+z);
        int k=0; int l=1;
        System.out.print(k+" ");
        System.out.print(l+" ");
        int m=k+l;
        System.out.print(m+" ");
        for(int i=4;i<=10;i++) {
            int q= m+l;
            System.out.print(q+" ");
            l=m;
            m=q;
        }

        int u= sc.nextInt();
        int v= sc.nextInt();

        System.out.println("Greatest Common Divisor is "+greatestCommonDivisor(u,v));
        int w= sc.nextInt();
        

        checkPrime(number);
        checkEven(number);
        printTable(number);
        printAverage(a,b,c);
        printOddSum(w);
        System.out.println("Circumference is " +findCircumference(r));
        canVote(age);
    }

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int calculateSum(int a, int b) {
        int sum= a+b;
        return sum;
    }

    public static int calculateProduct(int a, int b) {
        return a*b;
    }

    public static void printFactorial(int n) {
        if(n<0) {
            System.out.println("Invalid");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--) {
            factorial= factorial* i;
        }
        System.out.println(factorial);
    }

    //HOMEWORK PROBLEMS

    public static void checkPrime(int n) {
        int c=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println("Number is Prime");
        else
        System.out.println("Number is not Prime");

    }

    public static void checkEven(int n) {
        if(n%2==0)
        System.out.println("Number is Even");
        else
        System.out.println("Number is not Even");

    }

    public static void printTable(int n) {
        for(int i=1;i<=10;i++) {
            System.out.println(n*i);
        }
    }

    public static void printAverage(int a, int b, int c) {
        int avg= (a+b+c)/3;
        System.out.println(avg);
    }

    public static void printOddSum(int a) {
        int c=0;
        for(int i=1;i<=a;i++) {
        if(i%2!=0)
        c= c+i;
        }
        System.out.println(c);
    }

    public static void isGreater(int a, int b) {
    if(a>b)
    System.out.println(a+"is greater");
    else   
    System.out.println(b+"is greater");
    }

    public static double findCircumference(int r) {
        return 2*3.14*r;
    } 

    public static void canVote(int age) {
            if(age>=18)
            System.out.println("Person is eligible to vote");
            else
            System.out.println("Person is eligible to vote");
    }

    public static int givePower(int x, int n) {
        int num=1;
        for(int i=1;i<=n;i++) {
            num=num*x;
        }
        return num;
    }
    
    public static int greatestCommonDivisor(int a,int b) {
        int c=0;
        if(a>b){
        for(int i=1;i<=a;i++) {
            if(a%i==0) {
                if(b%i==0) {
                    c=i;
                }
            }
        }
    }
    else {
        for(int i=1;i<=b;i++) {
            if(b%i==0) {
                if(a%i==0) {
                    c=i;
                }
            }
        }
    }
    return c;
    }
}
