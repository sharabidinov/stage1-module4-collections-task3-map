package com.epam.mjc.collections.map;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int key : sourceMap.keySet()) {
            String value = sourceMap.get(key);
            map.put(value, key);
        }

        return map;
    }

}
