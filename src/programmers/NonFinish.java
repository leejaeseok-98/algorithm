package programmers;

import java.util.HashMap;
import java.util.Map;

public class NonFinish {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        for (String a : participant) {
            if (map.containsKey(a)){
                map.put(a, map.get(0)+1);
            }else {
                map.put(a,1);
            }
        }
        for (String a : completion) {
            if (map.containsKey(a));{
                map.put(a, map.get(0)-1);
            }
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() != 0){
                answer = entry.getKey();
            }
        }
    }
}
