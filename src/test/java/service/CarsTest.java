package service;

import domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class CarsTest {

    @Test
    @DisplayName("Stream Max Value Test")
    void maxIsDistinctOrNot(){
        List<Car> carList = Arrays.asList(Car.makeCar("Phobi"),
                Car.makeCar("Crong"),
                Car.makeCar("Honux"));

        carList.stream()
                .map(car->car.carPos())
                .max(Comparator.comparingInt(pos->pos)).orElse(-1);
        //중복된 출력 불가!
    }

}
