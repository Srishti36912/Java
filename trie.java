public class trie {
    static class Node {
        Node [] children;
        boolean eow;

        public Node() {
            children = new Node[26];//a-z
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    //could be asked - imp
    public static void insert(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                //add new node
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int i=0; i<key.length(); i++) {
            int idx = key.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                return false;
            }
            if(i == key.length()-1 && curr.children[idx].eow == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    //word break problem
    public static boolean wordBreak(String key) {
        if(key.length() == 0) {
            return true;
        }
        for(int i=1; i<=key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);
            if(search(firstPart) && wordBreak(secPart)) {
                return true;
            }
        }
        return false;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    //count unique substrings
    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        for(int i=0; i<26; i++) {
            if(root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static String ans ="";

    //longest word containing all prefixes
    public static void longestWord(Node root, StringBuilder temp) {
        if(root == null) {
            return;
        }
        for(int i=0; i<26; i++) {
            if(root.children[i] != null && root.children[i].eow == true) {
                temp.append((char) (i + 'a'));
                if(temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String word[] = {"the","a","there","their","any"};
        String wrds[] = {"i","like","sam","samsung","mobile"};
        String wrd[] = {"apple","app","mango","man","woman"};
        String key = "ilikesamsung";
        String prefix = "app";
        for(int i=0; i<word.length; i++) {
            insert(word[i]);
        }

        for(int i=0; i<wrds.length; i++) {
            insert(wrds[i]);
        }

        for(int i=0; i<wrd.length; i++) {
            insert(wrd[i]);
        }

        String str = "ababa";
        for(int i=0; i<str.length(); i++) {
            String substr = str.substring(i);
            insert(substr);
        }

        String words[] = {"a","banana","app","appl","ap","apply","apple"};

        for(int i=0; i<words.length; i++) {
                insert(words[i]);
            }

        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));

        System.out.println(wordBreak(key));

        System.out.println(startsWith(prefix));

        System.out.println(countNodes(root));

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
