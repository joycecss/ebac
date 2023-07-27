package org.example;

public class EconomyCarImpl implements IEconomyCarFactory {
    @Override
    public boolean verifyAvailability(boolean isAvailable) {
        return isAvailable;
    }
}
