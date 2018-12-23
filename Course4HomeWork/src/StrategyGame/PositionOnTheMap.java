package StrategyGame;

public class PositionOnTheMap {
    int xPosition;
    int yPosition;

    public PositionOnTheMap() {
    }

    public PositionOnTheMap(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    double distanceValidation(PositionOnTheMap position) {
        int firstSide = xPosition - position.xPosition;
        int secondSide = yPosition - position.yPosition;
        double distance=(Math.pow(firstSide,2)+Math.pow(secondSide,2));
                return Math.sqrt(distance);
    }

    @Override
    public String toString() {
        return "xPosition: " + xPosition + ", yPosition=: " + yPosition;
    }
}
