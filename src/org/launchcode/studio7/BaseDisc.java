package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {

    //Class Variable
    private String discData;
    private HashMap<String, String> discInfo;

    private final int storageCapacityInMB;
    private final int spinSpeedInRPM;

    //Constructor
    public BaseDisc(int storageCapacity, int spinSpeed) {
        this.storageCapacityInMB = storageCapacity;
        this.spinSpeedInRPM = spinSpeed;
        this.discData = "";
        this.discInfo = new HashMap<String, String>();
        this.discInfo.put("Storage Capacity", String.valueOf(storageCapacity));
        this.discInfo.put("Spin Speed", String.valueOf(spinSpeed));

    }

    public BaseDisc(int storageCapacity, int spinSpeed, String title) {
        this(storageCapacity, spinSpeed);
        this.discInfo.put("Title", title);


    }
    //Methods
            //Getters and Setters


    public int getStorageCapacityInMB() {
        return this.storageCapacityInMB;
    }

    public int getSpinSpeedInRPM() {
        return this.spinSpeedInRPM;
    }

    protected void writeDate(String data) {
        this.discData += data;
    }

    public String readData() {
        return this.discData;
    }

    public HashMap<String, String> getInfo() {
        return this.discInfo;
    }


}

