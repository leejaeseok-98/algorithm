package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bj_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int number = 666;

        while (count != n){
            number++;
            if (String.valueOf(number).contains("666")){
                count++;
            }

        }
        System.out.println(number);
    }
}
