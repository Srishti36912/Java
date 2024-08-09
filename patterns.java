public class patterns {
    public static void main(String[] args) {
        //solid rectangle
        for(int i=0;i<4;i++) {
            for(int j=0;j<5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         //hollow rectangle
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=5;j++) {
                if(i==1 || j==1 || i==4 || j==5)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }

         //half pyramid
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         //inverted half pyramid
        for(int i=4;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         //inverted half pyramid(rotated by 180deg)
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=4-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

         //half pyramid with numbers
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

         //inverted half pyramid with numbers
        for(int i=5;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

         //floyd's triangle
        int c=0;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                c=c+1;
                System.out.print(c+" ");
            }
            System.out.println();
        }

         //0-1 triangle
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                if((i+j)%2==0) {
                    System.out.print("1"+" ");
                }
                else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }

         //Butterfly pattern
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int spaces = 2* (5-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int spaces = 2* (5-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         //Solid rhombus
        for(int i=1;i<=5;i++) {
            int sp = 5-i;
            for(int j=1;j<=sp;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         //Number pyramid
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=(5-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

         //Palindromic pattern
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5-i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }

         //Diamond pattern
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=(4-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--) {
            for(int j=1;j<=(4-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++) {
                System.out.print("*");
            }
        System.out.println();  
        }

        //HOMEWORK PROBLEMS


                //hollow butterfly
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                if(j==1||j==i||i==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            int spaces = 2* (5-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                if(j==1||j==i||i==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                if(j==1||j==i||i==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            int spaces = 2* (5-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                if(j==1||j==i||i==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        //hollow rhombus
        for( int i=1;i<=5;i++) {
            for(int j=1;j<=(5-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++) {
                if(i==1||j==1||i==5||j==5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        //half pyramid
        for( int i=1;i<=5;i++) {
            for(int j=1;j<=(5-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //inverted half pyramid
        for(int i=1;i<=4;i++) {
            for(int j=4;j>=i;j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        //pascal triangle
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=(5-i);j++) {
                System.out.print(" ");
            }
            int numb=1;
            for(int j=1;j<=i;j++) {
                System.out.print(numb+" ");
                 numb = numb *(i-j)/j;
            } 
            System.out.println();
        }
    }
}
