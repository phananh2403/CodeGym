package StackQueue.CountWord;

import java.util.HashMap;
import java.util.Map;

public class Test {
    static void characterCount(String s) {
        //Khởi tạo 1 hashMap mới
        HashMap<Character, Integer> charCounter = new HashMap<>();
        //chuyển chuỗi str thành các mảng ký tự
        char[] str = s.toCharArray();
        //lấy c (key) duyệt từ đầu đến cuối str
        for (char c : str) {
            //kiểm tra xem hashmap có chứa key không?
            if(charCounter.containsKey(c)) {
                //nếu key có trong hash,tăng thêm 1 lần đếm
                charCounter.put(c, charCounter.get(c) + 1);
            }
            else {
                //nếu key không có trong hash,cho số lượng của key = 1
                charCounter.put(c,1);
            }
        }
        for (Map.Entry entry : charCounter.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "Simple";
        characterCount(str);
    }
}
