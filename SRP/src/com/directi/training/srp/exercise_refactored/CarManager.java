package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarManager {
    private final Repository repository;
    private final CarService carService;

    public CarManager(Repository repository, CarService carService) {
        this.repository = repository;
        this.carService = carService;
    }

    public Car getFromDb(final String carId) {
        return repository.getCarById(carId);
    }

    public String getCarsNames() {
        List<Car> carsDb = repository.getAllCars();
        return carService.formatCarNames(carsDb);
    }

    public Car getBestCar() {
        List<Car> carsDb = repository.getAllCars();
        return carService.getBestCar(carsDb);
    }
}
