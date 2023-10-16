/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_delaasuncion;

/**
 *
 * @author De la asuncion
 */
public class convertisseur {
    int nbConversions;
    
public convertisseur () {
nbConversions = 0 ;
}   
@Override
public String toString () {
return "nb de conversions"+ nbConversions;
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
