<<<<<<< HEAD
import java.util.*;

public class Main {
    static int[][] map;             // 지도 정보
    static boolean[][] visited;     // 방문 체크 배열
    static int n;                   // 지도 크기
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 방향 벡터
    static int[] dy = {0, 0, -1, 1};
    static List<Integer> complexSizes = new ArrayList<>(); // 단지 크기를 저장하는 리스트

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        map = new int[n][n];
        visited = new boolean[n][n];

        // 지도 정보 입력
        for (int i = 0; i < n; i++) {
            String line = scanner.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j) - '0'; // 문자 '0', '1'을 숫자로 변환
            }
        }

        // 단지 탐색
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) { // 방문하지 않은 집
                    int size = dfs(i, j);              // 단지 크기 계산
                    complexSizes.add(size);
                }
            }
        }

        // 결과 출력
        Collections.sort(complexSizes); // 크기 오름차순 정렬
        System.out.println(complexSizes.size()); // 단지 수 출력
        for (int size : complexSizes) {
            System.out.println(size); // 각 단지 크기 출력
        }
    }

    // DFS를 이용해 단지 크기 계산
    static int dfs(int x, int y) {
        visited[x][y] = true; // 현재 노드 방문 처리
        int size = 1; // 현재 노드 포함 크기

        // 상하좌우 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 유효 범위 내에 있고, 연결된 집(1)이면서 방문하지 않았다면 탐색
            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    size += dfs(nx, ny); // 연결된 집의 크기를 누적
                }
            }
        }
        return size;
    }
}
=======
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        String a = "hello";
        String b = "ohell";
        String str = "";
        StringBuilder sb = new StringBuilder();


    }
}

>>>>>>> 72ea20f4bc4de27afc9e1cf9aa5cd519e5cf4eb6
