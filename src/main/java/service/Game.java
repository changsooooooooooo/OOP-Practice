package service;

import java.util.Random;

public class Game {

    private final GameTurn gameTurn;
    private final CarRacing carRacing;
    private final Random rand;

    private Game(Random rand, GameTurn gameTurn, CarRacing carRacing){
        this.rand = rand;
        this.gameTurn = gameTurn;
        this.carRacing = carRacing;
    }

    public static Game makeGame(){
        Random rand = new Random();
        GameTurn gameTurn = GameTurn.makeGameInputs();
        CarRacing carRacing = CarRacing.makeCarRacing();
        return new Game(rand, gameTurn, carRacing);
    }

    public int randomDice(){
        return 3;
    }

}
