package StrategyGame;

public class Artifact {
    String name;
    PositionOnTheMap position;
    int noOfExtraPoint;
    typeOfArtifact type;

    enum typeOfArtifact {
        healthArtifact, energyArtifact;
    }

    public Artifact() {
    }

    public Artifact(String name, PositionOnTheMap position, int noOfExtraPoint, typeOfArtifact type) {
        this.name = name;
        this.position = position;
        this.noOfExtraPoint = noOfExtraPoint;
        this.type = type;
    }

    public PositionOnTheMap getPosition() {
        return position;
    }

    public typeOfArtifact getType() {
        return type;
    }
}
