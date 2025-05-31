package uap.models;

import uap.basis.Shape;
import uap.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, PIRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius;
    private double minorRadius;
    
    public Torus() {
        super();
        this.majorRadius = 0;
        this.minorRadius = 0;
        setName("Torus");
    }
    
    public Torus(double majorRadius, double minorRadius) {
        this();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }
    
    @Override
    public double getVolume() {
        return (PI * minorRadius * minorRadius) * (2 * PI * majorRadius);
    }
    
    @Override
    public double getSurfaceArea() {
        return (2 * PI * minorRadius) * (2 * PI * majorRadius);
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