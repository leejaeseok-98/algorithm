package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//v는 나무막대 길이
//A는  낮에 올라가는 길이
//B는 밤에 떨어지는 길이
//총 정상까지 얼마나 걸리나
public class Bj_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());//낮에 올라가는 높이
        int B = Integer.parseInt(st.nextToken());//밤에 떨어지는 높이
        int V = Integer.parseInt(st.nextToken());//나무 막대 높이
        int day = (V-B)/(A - B);
        if ((V-B)%(A -B) != 0){
            day++;
        }
        System.out.println(day);
    }
}
