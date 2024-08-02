package com.datastructure.string;

import java.util.HashMap;
import java.util.Map;

public class FindMyDestination {

    public static void main(String[] args) {
        Boolean response = reachedDestination("NNEESW", 1,1);
        System.out.println(response);
    }

    public static Boolean reachedDestination(String moves, int x, int y) {
        // Define the movement deltas for each direction
        Map<Character, int[]> directionMap = new HashMap<>();
        directionMap.put('N', new int[]{0, 1});
        directionMap.put('S', new int[]{0, -1});
        directionMap.put('E', new int[]{1, 0});
        directionMap.put('W', new int[]{-1, 0});

        // Initialize the starting position
        int currentX = 0;
        int currentY = 0;

        // Process each move
        for (char move : moves.toCharArray()) {
            int[] delta = directionMap.get(move);
            if (delta != null) {
                currentX += delta[0];
                currentY += delta[1];
            }
            // Optionally, handle invalid moves if needed
        }

        // Check if the final position matches the destination
        return currentX == x && currentY == y;
    }

}
