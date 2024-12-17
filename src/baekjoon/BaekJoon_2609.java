package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2609 {
    public static void main(String[] args) throws IOException {
//        최소공배수와 최대 공약수
//         gcd,lcm
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());//큰수
        int b = Integer.parseInt(st.nextToken());//작은수
        int copya = a;
        int copyb = b;
        int temp = 0;

        while (true){
            if (b!=0){
                temp = a%b;
                a = b;
                b = temp;
            }else break;
        }
        int gcd = a;
        int lcm = copya*copyb/gcd;
        System.out.println(gcd + " " +lcm);
    }
}
