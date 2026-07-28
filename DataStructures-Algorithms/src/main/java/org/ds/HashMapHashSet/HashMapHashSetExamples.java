package org.ds.HashMapHashSet;

import java.util.*;

public class HashMapHashSetExamples {

    public static void main(String[] args) {

        // =========================================
        // HashMap
        // =========================================

        HashMap<String, Integer> map = new HashMap<>();

        // 1. put()
        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Mango", 80);

        System.out.println("Map: " + map);

        // 2. get()
        System.out.println("\nApple Price: " + map.get("Apple"));

        // 3. getOrDefault()
        System.out.println("Orange Price: " + map.getOrDefault("Orange", 0));

        // 4. containsKey()
        System.out.println("\nContains Apple: " + map.containsKey("Apple"));

        // 5. containsValue()
        System.out.println("Contains Value 50: " + map.containsValue(50));

        // 6. remove()
        map.remove("Banana");
        System.out.println("\nAfter Remove: " + map);

        // 7. replace()
        map.replace("Apple", 120);
        System.out.println("After Replace: " + map);

        // 8. putIfAbsent()
        map.putIfAbsent("Apple", 999);
        map.putIfAbsent("Orange", 60);
        System.out.println("After putIfAbsent: " + map);

        // 9. size()
        System.out.println("\nSize: " + map.size());

        // 10. isEmpty()
        System.out.println("Is Empty: " + map.isEmpty());

        // 11. keySet()
        System.out.println("\nKeys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // 12. values()
        System.out.println("\nValues:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // 13. entrySet()
        System.out.println("\nEntries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 14. clear()
        HashMap<Integer, Integer> temp = new HashMap<>();
        temp.put(1, 10);
        temp.put(2, 20);

        temp.clear();
        System.out.println("\nTemp Map After Clear: " + temp);

        // =========================================
        // Frequency Count (Most Important DSA Pattern)
        // =========================================

        int[] nums = {1,2,2,3,3,3,4,4,4,4};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nFrequency Map:");
        System.out.println(frequency);

        // =========================================
        // HashSet
        // =========================================

        HashSet<Integer> set = new HashSet<>();

        // 1. add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate ignored

        System.out.println("\nSet: " + set);

        // 2. contains()
        System.out.println("\nContains 20: " + set.contains(20));

        // 3. remove()
        set.remove(20);
        System.out.println("After Remove: " + set);

        // 4. size()
        System.out.println("\nSize: " + set.size());

        // 5. isEmpty()
        System.out.println("Is Empty: " + set.isEmpty());

        // 6. Iterate
        System.out.println("\nElements:");
        for(Integer num : set){
            System.out.println(num);
        }

        // 7. clear()
        HashSet<Integer> tempSet = new HashSet<>();

        tempSet.add(1);
        tempSet.add(2);

        tempSet.clear();

        System.out.println("\nTemp Set: " + tempSet);

        // =========================================
        // Remove Duplicates (Common DSA)
        // =========================================

        int[] arr = {1,2,2,3,3,4,5,5};

        HashSet<Integer> unique = new HashSet<>();

        for(int num : arr){
            unique.add(num);
        }

        System.out.println("\nUnique Elements:");
        System.out.println(unique);

        // =========================================
        // Find First Duplicate
        // =========================================

        int[] duplicateArray = {5,3,2,4,6,2,1};

        HashSet<Integer> seen = new HashSet<>();

        for(int num : duplicateArray){

            if(seen.contains(num)){
                System.out.println("\nFirst Duplicate: " + num);
                break;
            }

            seen.add(num);
        }

        // =========================================
        // Character Frequency
        // =========================================

        String word = "programming";

        HashMap<Character,Integer> charFreq = new HashMap<>();

        for(char c : word.toCharArray()){

            charFreq.put(c, charFreq.getOrDefault(c,0)+1);
        }

        System.out.println("\nCharacter Frequency:");
        System.out.println(charFreq);
    }
}