
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
        
        Terreno tr = new Terreno();
        
        // Asignamos valores 
        
        double ancho = 10;
        double largo = 20;
        double valorMetroCuadrado = 1000;
        
        // Llamamos a los metodos y les otorgamos los datos
        
        tr.establecerancho(ancho);
        tr.establecerlargo(largo);
        tr.establecervalorMetroCuadrado(valorMetroCuadrado);
        
        // Llamamos a los metodos calcular, estos metodos tienen como funcion presentar
        // el resultado del calculo plateado en cada uno de los metodos, no se envian datos
        // pues trabaja con los datos asignados anteriormente
        
        tr.calculararea();
        tr.calcularcosto_terreno();
        
        // Procedemos a mostrar cada uno de los datos
        
        System.out.printf("Datos terreno\n"
                + "\nEl ancho del terreno es: %.2f\n"
                + "\nEl largo del terreno es: %.2f\n"
                + "\nEl area del terreno es: %.2f\n"
                + "\nEl costo del terreno es: %.2f dolares\n"
                , tr.obtenerancho(),
                tr.obtenerlargo(), 
                tr.obtenercalculararea(),
                tr.obtenercalcularcosto_terreno());
        
        Terreno tr2 = new Terreno();
        
        // Asignamos valores 
        
        double ancho2 = 20;
        double largo2 = 40;
        double valorMetroCuadrado2 = 1000;
        
        // Llamamos a los metodos y les otorgamos los datos
        
        tr2.establecerancho(ancho2);
        tr2.establecerlargo(largo2);
        tr2.establecervalorMetroCuadrado(valorMetroCuadrado2);
        
        // Llamamos a los metodos calcular, estos metodos tienen como funcion presentar
        // el resultado del calculo plateado en cada uno de los metodos, no se envian datos
        // pues trabaja con los datos asignados anteriormente
        
        tr2.calculararea();
        tr2.calcularcosto_terreno();
        
        // Procedemos a mostrar cada uno de los datos
        
        System.out.printf("Datos terreno\n"
                + "\nEl ancho del terreno es: %.2f\n"
                + "\nEl largo del terreno es: %.2f\n"
                + "\nEl area del terreno es: %.2f\n"
                + "\nEl costo del terreno es: %.2f dolares\n"
                , tr2.obtenerancho(),
                tr2.obtenerlargo(), 
                tr2.obtenercalculararea(),
                tr2.obtenercalcularcosto_terreno());
        
    }
    
}
