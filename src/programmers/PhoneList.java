package programmers;

import java.util.*;
//순서가 필요함
//1번과 2번, 3번이 비교되어야 함

public class PhoneList {
    public static void main(String[] args) {
        String[] phone_book = {"123","456","789"};
        boolean answer = true;
        HashMap<String, String> map = new HashMap<>();

        // 모든 전화번호를 HashMap에 저장
        for (String phone : phone_book) {
            map.put(phone, phone);
        }

        // 각 전화번호의 접두어가 HashMap에 존재하는지 확인
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                String prefix = phone.substring(0, i);
                if (map.containsKey(prefix)) {
                    answer = false; // 접두어가 존재하면 false 반환
                }
            }
        }
        System.out.println(answer);
    }
}
