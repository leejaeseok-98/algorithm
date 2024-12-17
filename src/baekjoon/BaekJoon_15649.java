package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_15649 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        List<List<Integer>>answer = new ArrayList<>();
        List<Integer>innerList = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();//임시저장소
        boolean[] visit = new boolean[innerList.size()];
        int N = Integer.parseInt(st.nextToken());//수열할 수
        int M = Integer.parseInt(st.nextToken());//자리수

        for (int i = 1; i <= N; i++){
            innerList.add(i);
        }

        combi(answer,innerList,temp,M, new boolean[innerList.size()]);
        for (int i = 0;i< answer.size();i++){
            StringBuilder sb = new StringBuilder();
            for (Integer s : answer.get(i)) {
                sb.append(s).append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    static void combi(List<List<Integer>>answer,List<Integer>innerList,List<Integer>temp,int count,boolean[] visit){
        if (count == temp.size()){
            answer.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < innerList.size();i++){
            if (visit[i]==false){
                temp.add(innerList.get(i));
                visit[i]=true;
                combi(answer,innerList,temp,count,visit);
                temp.remove(temp.size()-1);
                visit[i] = false;
            }
        }

    }
}
