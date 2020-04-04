package by.academy.homework3;

public class Door implements ILock {
    Lock lock;

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
}
