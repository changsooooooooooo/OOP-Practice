package service;

import domain.ResultObj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private final Cars cars;
    private final Random rand;

    private Game(Random rand, Cars cars){
        this.rand = rand;
        this.cars = cars;
    }

    public static Game makeGame(){
        Random rand = new Random();
        Cars cars = Cars.makeCars();
        return new Game(rand, cars);
    }

    private List<Integer> makeRandomDice(){
        int carsNum = cars.carListLen();
        List<Integer> diceNums = new ArrayList<>();
        for(int i = 0; i < carsNum; i++){
            int diceNum = rand.nextInt(10);
            diceNums.add(diceNum);
        }
        return diceNums;
    }

    private List<ResultObj> giveDiceNumbers(){
        List<Integer> diceNums = new ArrayList<>();
        diceNums = makeRandomDice();
        return cars.reflectDiceResult(diceNums);
    }

    public List<ResultObj> doGame(int turn){
        return giveDiceNumbers();
    }

    public List<ResultObj> getResult(){
        return cars.topRankCars();
    }
}
