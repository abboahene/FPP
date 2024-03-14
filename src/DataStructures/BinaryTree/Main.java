package DataStructures.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(1);
//        bst.insert(2);
//        bst.insert(3);
//        bst.insert(4);
//        bst.insert(5);
//        bst.insert(5);
//        bst.inOrderTraverse(bst.root);

        int[] arr = {25,12,36, 4, 15, 30, 45, 2, 10,13, 16, 29, 34, 40, 65};
        for(int a : arr){
            bst.insert(a);
        }
        bst.inOrderTraverse(bst.root);
        bst.deleleteNode(bst.root, 30);
        bst.inOrderTraverse(bst.root);

    }
}
