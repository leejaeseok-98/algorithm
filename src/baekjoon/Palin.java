package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        while (true) {
            for (int i = 0; i < num; i++) {
                int digit = num % 10;
                answer = answer * 10 + digit;
                num /= 10;
            }
        }
    }
}
