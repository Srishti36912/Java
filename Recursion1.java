import java.util.ArrayList;
// import java.util.HashSet;
import java.util.*;
public class Recursion1 {
    public static void printNumb(int n) {
        if(n == 0) {
            return;
        }
            System.out.println(n);
            printNumb(n-1);
    }

    // public static void printNumb(int n) {
    //     if(n == 6) {
    //         return;
    //     }
    //         System.out.println(n);
    //         printNumb(n+1);
    // }

    public static void printSum(int i, int n, int sum) {
        if(i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i+1, n, sum);
    } 

    public static int calcFactorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calcFactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;

    }

    public static void printFib(int a, int b, int n ) {
        if(n == 0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    public static int calcPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        // int xPown = x * calcPower(x, n-1);
        // return xPown;

        if(n % 2 == 0) {
            return calcPower(x, n/2) * calcPower(x, n/2);
        } 
        else {
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }

    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to "+ dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to "+ dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void printRev(String str, int idx) {
        if(idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void findOcurrence(String str, int idx, char element) {
        if(idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element) {
            if(first == -1) {
                first = idx;
            }
            else {
                last = idx;
            }
        }
        findOcurrence(str, idx+1, element);
    }

    public static boolean isSorted(int arr[], int idx) {
        if(idx == arr.length-1) {
            return true;
        }
        if(arr[idx] < arr[idx+1]) {
            return isSorted(arr, idx+1);
        }
        else {
            return false;
        }
    }

    public static void countAllX(String str, int idx, int count, String newStr) {
        if(idx == str.length()) {
            for(int i=0;i<count;i++) {
                newStr += "x"; 
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x') {
            count++;
            countAllX(str, idx+1, count, newStr);
        }
        else {
            newStr += currChar;
            countAllX(str, idx+1, count, newStr); 
        }
    }

    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        } 
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']) {
            removeDuplicates(str, idx+1, newString);
        }
        else {
            newString += currChar ;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }

    public static void subsequences(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subsequences(str, idx+1, newString+ currChar);

        subsequences(str, idx+1, newString);
    }

    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        subsequences(str, idx+1, newString+ currChar, set);

        subsequences(str, idx+1, newString, set);
    }

    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combination) {
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0;i<mapping.length();i++) {
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void printPerm(String str, String permutation) {
        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }

    public static int countPaths(int i, int j, int m, int n) {
        if(i == n || j == m) {
            return 0;
        }
        if(i == n-1 || j == m-1) {
            return 1;
        }
        int downPaths = countPaths(i+1, j, m, n);

        int rightPaths = countPaths(i, j+1, m, n);

        return downPaths + rightPaths;
        
    }

    public static int placeTiles(int n, int m) {
        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }
        int verPlacements = placeTiles(n-m, m);

        int horPlacements = placeTiles(n-1, m);
        return verPlacements + horPlacements;
    }

    public static int callGuests(int n) {
        if(n <= 1) {
            return 1;
        }
        int ways1 = callGuests(n-1);

        int ways2 = (n-1) * callGuests(n-2);
        return ways1 + ways2;
    }

    public static void printSubset(ArrayList<Integer> subset) {
        for(int i=0;i<subset.size();i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if(n == 0) {
            printSubset(subset);
            return;
        }

        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void printPermutation(String str, String perm, int idx) {
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, perm+currChar, idx+1);
        }
    }

    //N-queens
    public boolean isSafe(int row, int col, char[][] board) {
        //horizontal
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }

        //vertical
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //upper right
        r= row;
        for(int c=col; c<board.length && r>=0; c++,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower left
        r = row;
        for(int c=col; r<board.length && c>=0; r++,c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower right
        for(int c=col; r<board.length && c<board.length; r++,c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++) {
            row = "";
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'Q')
                row += 'Q';
                else
                row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if(col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for(int row=0; row<board.length; row++) {
            if(isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

    //sudoku solver
    public boolean isSafess(char board[][], int row, int col, int number) {
        //row and column
        for(int i=0; i<board.length; i++) {
            if(board[i][col] ==  (char) (number +'0')) {
                return false;
            }
            if(board[row][i] ==  (char) (number +'0')) {
                return false;
            }
        }

        //grid
        int sc = (col/3) * 3;
        int sr = (row/3) * 3;

        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(board[i][j] ==  (char) (number +'0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helperss(char[][] board, int row, int col) {
        if(row == board.length) {
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = nrow + 1;
            ncol = 0;
        }

        if(board[row][col] == '.') {
            if(helperss(board, nrow, ncol)) {
                return true;
            }
        }else {
            for(int i=1; i<=9; i++) {
                if(isSafess(board, row, col, i)) {
                    board[row][col] = (char) (i +'0');
                    if(helperss(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][]board) {
        helperss(board, 0, 0);
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        //  int n = 5;
        //  int x = 2;
        // int n = 7;
        // int a = 0, b = 1;
        // int n = 3;
        // String str = "abcd";
        // String str = "abaacdaefaah";
        // int arr[] = {1, 3, 5};
        // String str = "axbcxxd";
        // String str = "abbccda";
        // String str = "abc";
        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // String str = "23";

        // String str = "abc";
        // int m = 3, n = 3;
        // int m = 2, n = 4;
        // int n = 4;
        // int n = 3;
        // ArrayList<Integer> subset = new ArrayList<>(); 
        
        // String str = "ABC";


        // printNumb(n);
        // printSum(1, 5, 0);

        //  int ans = calcFactorial(n);
        //  System.out.println(ans);

        // System.out.println(a);
        // System.out.println(b);
        // printFib(a, b, n-2);

        // int ans = calcPower(x, n);
        // System.out.println(ans); 
        // towerOfHanoi(n, "S", "H", "D");
        // printRev(str, str.length()-1);
        // findOcurrence(str, 0, 'a');
        // System.out.println(isSorted(arr, 0));
        // countAllX(str, 0, 0, "");
        // removeDuplicates(str, 0, "");
        // subsequences(str, 0, "", set);
        // printComb(str, 0, "");

        // printPerm(str, "");
        // int totalPaths = countPaths(0, 0, m, n);
        // System.out.println(totalPaths);
        // System.out.println(placeTiles(n, m));
        // System.out.println(callGuests(n));
        // findSubsets(n, subset);

        // printPermutation(str, "", 0);

        //solve Sudoku
        // char[][] board = new char[9][9];

        // for(int i=0; i<=9; i++) {
        //     for(int j=0; j<=9; j++) {
        //         board[i][j] = sc.next().charAt(0);
        //     }
        // }
        // solveSudoku(board);
        
    }
}