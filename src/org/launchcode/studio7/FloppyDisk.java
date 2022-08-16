package org.launchcode.studio7;

public class FloppyDisk extends ComputerDisk implements OpticalDisc{
    public FloppyDisk(int storageCapacity, int spinSpeed) {
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
