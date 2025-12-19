package StrategyPattern;

public class TrappingRainWaterSolutionFactory {
    static TrappingRainWaterSolution getSolution(int solution) {
        if (solution == 1) {
            return new TrappingRainWaterSolutionOne();
        } else if (solution == 2) {
            return new TrappingRainWaterSolutionTwo();
        } else {
            return new TrappingRainWaterSolutionThree();
        }
    }
}
