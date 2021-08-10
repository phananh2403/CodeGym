package StackQueue.CountWord;

import java.util.Map;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String str = "Dem so lan xuat hien cua moi tu trong chuoi";
        char[] s = str.toCharArray();
        for (char c : s){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }
            else {
                map.put(c,1);
            }
        }
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
