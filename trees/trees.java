package trees;
import java.util.*;
public class trees {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);            
            newNode.right = buildTree(nodes);            

            return newNode;
        }
        
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                } 
            } else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
        }

        public static int sumOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
            int sumLeftNodes = sumOfNodes(root.left);
            int sumRightNodes = sumOfNodes(root.right);
            return sumLeftNodes + sumRightNodes + root.data;
        }

        public static int height(Node root) {
            if(root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            // if(leftHeight > rightHeight) {
            //     return leftHeight + 1;
            // } else {
            //     return rightHeight + 1;
            // }
            int myHeight = Math.max(leftHeight, rightHeight) + 1;
            return myHeight;
        }

        public static int diameter(Node root) {
            if(root == null) {
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;
            return Math.max(Math.max(diam1, diam2), diam3);
        }

        static class treeInfo {
            int ht;
            int diam;

            treeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }

        public static treeInfo diameter2(Node root) {
            if(root == null) {
            return new treeInfo(0, 0);
        }
        treeInfo left  = diameter2(root.left);
        treeInfo right  = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2= right.diam;
        int diam3 = left.ht + right.ht + 1;
        
        int myDiam = Math.max(Math.max(diam1, diam2), diam3); 

        treeInfo myInfo = new treeInfo(myHeight, myDiam);
        return myInfo;
        }

        public static boolean isIdentical(Node root, Node subRoot) {
            if(root == null && subRoot == null) {
                return true;
            }
            if(root == null || subRoot == null) {
                return false;
            }
            if(root.data == subRoot.data) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }
            return false;
        }

        public static boolean isSubtree(Node root, Node subRoot) {
            if(subRoot == null) {
                return true;
            }
            if(root == null) {
                return false;
            }
            if(root.data == subRoot.data) {
                if(isIdentical(root, subRoot)) {
                    return  true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        public static int KthLevelSum(Node root, int level) {
            if(root == null) {
            return 0;
            }
        
            int i = 0;
            int sum = 0;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                i++;
                if(i == level) {
                sum = sumOfNodes(currNode);
                break;
                } else {
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
                }
            }
            }
            return sum;
        }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        inorder(root);
        postorder(root);
        levelOrder(root);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
        int subNodes[] = {2,4,-1,-1,5,-1,-1};
        Node subRoot = tree.buildTree(subNodes);
        if(isSubtree(root, subRoot)) {
            System.out.println("Yes the subtree is present");
        } else {
            System.out.println("Yes the subtree is not present");
        }

        //HOMEWORK PROBLEMS

        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree trees = new BinaryTree();
        Node rootMain = trees.buildTree(node);
        System.out.println(KthLevelSum(rootMain, 2));
    }
}
