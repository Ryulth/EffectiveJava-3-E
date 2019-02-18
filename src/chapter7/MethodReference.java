package chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MethodReference {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("test1");
        words.add("test11");
        words.add("test1111");
        words.add("test111");
        Map<String, Integer> map = new TreeMap<>();
        map.put("test1",100);

        for (String s : words)
            map.merge(s, 1, (count, incr) -> count + incr); // 람다
        System.out.println(map);

        map.clear();
        map.put("test1",100);
        for (String s : words)
            map.merge(s, 1, Integer::sum); // 메서드 참조
        System.out.println(map);

    }
}
