package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//증복제거 / 오름차순
public class Bj_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> numbers = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i<n;i++){
            numbers.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numbers);

        for (int num : numbers){
            bw.write(num+"\n");
        }
        bw.flush();
        bw.close();
    }
}
