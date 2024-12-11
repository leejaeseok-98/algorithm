package programmers;

import java.util.*;

public class fuga {
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
