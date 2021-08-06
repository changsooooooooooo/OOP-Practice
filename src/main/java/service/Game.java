package service;

import domain.ResultObj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private final Cars cars;
    private final Random rand;
    private final GameTurn gameTurn;

    private Game(Random rand, GameTurn gameTurn, Cars cars){
        this.rand = rand;
        this.cars = cars;
        this.gameTurn = gameTurn;
    }

    public static Game makeGame(){
        Random rand = new Random();
        Cars cars = Cars.makeCars();
        GameTurn gameTurn = GameTurn.makeGameInputs();
        return new Game(rand, gameTurn, cars);
    }

    public List<Integer> makeRandomDice(){
        int carsNum = cars.carListLen();
        List<Integer> diceNums = new ArrayList<>();
        for(int i = 0; i < carsNum; i++){
            int diceNum = rand.nextInt(10);
            diceNums.add(diceNum);
        }
        return diceNums;
    }

    public List<ResultObj> giveDiceNumbers(){
        List<Integer> diceNums = new ArrayList<>();
        diceNums = makeRandomDice();
        return cars.reflectDiceResult(diceNums);
    }

    public List<ResultObj> doGame(){

        if(gameTurn.remainTurn()){
            return cars.topRankCars();
        }
        return giveDiceNumbers();
    }

}
