package CrioDsa101.trees;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode node = CreateBinaryTree();
        preOrder(node,list);
        System.out.println("---------Data----------");
        System.out.println(list.toString());
    }

    private static void preOrder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
//            list.add(-1);
            return;
        }
        list.add(node.data);
        preOrder(node.left,list);
        preOrder(node.right,list);
    }
    private static void postOrder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        postOrder(node.left,list);
        postOrder(node.right,list);
        list.add(node.data);
    }
    private static void inOrder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        inOrder(node.left,list);
        list.add(node.data);
        inOrder(node.right,list);
    }

    static TreeNode CreateBinaryTree() {
       TreeNode root = null;
       System.out.println("Enter the value of node");
       int data = sc.nextInt();
       if(data==-1){
           return null;
       }
       root = new TreeNode(data);
       System.out.println("Enter the value of left " + root.data + " child");
       root.left = CreateBinaryTree();
       System.out.println("Enter the value of right " + + root.data +" child");
       root.right = CreateBinaryTree();

       return root;
    }
}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}