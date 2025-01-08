package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj좋다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());//테스트 수
        int[] arr = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i =0;i<T;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 0; i<T;i++){
            int target = arr[i];
            int start = 0;
            int end = T-1;

            while (start < end){
                int sum = arr[start]+arr[end];
                if (sum == target){
                    if (start != i && end != i){
                        count++;
                        break;
                    }
                }
                else if (sum < target){
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.println(count);
    }
}
