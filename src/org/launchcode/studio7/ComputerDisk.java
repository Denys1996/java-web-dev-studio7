package org.launchcode.studio7;

public abstract class ComputerDisk extends BaseDisc {

    //Variables
    private boolean isInserted;


    //Getter and Setters
    public boolean isInserted() {
        return this.isInserted;
    }

    public ComputerDisk(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
        this.isInserted = false;
    }

    public ComputerDisk(int storageCapacity, int spinSpeed, String title) {
        super(storageCapacity, spinSpeed, title);
        this.isInserted = false;

    }

    public void insert() {
        this.isInserted = true;

    }
}
