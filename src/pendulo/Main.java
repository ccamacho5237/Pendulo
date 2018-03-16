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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Longitud;
        double Aceleracion_g;
        double Periodo;
        double Frecuencia;
        
        Pendulo pendulo =new Pendulo();
        
        System.out.println("Creacion del Pendulo");
        System.out.print("Digite la Longitud del Pendulo : ");
        Longitud = LeerConsola.nextDouble();
        System.out.print("Digite la Aceleracion : ");
        Aceleracion_g = LeerConsola.nextDouble();
        Periodo = pendulo.Periodo(Longitud, Aceleracion_g);
        System.out.println("El Periodo del Pendulo es : "+ Periodo);
        Frecuencia = pendulo.Frecuencia(Periodo);
        System.out.println("La Frecuencia del Pendulo es : "+Frecuencia);
    }
}
