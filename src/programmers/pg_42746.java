package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class pg_42746 {
    public static void main(String[] args) {
        int[] numbers = {6,10,2};
     }
}

class Solution2 {
    public String solution(int[] numbers) {
        String answer = "";

        List<String> list = new ArrayList<>();
        for (int i = 0; i < numbers.length;i++){
            list.add(String.valueOf(numbers[i]));
            list.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return (o1+o2).compareTo(o2+o1);
                }
            });
        }

        return answer;
    }
}