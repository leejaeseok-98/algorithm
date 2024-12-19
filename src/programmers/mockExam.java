package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mockExam {
    public static void main(String[] args) {
            int[] answers = {1,2,3,4,5};
        Solution sol = new Solution();
        System.out.println(sol.solution(answers));
    }

}

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[answers.length];
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        for (int i = 0;i < answer.length;i++){
            if (answers[i] == student1[i % student1.length]){
                ++score[0];
            }
            if (answers[i] == student2[i % student2.length]){
                ++score[1];
            }
            if (answers[i] == student3[i%student3.length]){
                ++score[2];
            }
        }

        int MaxScore = Math.max(score[0],Math.max(score[1],score[2]));
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < MaxScore;i++){
            if (score[i]==MaxScore){
                result.add(i+1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}