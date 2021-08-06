package service;

import InOut.InputImpl;
import InOut.Inputs;

public class GameTurn{

    private int turns;
    private static final Inputs inputs = new InputImpl();

    public GameTurn(int turns){
        this.turns = turns;
    }

    public static GameTurn makeGameInputs(){
        int turns = inputs.inputOfGameTurns();
        return new GameTurn(turns);
    }

    public int remainTurn(){
        turns -= 1;
        return turns;
    }
}
