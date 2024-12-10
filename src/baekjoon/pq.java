package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class pq {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer>pq = new PriorityQueue<>();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i<num;i++){
            int num2 = Integer.parseInt(br.readLine());
            if (num2 == 0){
                if (pq.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(pq.poll());
                }
            }else pq.add(num2);
        }
    }
}
