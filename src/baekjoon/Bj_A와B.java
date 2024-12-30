package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_A와B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Test = br.readLine();//A
        StringBuilder object = new StringBuilder(br.readLine());//B

        while (Test.length() < object.length()){
            if (object.charAt(object.length()-1) == 'B'){
                object = new StringBuilder(object.substring(0, object.length() - 1));
                object.reverse();
            }
            else if (object.charAt(object.length()-1) == 'A'){
                object = new StringBuilder(object.substring(0, object.length() - 1));
            }
        }

        if (Test.equals(object.toString())){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
