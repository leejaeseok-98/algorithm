package algorithm_basic;

import java.util.*;

public class NumberingComplexes_BFS {
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
                if (map[i][j] == 1 && !visited[i][j]) { // 방문하지 않은 집 발견
                    int size = bfs(i, j);              // BFS로 단지 크기 계산
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

    // BFS를 이용해 단지 크기 계산
    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        int size = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 큐에서 현재 좌표를 꺼냄
            int cx = current[0];
            int cy = current[1];

            // 상하좌우 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 유효 범위 내에 있고, 연결된 집(1)이면서 방문하지 않았다면 큐에 추가
                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        size++; // 단지 크기 증가
                    }
                }
            }
        }
        return size;
    }
}
