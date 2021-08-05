package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> carList;

    private Cars(List<Car> carList){
        this.carList=carList;
    }

    public static Cars makeCars(List<String> carNameList){
        List<Car> carList = carNameList.stream()
                .map(name->Car.makeCar(name))
                .collect(Collectors.toList());

        return new Cars(carList);
    }

    public List<Integer> reflectDiceResult(List<Integer> diceNumbers){
        List<Integer> positionList = new ArrayList<>();
        for(int i=0; i<diceNumbers.size(); i++){
            int position = carList.get(i).movePos(diceNumbers.get(i));
            positionList.add(position);
        }
        return positionList;
    }
}
