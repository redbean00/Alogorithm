package Baekjoon;

import java.util.*;

public class No_9934 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = (int)Math.pow(2, sc.nextInt()) - 1;

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            list.add(sc.nextInt());
        }

        Node root = buildTree(list, 0, list.size() - 1);
        printTree(root);

    }

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

    }

    static Node buildTree(List<Integer> inorder, int start, int end){
        if(start > end) return null;

        int i = (start + end) / 2;
        Node node = new Node(inorder.get(i)); //root

        if(start == end)
            return node;

        node.left = buildTree(inorder, start, i - 1);
        node.right = buildTree(inorder, i + 1, end);
        return node;
    }

    static void printTree(Node root){
        StringBuilder st = new StringBuilder();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i = 0; i < n; i++){
                Node node = queue.poll();
                st.append(node.data + " ");
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            st.append("\n");
        }

        System.out.println(st.toString());
    }
}
