package org.example;

public class SportsCarImpl implements  ISportsCarFactory{
    @Override
    public boolean verifyAvailability(boolean isAvailable) {
        return isAvailable;
    }
}
