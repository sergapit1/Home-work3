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
    public boolean open() {

        return true;
    }

    @Override
    public boolean close() {

        return false;
    }

    @Override
    public void levelFuel() {

    }

    @Override
    public void refuel() {

    }
}
