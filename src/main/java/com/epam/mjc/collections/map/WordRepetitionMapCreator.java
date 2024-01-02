package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] strings = sentence.toLowerCase().replaceAll("[,.]", "").split(" ");

        for (String item : strings) {
            if (!item.isEmpty()) {
                int count = stringCounter(strings, item);
                map.put(item, count);
            }
        }
        return map;
    }

    private int stringCounter(String[] strings, String word) {
        int count = 0;

        for (String item : strings) {
            if (item.equals(word)) {
                count++;
            }
        }

        return count;
    }
}
