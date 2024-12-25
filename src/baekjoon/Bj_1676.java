package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String fac = String.valueOf(factorial(n));
        char[] ch = fac.toCharArray();
        int count = 0;
        for (char c : ch) {
            if (c == '0'){
                count++;
            }
        }
        System.out.println(count);

    }
    static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }
}


