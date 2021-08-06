package domain;

import exceptions.NameLengthException;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        if(name.equals("Error")){
            throw new NameLengthException("Name Length Must be under Five");
        }
        this.name = name;
    }

    public static Car makeCar(String name){
        if(5<name.length()){
            return new Car("Error");
        }
        return new Car(name);
    }

    public void movePos(int diceNumber){
        if(3<diceNumber){
            position += 1;
        }
    }

    public String carName(){
        return name;
    }

    public int carPos(){
        return position;
    }
}
