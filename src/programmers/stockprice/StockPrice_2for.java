package programmers.stockprice;

public class StockPrice_2for {
    private static int[] solution(int[] prices) {
        int[] answer = new int [prices.length];
            for (int i = 0; i < prices.length; i++) {
                int cnt = 0;
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[i] >= prices[j]) {
                        cnt++;
                    } else break; //문제점 : 다음 가격동안은 시간이 흐르므로 맨 마지막요소 빼고 기본적으로 +1이 생성된다.
                }
                answer[i] = cnt;
            }
            return answer;
        }
}
