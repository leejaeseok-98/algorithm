package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bj적녹색약 {
    static List<String> list = new ArrayList<>();
    static int T;//가로세로크기
    static boolean[][] visited;//방문노드
    static String[][] rgb; //지도
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        rgb = new String[T][T];
        visited = new boolean[T][T];


        for (int i = 0; i<T;i++){//정보입력
            rgb[i] = new String[]{br.readLine()};
        }

        for (int i = 0;i<T;i++){
            for (int j = 0; j < T;j++){
                if (rgb[i][j].equals("R") && !visited[i][j]){
                    bfs(i,j);
                }
            }
        }



    }

    static void bfs(int x,int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

//      상하좌우 탐색

            for (int i = 0;i<4;i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >=0 && ny>=0 && nx <T &&ny <T){
                    if (rgb[nx][ny] == )
                }
            }




        }


    }
}
