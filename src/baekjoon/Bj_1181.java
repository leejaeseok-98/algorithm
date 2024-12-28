package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Bj_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> set = new TreeSet<>();
        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];
        for (int i = 0;i<T;i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append("\n");

        for (int i = 1; i<T;i++){
            if (!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append("\n");
            }
        }
        System.out.println(sb);

        for (int i = 0; i<T;i++){
            set.add(br.readLine());
        }
        for (int i = 0; i< set.size();i++){

        }

//        for (int i = 0; i < set.size();i++){
//            if ()
//        }
    }
}
