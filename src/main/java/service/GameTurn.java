package service;

import InOut.Inputs;

public class GameTurn{

    private int turns;
    private static Inputs inputs;

    public GameTurn(int turns){
        this.turns = turns;
    }

    public static GameTurn makeGameInputs(){
        int turns = inputs.inputOfGameTurns();
        return new GameTurn(turns);
    }

    public int showTurn(){
        return turns;
    }

    public int remainTurn(){
        turns -= 1;
        return turns;
    }
}
