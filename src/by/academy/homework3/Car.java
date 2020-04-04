package by.academy.homework3;

public class Car implements ICar, ITank, ILock {

    Engine engine;
    Door door;
    Tank tank;
    Wheel wheel;
    Seat seat;

    public Car() {

    }

    @Override
    public boolean start() {
        return true;
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
    public void checkKey() {

    }

    @Override
    public void levelFuel() {

    }

    @Override
    public void refuel() {

    }
}
