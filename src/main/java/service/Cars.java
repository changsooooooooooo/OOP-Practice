package service;

import InOut.InputImpl;
import InOut.Inputs;
import domain.Car;
import domain.ResultObj;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars{

    private static final Inputs inputs = new InputImpl();
    private final List<Car> carList;

    private Cars(List<Car> carList){
        this.carList=carList;
    }

    public static Cars makeCars(){
        List<Car> carList = Stream.of(inputs.inputOfCandidateNames().split(","))
                .map(Car::makeCar)
                .collect(Collectors.toList());

        return new Cars(carList);
    }

    public List<ResultObj> reflectDiceResult(List<Integer> diceNums){
        for(int i = 0; i<diceNums.size(); i++){
            Car car = carList.get(i);
            int diceNum = diceNums.get(i);
            car.movePos(diceNum);
        }
        return carList.stream()
                .map(car->new ResultObj(car.carName(), car.carPos()))
                .collect(Collectors.toList());
    }

    private Integer topRankPos(){
        return carList.stream()
                .map(Car::carPos)
                .max(Comparator.comparingInt(pos->pos)).orElse(-1);
    }

    public List<ResultObj> topRankCars(){
        Integer maxPos = topRankPos();
        return carList.stream()
                .filter(car->car.carPos()==maxPos)
                .map(car->new ResultObj(car.carName(), car.carPos()))
                .collect(Collectors.toList());
    }

    public int carListLen(){
        return carList.size();
    }
}
