package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        while (true) {
            int num = Integer.parseInt(br.readLine());
            int num2 = num;
            if (num == 0){
                break;
            }
            answer = 0;
            while (num2 != 0){
                int digit = num2 % 10;
                answer = answer * 10 + digit;
                num2 /= 10;
            }
            if (num == answer){
                System.out.println("yes");
            }
            else {System.out.println("no");}
        }

    }
}
