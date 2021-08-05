package service;

import InOut.Inputs;
import domain.Cars;

import java.util.Arrays;
import java.util.List;

public class CarRacing {

    private static Inputs inputs;
    private final Cars cars;

    private CarRacing(List<String> carList){
        this.cars = Cars.makeCars(carList);
    }

    public static CarRacing makeCarRacing(){
        String carCandidate = inputs.inputOfCandidateNames();
        List<String> carList = Arrays.asList(carCandidate.split(","));
        return new CarRacing(carList);
    }

}
