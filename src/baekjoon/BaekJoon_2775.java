package baekjoon;
import java.util.Scanner;

public class BaekJoon_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수 입력
        int t = sc.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            // 층과 호 입력
            int k = sc.nextInt(); // 층
            int n = sc.nextInt(); // 호

            // 아파트 배열 생성 (k층 x n호)
            int[][] apt = new int[k + 1][n + 1];

            // 0층 초기화 (1호부터 n호까지)
            for (int i = 1; i <= n; i++) {
                apt[0][i] = i;
            }

            // 나머지 층 계산
            for (int floor = 1; floor <= k; floor++) {
                for (int room = 1; room <= n; room++) {
                    apt[floor][room] = apt[floor - 1][room] + apt[floor][room - 1];
                }
            }

            // k층 n호 출력
            System.out.println(apt[k][n]);
        }

        sc.close();
    }
}
