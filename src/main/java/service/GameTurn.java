package service;

import InOut.Inputs;

public class GameTurn implements Inputs{

    private int turns;

    public GameTurn(){
        this.turns = inputOfGameTurns();
    }

//    public static GameTurn makeUserInputs(){
//        int turns = makeUserInputs().inputOfGameTurns();
//        return new GameTurn(turns);
//    }

    public int showPlayTime(){
        return turns;
    }

    public int remainTurn(){
        turns -= 1;
        return turns;
    }
}
