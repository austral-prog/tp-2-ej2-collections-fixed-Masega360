package com.collections;

import java.util.*;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
        Map<String, Integer> inventory = new HashMap<>();
        for (String item : items) {
            inventory.put(item, inventory.getOrDefault(item, 0) + 1);
        }
        return inventory;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            inventory.put(item, inventory.getOrDefault(item, 0) + 1);
        }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.containsKey(item)) {
                inventory.put(item, Math.max(0, inventory.get(item) - 1));
            }
        }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        inventory.remove(item);
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        List<Map.Entry<String, Integer>> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > 0) {
                result.add(entry);
            }
        }
        return result;
    }
}
