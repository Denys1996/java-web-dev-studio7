package org.launchcode.studio7;

public class CD extends ComputerDisk implements OpticalDisc{
    public CD() {
        super(700, 500);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + this.getSpinSpeedInRPM() + " rpm");
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
