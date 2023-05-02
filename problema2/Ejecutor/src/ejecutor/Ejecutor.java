/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

/**
 *
 * @author ASUS
 */
public class Ejecutor {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Llamamos a la clase Terreno
        
        EquivalenteHora eq = new EquivalenteHora();
        
        // Asignamos valores 
        
        float horas = (float) 550.25;
        
        // Llamamos a los metodos y les otorgamos los datos
        
        eq.establecerhoras(horas);
  
        // Llamamos a los metodos calcular, estos metodos tienen como funcion presentar
        // el resultado del calculo plateado en cada uno de los metodos, no se envian datos
        // pues trabaja con los datos asignados anteriormente
        
        eq.calcularminutos();
        eq.calcularsegundos();
        eq.calculardias();
        
        // Procedemos a mostrar cada uno de los datos
        
        System.out.printf("Datos tiempo\n"
                + "\nValor en horas: %.2f horas\n"
                + "\nValor en minutos: %.2f minutos\n"
                + "\nValor en segundo: %.2f segundos\n"
                + "\nValor en dias: %.2f dias\n"
                , eq.obtenerhoras(),
                eq.obtenercalcularminutos(), 
                eq.obtenercalcularsegundos(),
                eq.obtenercalculardias());
        
    }
    
}
