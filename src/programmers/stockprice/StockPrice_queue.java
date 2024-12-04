package programmers.stockprice;
import java.util.LinkedList;
import java.util.Queue;

public class StockPrice_queue {

    class Solution {
        public int[] solution(int[] prices) {
            int n = prices.length;
            int[] answer = new int[n];
            Queue<Integer> queue = new LinkedList<>();

            // 큐에 모든 가격의 인덱스를 추가
            for (int i = 0; i < n; i++) {
                queue.add(i);
            }

            while (!queue.isEmpty()) {
                int i = queue.poll(); // 큐에서 인덱스를 하나 꺼냄
                int cnt = 0;

                // 꺼낸 인덱스 이후로 가격 비교
                for (int j = i + 1; j < n; j++) {
                    cnt++;
                    if (prices[i] > prices[j]) { // 가격이 떨어지면 종료
                        break;
                    }
                }

                answer[i] = cnt; // 유지 시간을 저장
            }

            return answer;
        }
    }

}
