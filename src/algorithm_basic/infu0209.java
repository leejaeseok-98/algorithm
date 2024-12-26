package algorithm_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class infu0209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int[][] arr = new int[n][n];
        for (int i = 0;i< n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                int sum = 0;
                sum += arr[i][j];
                if (max < sum){
                    max = sum;
                }
            }
        }

        for (int i = 0;i<n;i++){
            
        }

        for (int i = 0; i<n;i++){
            for (int j = 0;j<n;j++){
                int sum = 0;
                sum += arr[j][i];
                if (max < sum){
                    max = sum;
                }
            }
        }

        for (int i = 0;i<n;i++){
            int sum = 0;
            sum += arr[i][i];
            if (max < sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
