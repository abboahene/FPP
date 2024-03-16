package Practice;

import java.util.LinkedList;

public class BinarySearchTree {
   private class Node {
        int val;
        Node right;
        Node left;

        Node(int val){
            this.val = val;
        }

        @Override
        public String toString() {
            return val + " -> ";
        }
    }

    public Node root;

    BinarySearchTree(int val){
        Node root = new Node(val);
        root.val = val;
        this.root = root;
    }

    public Node add(Node root, int val){
        Node newNode = new Node(val);
        if(root == null) {
            root = newNode;
            return root;
        }
        if(val > root.val){
            root.right = add(root.right, val);
        }
        if(val < root.val){
            root.left = add(root.left, val);;
        }
        return root;
    }

    public boolean search(Node root, int val){
        if(root == null) return false;
        if(root.val == val) return true;

        if(val > root.val){
            return search(root.right, val);
        }
        return search(root.left, val);
    }

    public Node remove(Node root, int val){
        if(root == null) return root;
        if(root.val == val){
            if(root.left == null){
               return root.right;
            }

            if(root.right == null){
                return root.left;
            }

            Node succ = findSuccessor(root);
            root.val = succ.val;
            root.right = remove(root.right, succ.val);
            return root;
        }
        if(val > root.val) root.right = remove(root.right, val);
        else root.left = remove(root.left, val);
        return root;
    }

    private Node findSuccessor(Node root){
        Node curr = root.right;
        while(curr!= null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    public void inOrderTraversal(Node root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }
    public void preOrderTraversal(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void postOrderTraversal(Node root){
        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(25);
        bst.add(bst.root, 12);
        bst.add(bst.root,36);
        bst.add(bst.root,4);
        bst.add(bst.root,15);
        bst.inOrderTraversal(bst.root);
        bst.remove(bst.root, 15);
        bst.inOrderTraversal(bst.root);
        System.out.println(bst.search(bst.root, 31));
    }

}
