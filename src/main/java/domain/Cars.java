package domain;

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
}
