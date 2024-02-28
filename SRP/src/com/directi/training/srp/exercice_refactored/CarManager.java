package com.directi.training.srp.exercice_refactored;

public class CarManager
{
    private final CarRepo _carRepo;

    public CarManager(CarRepo cRepo){
        this._carRepo = cRepo;
    }

    public Car getFromDb(final String carId)
    {
        for (Car car : _carRepo.getCars()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carRepo.getCars()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carRepo.getCars()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
