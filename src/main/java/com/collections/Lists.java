package com.collections;

import java.util.List;

public class Lists {

    public static int indexOf(String color, List<String> colors) {
        return indexOfByIndex(color, colors, 0);
    }

    public static int indexOfByIndex(String color, List<String> colors, int startIndex) {
        for (int i = startIndex; i < colors.size(); i++) {
            if (colors.get(i).equals(color)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfEmpty(List<String> colors) {
        return indexOfByIndex("", colors, 0);
    }

    public static int put(String color, List<String> colors) {
        int index = indexOfEmpty(colors);
        if (index != -1) {
            colors.set(index, color);
        }
        return index;
    }

    public static int remove(String color, List<String> colors) {
        int count = 0;
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).equals(color)) {
                colors.set(i, "");
                count++;
            }
        }
        return count;
    }
}
