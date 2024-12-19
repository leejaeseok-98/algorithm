package programmers;

import java.util.ArrayDeque;
import java.util.Deque;

public class fuga2 {
    public static void main(String[] args) {
        String s = ")()(";
        boolean answer = true;
        Deque<Character> dq = new ArrayDeque<>();

        for (char a : s.toCharArray()) {
            if (a == '('){
                dq.addLast(a);
            } else if (a == ')') {
                if (dq.isEmpty()){
                    answer = false;
                    }
                }
            }
        }
}
