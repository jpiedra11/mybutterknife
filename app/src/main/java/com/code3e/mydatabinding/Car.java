package com.code3e.mydatabinding;

import android.databinding.Bindable;
import android.databinding.Observable;

/**
 * Created by admin on 20/10/17.
 */

public class Car implements Observable{
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Bindable
    public String getSpeed() {
        return "" + currentSpeed;
    }

    @Bindable
    public String getDoors() {
        return "" + numberOfDoors;
    }

    private int currentSpeed;
    private int numberOfDoors;

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }
}
