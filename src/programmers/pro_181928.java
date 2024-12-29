package programmers;

import java.util.*;

public class pro_181928 {
    public static void main(String[] args) {
        int[] num_list = {3,4,5,2,1};
        int num_list_len = num_list.length;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            int answer = 0;
            for (int i = 0;i<num_list.length;i++){
                if (num_list[i] % 2 != 0){
                    sb.append(num_list[i]);
                } else if (num_list[i] % 2 == 0) {
                    sb2.append(num_list[i]);
                }

            }
                int a = Integer.parseInt(sb.toString());
                int b = Integer.parseInt(sb2.toString());
                answer = a+b;
            System.out.println(answer);
    }
}
