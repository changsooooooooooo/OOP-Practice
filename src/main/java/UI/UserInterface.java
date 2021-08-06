package UI;

import domain.ResultObj;
import service.Game;
import service.GameTurn;

import java.util.ArrayList;
import java.util.List;

public class UserInterface {

    private final Game game;
    private final GameTurn gameTurn;

    private UserInterface(Game game, GameTurn gameTurn){
        this.game = game;
        this.gameTurn = gameTurn;
    }

    public static UserInterface makeUserInterface(){
        Game game = Game.makeGame();
        GameTurn gameTurn = GameTurn.makeGameInputs();
        return new UserInterface(game, gameTurn);
    }

    private void showGameStatus(List<ResultObj> result){
        for(ResultObj resultObj : result){
            System.out.println(resultObj.showCandidateName() + " : " + resultObj.showCandidatePos());
        }
        System.out.println();
    }

    private void showGameFinishMsg(List<ResultObj> result){
        StringBuilder msg = new StringBuilder();
        for(ResultObj resultObj : result) {
            msg.append(resultObj.showCandidateName());
            msg.append(", ");
        }
        String resultMsg = msg.toString().substring(0, msg.length()-2);
        System.out.println(resultMsg + "가 최종 우승했습니다.");
    }

    public void showResultByTurn(){
        List<ResultObj> result = new ArrayList<>();
        int turn = gameTurn.remainTurn();
        while(-1<turn){
            result = game.doGame(turn);
            turn = gameTurn.remainTurn();
            showGameStatus(result);
        }
    }

    public void showResult(){
        List<ResultObj> result = new ArrayList<>();
        result = game.getResult();
        showGameFinishMsg(result);
    }
}
