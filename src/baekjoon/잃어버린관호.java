package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 잃어버린관호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] b = a.split("[-+]");//숫자 뽑음
        String[] c = a.split("[0-9,]+");
        for (int i = c.length-1;i<)
        Arrays.sort(b);

        System.out.println(Arrays.toString(c));
    }
}
