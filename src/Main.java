
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr2 = new int[T];
        int sum = 0;
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i <T;i++){
            arr2[i] = Integer.parseInt(st.nextToken());
            if (arr2[i] == 1){
                count++;
            }else {
                count = 0;
            }
            sum += count;
        }
        System.out.println(sum);
    }
}
