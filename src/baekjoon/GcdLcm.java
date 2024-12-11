package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GcdLcm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[2];
        int min = 0;
        int gcd = 1;
        int lcm = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

//        최소공배수
        if (a > b){
            min = b;
        }else {
            min = a;
        }
        for (int i =0; i<min;i++){
            if (a % i == 0 && b % i == 0){
                gcd *= i;

            }

        }
//        최대공약수

    }
}
