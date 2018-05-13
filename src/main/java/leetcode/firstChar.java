package leetcode;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public int firstUniqChar(String s) {
        if(s.isEmpty()){
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), ++count);
                count = 1;
            } else {
                map.put(s.charAt(i), count);
            }

        }
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (map.containsKey(letter) && (map.get(letter) == 1)) {
                return i;
            }
        }
        return 0;
    }
}
