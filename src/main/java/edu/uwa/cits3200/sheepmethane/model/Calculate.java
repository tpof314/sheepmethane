package edu.uwa.cits3200.sheepmethane.model;

/**
 * Calculation class for sheep methane data.
 * @author Darren Huang
 * @date    16 August 2011
 */
public class Calculate {

    public static double getCH4rate(double CH4) {
        return CH4 / (22.4 * 16);
    }
    
    public static double getCorrectedCH4rate(double chamCoef, double correctCH4ppm) {
        return (chamCoef / 1000) * correctCH4ppm;
    }
    
    public static double getCorrectCH4ppm(double chamCH4ppm, double ambCH4ppm) {
        return chamCH4ppm - ambCH4ppm;
    }
    
    public static double getChamCH4ppm(double chamPkArea, double chamCoef) {
        return (chamPkArea / Math.pow(10, 5)) * chamCoef;
    }
    
    public static double getAmbCH4ppm(double ambPkArea, double ambCoef) {
        return (ambPkArea / Math.pow(10, 5)) * ambCoef;
    }
}