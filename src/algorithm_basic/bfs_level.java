package algorithm_basic;

import java.util.*;

class  Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt=rt=null;
    }
}

public class bfs_level {
    Node root;

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0; //레벨
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + "");
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);

            }
            L++;
            System.out.println();
        }
    }


            public static void main (String[]args){
                bfs_level tree = new bfs_level();
                tree.root = new Node(1);
                tree.root.lt = new Node(2);
                tree.root.rt = new Node(3);
                tree.root.lt.lt = new Node(4);
                tree.root.lt.rt = new Node(5);
                tree.BFS(tree.root);
            }
        }
