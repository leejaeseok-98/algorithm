package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj카드정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());//테스트케이스 수
        int sum = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i =0; i<T; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        while (!pq.isEmpty()){
            int a = pq.poll();
            if (pq.peek() != null){
                int b = pq.poll();
                int c = a + b;
                pq.add(c);
                sum += c;
            }
        }
        System.out.println(sum);
    }
}
