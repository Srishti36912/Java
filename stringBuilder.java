public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        StringBuilder sb1 = new StringBuilder("h");
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'P');
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);

        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");

        System.out.println(sb1.length());

        for(int i=0;i<sb2.length()/2;i++) {
            int front = i;
            int back = sb2.length()-1-i;

            char frontChar = sb2.charAt(front);
            char backChar = sb2.charAt(back);

            sb2.setCharAt(front, backChar);
            sb2.setCharAt(back, frontChar);
        }
        System.out.println(sb2);

        //HOMEWORK PROBLEMS

        StringBuilder SB = new StringBuilder("endea");
        StringBuilder SB1 = new StringBuilder("helloWorld123@gmail.com");

        for(int i=0;i<SB.length();i++) {
            if(SB.charAt(i) == 'e') {
                SB.setCharAt(i, 'i');
            }
        }
        System.out.println(SB);
        
        for(int i=0;i<SB1.length();i++) {
            if(SB1.charAt(i) == '@') {
            SB1.delete(i, SB1.length());
            }
        }
        System.out.println(SB1);

    }
}
