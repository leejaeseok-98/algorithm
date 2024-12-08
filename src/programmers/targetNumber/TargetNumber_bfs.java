package programmers.targetNumber;

import java.util.LinkedList;
import java.util.Queue;

public class TargetNumber_bfs {
    public int solution(int[] numbers, int target) {
        int answer = 0; //cnt
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0); //시작부터 -1일 수 있으니까 0을 시작해서 1,-1을 연산한다.
        for (int i = 0; i < numbers.length; i++) { //노드의 수가 5개 이므로, 5deep까지 가야 한다.
            int size = queue.size(); //같은 레벨의 노드 poll하기 위해
            for (int j = 0; j < size; j++) {
                int sum = queue.poll();
                queue.add(sum + numbers[i]);
                queue.add(sum - numbers[i]);
            }
        }
        while (!queue.isEmpty()) {
            if (queue.poll() == target) {
                answer++;
            }
        }
        return answer;
    }

}
