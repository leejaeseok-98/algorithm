package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 3; i> 0 ; i--){
            String a = br.readLine();
            if (a.matches("^[0-9]*$")){
                int b = Integer.parseInt(a) + i;
                if (b % 3 == 0){
                    if (b % 5 == 0){
                        System.out.println("FizzBuzz");
                        return;
                    }
                    else {
                        System.out.println("Fizz");
                        return;
                    }
                } else if (b % 5 == 0) {
                    System.out.println("Buzz");
                    return;
                }
                else {
                    System.out.println(b);
                    return;
                }
            }
        }
    }
}
