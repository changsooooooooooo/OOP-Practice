package service;

import domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private final Random random = new Random();

    @Test
    @DisplayName("Reflect Method Clean Code")
    void implementMethodsTest(){
        List<Car> carList = Arrays.asList(Car.makeCar("Phobi"),
                Car.makeCar("Crong"),
                Car.makeCar("Honux"));

        int diceNum = random.nextInt(10);
        for(Car car : carList){
            car.movePos(diceNum);
        }
    }
}
