//Assignment was to create a Webapp using Tomcat to show the top electric cars. 
//This was the main file
package edu.dccc.TopElectricCars;
import java.text.NumberFormat;

class ElectricCar {
    String model;
    String imgSrc;
    double basePrice;
    int epaMaxRange;
    String epaFuelEconomy;
    int rank;

    public String getModel() {
        return model;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getFormattedBasePrice() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(basePrice);
    }

    public int getEpaMaxRange() {
        return epaMaxRange;
    }

    public String getEpaFuelEconomy() {
        return epaFuelEconomy;
    }

    public int getRank() {
        return rank;
    }

    public ElectricCar(String model, String imgSrc, double basePrice, int epaMaxRange, String epaFuelEconomy, int rank) {
        this.model = model;
        this.imgSrc = imgSrc;
        this.basePrice = basePrice;
        this.epaMaxRange = epaMaxRange;
        this.epaFuelEconomy = epaFuelEconomy;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + model + '\'' +
                ", imgSrc='" + imgSrc + '\'' +
                ", basePrice=" + basePrice +
                ", epaMaxRange=" + epaMaxRange +
                ", epaFuelEconomy='" + epaFuelEconomy + '\'' +
                ", rank=" + rank +
                '}';
    }

}



