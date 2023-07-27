package org.example;

public class SportsCarFactory implements ICarFactory {

    @Override
    public IEconomyCarFactory createEconomyCar() {
        return new EconomyCarImpl();
    }

    @Override
    public ISportsCarFactory createSportsCar() {
        return new SportsCarImpl();
    }
}
