package StrategyPattern;

public class TrappingRainWaterSolutionOne implements TrappingRainWaterSolution {
    public int getTrappedRainWater(int[] heights) {
        int n = heights.length;
        int water = 0;

        for (int i = 0; i < n; i++) {
            int leftMax = 0;
            int rightMax = 0;

            // Find max to the left of i
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, heights[j]);
            }

            // Find max to the right of i
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, heights[j]);
            }

            water += Math.min(leftMax, rightMax) - heights[i];
        }

        return water;
    }

}
