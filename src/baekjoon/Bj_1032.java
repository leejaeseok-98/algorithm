package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        String[] arrstr = new String[T];

        for (int i =0; i<T;i++){
            arrstr[i] = br.readLine();
        }
        for (String string : arrstr) {
            char[] a = string.toCharArray();
        }


    }
}
