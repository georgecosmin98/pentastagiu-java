package StrategyGame;

public class Main {
    public static void main(String[] args) {

    //Character

        Character humanCharacter = new Character("Sir Lancelot", Character.typeOfCharacter.human, 50, 20, (new PositionOnTheMap(1, 8)));
        Character monsterCharacter = new Character("Sidhe", Character.typeOfCharacter.monster, 50, 20, (new PositionOnTheMap(2, 9)));
        Character animalCharacter = new Character("Lion", Character.typeOfCharacter.human, 50, 20, (new PositionOnTheMap(8, 1)));

    //Artifact

        Artifact firstArtifact = new Artifact("Sword",(new PositionOnTheMap(1,1)),19, Artifact.typeOfArtifact.healthArtifact);
        Artifact secondArtifact = new Artifact("Helmet",(new PositionOnTheMap(3,9)),15, Artifact.typeOfArtifact.healthArtifact);
        Artifact thirdArtifact = new Artifact("Bracelet",(new PositionOnTheMap(8,0)),22, Artifact.typeOfArtifact.energyArtifact);

    //Attack them !!!!

        humanCharacter.attack(animalCharacter);
        monsterCharacter.attack(humanCharacter);
        humanCharacter.attack(monsterCharacter);

    //Let's equip characters with artifacts :D :D

        humanCharacter.pickArtifact(thirdArtifact);

    //Print status for each character

        humanCharacter.printCharacterStatus();
        monsterCharacter.printCharacterStatus();
        animalCharacter.printCharacterStatus();

    }
}
