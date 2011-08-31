package edu.uwa.cits3200.sheepmethane.model;

import org.javalite.activejdbc.Model;


/**
 *
 * @author zaydana
 */
public class Experiment extends Model {
    
    public double CH4rate;
    public double correctedCH4rate;
    public double CH4ppm;
    public double correctedCH4ppm;
    public double ambientCH4ppm;
    
    public Experiment() {
        
    }
    
}
