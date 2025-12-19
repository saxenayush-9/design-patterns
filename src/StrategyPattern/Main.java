package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        int solveVersion = 3;
        int[] heights = {0, 2, 0, 3, 1, 0, 1, 3, 2, 1};
        TrappingRainWaterSolution f = TrappingRainWaterSolutionFactory.getSolution(solveVersion);
        int solution = f.getTrappedRainWater(heights);
        System.out.println(solution);
    }
}
