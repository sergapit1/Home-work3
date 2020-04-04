package by.academy.homework3;

public class Lock implements ILock{

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
