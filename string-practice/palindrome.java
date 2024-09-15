import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="", rev="";
        System.out.println("Enter a string");
        s = sc.nextLine();

        for(int i=0; i<s.length(); i--) {
            char c = s.charAt(i);
            rev = c + rev;
        }
        if(s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
