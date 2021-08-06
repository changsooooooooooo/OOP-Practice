package UI;

import domain.ResultObj;
import service.Game;

import java.util.List;

public class UserInterface {

    private final Game game;

    private UserInterface(Game game){
        this.game = game;
    }

    public static UserInterface makeUserInterface(){
        Game game = Game.makeGame();
        return new UserInterface(game);
    }

    public void showResultByTurn(){
        List<ResultObj> result = game.doGame();
        for(ResultObj resultObj : result){
            System.out.println(resultObj.showCandidateName() + " : " + resultObj.showCandidatePos());
        }
        System.out.println();
    }
}
