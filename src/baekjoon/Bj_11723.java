package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> listAll = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0;i < n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (str.equals("add")){
                if (!list.contains(num)){
                    list.add(num);
                }
            } else if (str.equals("check")) {
                if (!list.contains(num)){
                    System.out.println(0);
                }else {
                    System.out.println(1);
                }
            }
            else if (str.equals("remove")) {
                if (list.contains(num)){
                    list.remove(num);
                }
            }
            else if (str.equals("toggle")) {
                if (list.contains(num)){
                    list.remove(num);
                }
                else {
                    list.add(num);
                }
            }
            else if (str.equals("all")) {

            }
            else if (str.equals("empty")) {

            }
        }
    }
}
