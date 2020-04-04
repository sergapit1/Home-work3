package by.academy.homework3;

public class Human implements ICar , ILock, ITank{
    Car car;
    Garage garage;
    Passenger p;
    public void tax(){

    }


    @Override
    public boolean start() {
        return false;
    }

    @Override
    public boolean stop() {
        return false;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void levelFuel() {

    }

    @Override
    public void refuel() {

    }
}
