package algorithm_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class infu0208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0;i< n;i++){
            int count = 1;
            for (int j =0;j< n;j++){
                if (arr[i] < arr[j]){
                    count++;
                }
            }
            sb.append(count).append(" ");
        }
        System.out.println(sb.toString());
    }
}
