package com.datastructure.search;

import java.util.HashMap;
import java.util.Map;

public class IndexedSearch {
    public static void main(String [] args) {
        Map<Integer, String> mapExamples = new HashMap<Integer, String>();
        mapExamples.put(1, new String("Alana"));
        mapExamples.put(2, new String("Bruno"));
        mapExamples.put(3, new String("Carlos"));
        mapExamples.put(4, new String("Daniel"));
        mapExamples.put(5, new String("Ester"));
        mapExamples.put(6, new String("Isa"));
        mapExamples.put(7, new String("Luan"));
        mapExamples.put(8, new String("Marcos"));

        int[] indices = {1,2,3,4,5,6,7,8};

        String people = indexSearch(mapExamples, 4);
        System.out.println("Pessoa: " + people);

    }

    public static String indexSearch(Map map, int indice) {
        return (String) map.get(indice);
    }
}