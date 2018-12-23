package StrategyGame;

public class Character {
    String name;
    typeOfCharacter type;
    int noOfHealthPoint;
    int noOfEnergyPoint;
    PositionOnTheMap position;

    enum typeOfCharacter {
        human, monster, animal;
    }

    public Character() {
    }

    public Character(String name, typeOfCharacter type, int noOfHealthPoint, int noOfEnergyPoint, PositionOnTheMap position) {
        this.name = name;
        this.type = type;
        this.noOfHealthPoint = noOfHealthPoint;
        this.noOfEnergyPoint = noOfEnergyPoint;
        this.position = position;
    }

    public PositionOnTheMap getPosition() {
        return position;
    }

    public int getNoOfHealthPoint() {
        return noOfHealthPoint;
    }

    public int getNoOfEnergyPoint() {
        return noOfEnergyPoint;
    }

    public typeOfCharacter getType() {
        return type;
    }

    void pickArtifact(Artifact artifact) {
        if (artifact.getType() == Artifact.typeOfArtifact.healthArtifact)
            noOfHealthPoint += artifact.noOfExtraPoint;
        else if (artifact.getType() == Artifact.typeOfArtifact.energyArtifact)
            noOfEnergyPoint += artifact.noOfExtraPoint;
    }

    void attack(Character defender) {

        if(position.distanceValidation(defender.position)>4) {
            System.out.println("Your opponent is too far away");
            return;
        }
        if (defender.noOfHealthPoint == 0) {
            System.out.println("Defender is already dead!");
            return;
        }

        if (getType() == typeOfCharacter.human && defender.noOfHealthPoint > 10) {
            noOfEnergyPoint -= 5;
            defender.noOfHealthPoint -= 10;
        } else if (getType() == typeOfCharacter.human && defender.noOfHealthPoint <= 10) {
            System.out.println("You kill " + defender.name);
            defender.noOfHealthPoint = 0;
        } else if (getType() == typeOfCharacter.monster && defender.noOfHealthPoint > 15) {
            noOfEnergyPoint -= 3;
            defender.noOfHealthPoint -= 15;
        } else if (getType() == typeOfCharacter.monster && defender.noOfHealthPoint <= 15) {
            System.out.println("You kill " + defender.name);
            defender.noOfHealthPoint = 0;
        }
    }

    void printCharacterStatus() {
        System.out.println("Name: " + name + " HP: " + noOfHealthPoint + " EP: " + noOfEnergyPoint);
    }
}
