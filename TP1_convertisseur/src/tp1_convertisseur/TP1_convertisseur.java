/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur;

import java.util.Scanner;

/**
 *
 * @author De la asuncion
 */
public class TP1_convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Convertir degrés Celsius en degrés Kelvin.");
        System.out.println("2. Convertir degrés Kelvin en degrés Celsius.");
        System.out.println("3. Convertir degrés Fahrenheit en degrés Celsius.");
        System.out.println("4. Convertir degrés Celsius en degrés Fahrenheit.");
        System.out.println("5. Convertir degrés Fahrenheit en degrés Kelvin.");
        System.out.println("6. Convertir degrés Kelvin en degrés Fahrenheit.");
        System.out.println("Choisissez une option (1-6) :");
        
        int choix = sc.nextInt();
        double temperature;

        switch (choix) {
            case 1:
                System.out.println("Entrer une température en degrés Celsius :");
                temperature = sc.nextDouble();
                double kelvin = CelsiusVersKelvin(temperature);
                System.out.println("La température en degrés Kelvin est : " + kelvin);
                break;
            case 2:
                System.out.println("Entrer une température en degrés Kelvin :");
                temperature = sc.nextDouble();
                double celsius = KelvinVersCelsius(temperature);
                System.out.println("La température en degrés Celsius est : " + celsius);
                break;
            case 3:
                System.out.println("Entrer une température en degrés Fahrenheit :");
                temperature = sc.nextDouble();
                celsius = FahrenheitVersCelsius(temperature);
                System.out.println("La température en degrés Celsius est : " + celsius);
                break;
            case 4:
                System.out.println("Entrer une température en degrés Celsius :");
                temperature = sc.nextDouble();
                double fahrenheit = CelsiusVersFahrenheit(temperature);
                System.out.println("La température en degrés Fahrenheit est : " + fahrenheit);
                break;
            case 5:
                System.out.println("Entrer une température en degrés Fahrenheit :");
                temperature = sc.nextDouble();
                kelvin = FahrenheitVersKelvin(temperature);
                System.out.println("La température en degrés Kelvin est : " + kelvin);
                break;
            case 6:
                System.out.println("Entrer une température en degrés Kelvin :");
                temperature = sc.nextDouble();
                fahrenheit = KelvinVersFahrenheit(temperature);
                System.out.println("La température en degrés Fahrenheit est : " + fahrenheit);
                break;
            default:
                System.out.println("Choix invalide.");
        }
    }

    public static double CelsiusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }

    public static double KelvinVersCelsius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FahrenheitVersCelsius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5/9;
    }

    public static double CelsiusVersFahrenheit(double tCelsius) {
        return (tCelsius * 9/5) + 32;
    }

    public static double FahrenheitVersKelvin(double tFahrenheit) {
        double celsius = FahrenheitVersCelsius(tFahrenheit);
        return CelsiusVersKelvin(celsius);
    }

    public static double KelvinVersFahrenheit(double tKelvin) {
        double celsius = KelvinVersCelsius(tKelvin);
        return CelsiusVersFahrenheit(celsius);
    }
}
