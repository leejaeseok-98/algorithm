//package baekjoon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class BaekJoon_11286 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        Queue<Integer> dp = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if ()
//                return Math.abs(o1) - Math.abs(o2);
//            }
//        });
//
//        for (int i = 0; i<T; i++){
//            int node = Integer.parseInt(br.readLine());
//            if (!dp.isEmpty()){
//                if (node != 0){
//                    dp.add(node);
//                } else if (node == 0 && dp.contains(dp.peek())) {
//
//                } else if (node == 0) {
//
//                }
//            }else {
//                if (node == 0){
//                    System.out.println(0);
//                }
//                else {
//                    dp.add(node);
//                }
//            }
//        }
//
//    }
//}
