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

    public boolean remainTurn(){
        turns -= 1;
        return turns<0;
    }
}
