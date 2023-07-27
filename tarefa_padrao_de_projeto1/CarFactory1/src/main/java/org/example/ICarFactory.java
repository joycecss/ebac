package org.example;

public interface ICarFactory {
    IEconomyCarFactory createEconomyCar();
    ISportsCarFactory createSportsCar();
}
