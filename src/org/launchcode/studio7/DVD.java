package org.launchcode.studio7;

public class DVD extends ComputerDisk implements OpticalDisc{
    public DVD(String title) {
        super(4000, 1600, title);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rage of " +this.getSpinSpeedInRPM() + " rpm.");
    }

    @Override
    public void storeDate(String data) {
        this.writeDate(data);
    }

    @Override
    public boolean isFull() {
        if (this.readData().length() >= this.getStorageCapacityInMB()) {
            return true;
        } else {
            return false;
        }
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
