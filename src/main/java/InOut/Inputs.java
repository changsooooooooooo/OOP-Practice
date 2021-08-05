package InOut;

import java.util.Scanner;

public interface Inputs{

    Scanner sc = new Scanner(System.in);

    default String inputOfCarNames(){
        return sc.nextLine();
    }

    default int inputOfGameTurns(){
        return sc.nextInt();
    }

}
