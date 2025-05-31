package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP: DEVI ATIKA PUTRI");
        System.out.println("NIM: 245150700111039");
        System.out.println("=============================================");
        
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Major Radius : ");
        double majorRadius = scanner.nextDouble();
        System.out.print("Isikan Minor Radius : ");
        double minorRadius = scanner.nextDouble();
        
        Torus torus = new Torus(majorRadius, minorRadius);
        torus.printInfo();
        
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius : ");
        double radius = scanner.nextDouble();
        
        Sphere sphere = new Sphere(radius);
        sphere.printInfo();
        
        scanner.close();
    }
}