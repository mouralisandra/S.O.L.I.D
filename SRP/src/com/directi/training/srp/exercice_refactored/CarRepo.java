package com.directi.training.srp.exercice_refactored;

import java.util.Arrays;
import java.util.List;

public class CarRepo {
    
    private List<Car> _carsDb = Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));

    public  List<Car> getCars(){
        return _carsDb;
    }
}
