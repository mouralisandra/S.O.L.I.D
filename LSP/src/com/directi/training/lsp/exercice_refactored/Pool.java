package com.directi.training.lsp.exercice_refactored;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        quack(donaldDuck);
        swim(donaldDuck);
    }

    private void quack(Duck duck)
    {
        duck.quack();
    }

    private void swim(Duck duck)
    {
        duck.swim();
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
