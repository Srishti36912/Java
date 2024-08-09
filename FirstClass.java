import java.util.*;
class FirstClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello World");
        System.out.print("Hello World\n");
        System.out.println("Hello World");

        String name="Tony Stark";
        int age=25;
        double price= 25.25;

        int a=10;
        int b=25;
        int sum = a+b;
        int diff= b-a;
        System.out.println(sum);
        System.out.println(diff);

        String studentName= sc.next();
        System.out.println(studentName);

        int studentAge;
        studentAge=sc.nextInt();
        if(studentAge>18) {
        System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }

        int x=sc.nextInt();
        if(x%2 ==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        int p=sc.nextInt();
        int q=sc.nextInt();
        if(p==q) {
            System.out.println("Equal");
        }
        else if(p>q) {
            System.out.println(p+" is greater");
        }
        else {
            System.out.println(q+" is greater");
        }

        for(int counter=0;counter<10;counter = counter+1) {
            System.out.println("Hello World");
        }
        for(int counter=0;counter<11;counter = counter+1) {
            System.out.println(counter);
        }
        int i=0;
        while(i<11) {
            i++;
        }
        do {
            System.out.println(i);
            i++;
        }while(i<11);

        String firstName = "tony";
        String lastName = "stark";
        // String fullName =sc.nextLine();
        String fullName = firstName+ "@" + lastName;

        System.out.println(fullName.length());

        for(int j=0;j<fullName.length();j++) {
            System.out.println(fullName.charAt(j));
        }

        if(new String("Tony").compareTo(new String("Tony")) == 0) 
            System.out.println("Strings are equal");
            else 
            System.out.println("Strings are not equal");

            String sentence = "TonyStark";
            String name1 = sentence.substring(4);
            System.out.println(name1);

        //HOMEWORK PROBLEMS

        System.out.println("*\n**\n***\n****");
        int a1= sc.nextInt();
        int b1= sc.nextInt();
        int sum1= a1+b1;
        System.out.println(sum1);
        System.out.println("Choose any number between 1 and 3"); 
        int button = sc.nextInt();
        switch(button) {
            case 1: 
            System.out.println("Hello");
            break;
            case 2: 
            System.out.println("Namaste");
            break;
            case 3: 
            System.out.println("Bonjour");
            break;
            default:
            System.out.println("Wrong Choice");
        }
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        System.out.println("Choose any number between 1 and 5"); 
        int button1 = sc.nextInt();
        switch(button1) {
            case 1: int sum2= a2+b2;
            System.out.println(sum2);
            break;
            case 2: int diff2= a2-b2;
            System.out.println(diff2);
            break;
            case 3: int mul= a2*b2;
            System.out.println(mul);
            break;
            case 4: int div= a2/b2;
            System.out.println(div);
            break;
            case 5: int rem= a2%b2;
            System.out.println(rem);
            break;
            default:
            System.out.println("Wrong Choice");
        }
        int n=sc.nextInt();
        int Sum=0;
        for(int y=1;y<n+1;y++) {
            Sum=Sum+y;
        }
        System.out.println(Sum);
    
        int n1=sc.nextInt();
        int totalSum=1;
        for(int k=1;k<=10;k++) {
            totalSum=n1*k;
            System.out.println(totalSum);
        }
    System.out.println("Enter a number between 1 to 12 for months");
    int choice= sc.nextInt();
    switch(choice) {
        case 1: 
            System.out.println("January");
            break;
            case 2:
            System.out.println("February");
            break;
            case 3: 
            System.out.println("March");
            break;
            case 4: 
            System.out.println("April");
            break;
            case 5: 
            System.out.println("May");
            break;
            case 6: 
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("October");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
            default:
            System.out.println("Wrong Choice");
        }
    int m=sc.nextInt();
    for(int h=0;h<=m;h++) {
        if(h % 2 == 0) {
            System.out.print(h + " ");
        }
    }

    int n2=sc.nextInt();
    int c=0;
    for(int r=2;r<n2;r++) {
        if(n2%r==0)
        c++;
    }
    if(c>0){
        System.out.println("Not Prime");
    }
    else {
        System.out.println("Prime");
    }
    
    System.out.println("Enter 1 or 0");
        int x1=sc.nextInt();
    do {
        System.out.println("Enter number out of 100");
        int num=sc.nextInt();
        if(num>=90) {
            System.out.println("This is Good");
        }
        else if(num>=60 || num<=89) {
            System.out.println("This is also Good");
        }
        else {
            System.out.println("This is also Good");
        }
        }while(x1==1);
    }
}