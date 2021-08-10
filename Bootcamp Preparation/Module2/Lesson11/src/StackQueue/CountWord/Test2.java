package StackQueue.CountWord;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        String str = "Yahallo! I am Yuigahama Yui.";
        Map<String, Integer> hashmap = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            if (hashmap.containsKey(word))
                hashmap.put(word, hashmap.get(word) + 1);
            else
                hashmap.put(word, 1);
        }
        System.out.println(hashmap);
    }
}
