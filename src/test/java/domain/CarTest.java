package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("Name Length Test")
    void nameLengthCheck(){
        assertEquals(Car.makeCar("Thoma").carName(), "Thoma");
    }

}