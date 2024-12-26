package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Bj_1260 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());//정점 개수
        int M = Integer.parseInt(st.nextToken());//간선 개수
        int V = Integer.parseInt(st.nextToken());//정점 번호



    }

    static void dfs(List<List<Integer>> list,int start,boolean[] visit){
        System.out.print(start);
        visit[start] = true;
        for (int a : list.get(start)) {
            if (!visit[a]){
                dfs(list,a,visit);
            }
        }
    }

//    static void bfs(List<List<Integer>> list, int start,boolean[] visit){
//        System.out.print(start);
//
//    }
}
