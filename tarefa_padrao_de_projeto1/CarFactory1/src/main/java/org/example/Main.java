package org.example;

/**
 * @author joyce.silva
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Padrão de projeto Factory Method");

        ICarFactory sportsCarFactory = new SportsCarFactory();
        ISportsCarFactory sportsCar = sportsCarFactory.createSportsCar();
        boolean isReadySport = sportsCar.verifyAvailability(true);

        ICarFactory economyCarFactory = new EconomyCarFactory();
        IEconomyCarFactory economyCar = economyCarFactory.createEconomyCar();
        boolean isReadyEconomy =  economyCar.verifyAvailability(false);

        System.out.println("O carro sport está disponivel? " + formattedBooleanForString(isReadySport) + "\n" +
                "O carro economico está disponivel? " + formattedBooleanForString(isReadyEconomy));
    }

    private static String formattedBooleanForString(boolean param){
        if(param){
            return "Sim";
        } else {
            return "Não";
        }
    }
}