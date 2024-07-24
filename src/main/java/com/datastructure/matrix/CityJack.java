package com.datastructure.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CityJack {

    enum Season
    {
        WINTER, SPRING, SUMMER, FALL
    };

    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3, 4, 5);
    }

    private static int findMaxCitiesVisited(int[] T, int currentCity, int visitedCount, List<Integer> path) {
        return IntStream.range(1, T.length)
            .filter(nextCity -> T[nextCity] != 0 && !path.contains(nextCity) && (visitedCount == 0 || nextCity % 2 == 0))
            .map(nextCity -> {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(nextCity);
                return findMaxCitiesVisited(T, nextCity, visitedCount + 1, newPath);
            })
            .max()
            .orElse(0);
    }

    public static void imprimirNumeros(int... numeros) {
        System.out.print("Números: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
