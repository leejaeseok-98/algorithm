package algorithm_basic;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberingComplexes_DFS {
    static  int arr[][]; // 노드가 드러갈 배열
    static boolean visit[][]; // 방문배열
    static  int dirx[] = {0,0,-1,1}; // x축으로 인접노드 이동
    static  int diry[] = {-1,1,0,0}; // y축으로 인접노드 이동

    static  int count = 0, number = 0;
    static  int nowX, nowY, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();


        int N = Integer.parseInt(br.readLine()); // 그래프 크기
        arr = new int[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++){
            String str = br.readLine();
            for (int j = 0;j<N;j++){
                arr[i][j] = Character.getNumericValue(str.charAt(j)); //문자를 정수값으로 변환
            }
        }

        for (int i=0;i<N;i++){
            for (int j=0; j<N;j++){
                if (visit[i][j] == false && arr[i][j] == 1){
                    count = 0;
                    number++;
                    DFS(i,j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);//
        bw.append(number + "\n");
        for (int num : list) {
            bw.append(num + "\n");
        }
        bw.flush();
        bw.close();
    }//End of main

    static void DFS(int x, int y){
        visit[x][y] = true;
        arr[x][y] = number;
        count++;

        for (int i = 0; i< 4; i++){
            nowX = dirx[i] + x;
            nowY = diry[i] + y;

            if (Range_check() && visit[nowX][nowY] == false && arr[nowX][nowY] == 1){
                visit[nowX][nowY] = true;
                arr[nowX][nowY] = number;

                DFS(nowX,nowY);
            }
        }
    }//End of DFS
    static boolean Range_check() {
        return (nowX >= 0 && nowX < N && nowY >=0 && nowY < N);
    }//End of Range_check
}
