package programmers;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class hotter2 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int min = 0;
        int min2 =0;
        int count = 0;
        int answer = 0;
        Queue<Integer> pq1 = new PriorityQueue<>();
        for (int i =0;i < scoville.length;i++){
            pq1.add(scoville[i]);
        }
        while (pq1.peek() < k){
            if (pq1.size() <= 1){
                if (pq1.size() <= 1){
                    answer = -1;
                    break;
                }
                pq1.add(min+ min2*2);
                answer++;
        }
        }
        System.out.println(answer);
    }
}