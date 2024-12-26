package algorithm_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class P_0208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer>list = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i<T;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            list.add(arr[i]);
        }
        list.sort(Comparator.reverseOrder());
        for (int i = 0; i<T;i++){
            int cnt = 0;
            for (int j = 0; j <T;j++){
                if (list.get(i) == arr[j]){
                    arr[j] = i;
                    if (arr[j] == arr[j-1]){


                    }
//                    만약 i가 중복되면 카운트 증가
                }

            }
        }
        System.out.println(list);
    }
}
