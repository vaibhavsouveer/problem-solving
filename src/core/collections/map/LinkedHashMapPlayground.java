package core.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPlayground {
    public static void main(String[] args) {
        Map<Integer, String> map = getMap();
        System.out.println("map = " + map);
    }

    private static Map<Integer, String> getMap() {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "a");
        linkedHashMap.put(2, "b");
        linkedHashMap.put(5, "e");
        linkedHashMap.put(6, "f");
        linkedHashMap.put(3, "c");
        linkedHashMap.put(4, "d");
        return linkedHashMap;
    }
}
