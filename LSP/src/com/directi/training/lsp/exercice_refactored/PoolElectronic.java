package com.directi.training.lsp.exercice_refactored;

public class PoolElectronic {
    
    public void run()
    {
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(electricDuck);
        swim(electricDuck);
    }

    private void quack(ElectronicDuck electronic_duck)

    {
        electronic_duck.turnOn();
        electronic_duck.quack();
        electronic_duck.turnOff();
    }

    private void swim(ElectronicDuck electronic_duck)
    {
        electronic_duck.turnOn();
        electronic_duck.swim();
        electronic_duck.turnOff();
    }

    public static void main(String[] args)
    {
        PoolElectronic poolElectronic = new PoolElectronic();
        poolElectronic.run();
    }

}
