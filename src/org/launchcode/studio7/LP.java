package org.launchcode.studio7;

public class LP extends BaseDisc implements OpticalDisc{
    public LP(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void storeDate(String data) {

    }

    @Override
    public boolean isFull() {
        return false;
    }
}
