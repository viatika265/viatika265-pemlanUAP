package uap.models;

import uap.basis.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, PIRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius;
    
    public Sphere() {
        super();
        this.radius = 0;
        setName("Sphere");
    }
    
    public Sphere(double radius) {
        this();
        this.radius = radius;
    }
    
    @Override
    public double getVolume() {
        return (4.0 / 3) * PI * radius * radius * radius;
    }
    
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }
    
    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }
    
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }
    
    @Override
    public double calculateCost() {
        double kg = gramToKilogram();
        return Math.ceil(kg) * PRICE_PER_KG;
    }
    
    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.println("Volume : " + getVolume());
        System.out.println("Luas permukaan : " + getSurfaceArea());
        System.out.println("Massa : " + getMass());
        System.out.println("Massa dalam kg : " + gramToKilogram());
        System.out.println("Biaya kirim : Rp" + String.format("%,.0f", calculateCost()));
        System.out.println("=============================================");
    }
}