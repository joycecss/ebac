package org.example;

public class EconomyCarFactory implements ICarFactory {

    @Override
    public IEconomyCarFactory createEconomyCar() {
        return new EconomyCarImpl();
    }

    @Override
    public ISportsCarFactory createSportsCar() {
        return new SportsCarImpl();
    }
}
