/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendulo;

/**
 *
 * @author Itach
 */
public class Pendulo{
    private double Longitud;
    private double Aceleracion_g;
      
    public double getLongitud(){
        return Longitud;
    }
    public double getAceleracion_g(){
        return Aceleracion_g;
    }
    
    public final double Periodo(double longitud , double aceleracion_g){
        double periodo;
        periodo = 2*Math.PI * Math.sqrt(aceleracion_g/longitud);
        return periodo;
    }
    public final double Frecuencia(double periodo){
        double frecuencia;
        frecuencia = (1/periodo);
        return frecuencia;
    }
}
