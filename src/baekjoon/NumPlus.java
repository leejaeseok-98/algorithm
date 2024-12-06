package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumPlus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 숫자를 몇개 받을 지
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
