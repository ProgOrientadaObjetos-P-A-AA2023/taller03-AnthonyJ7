
package ejecutor;

/**
 *
 * @author ASUS
 */
public class Terreno {
    
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    
    public void establecerancho(double c){
        ancho = c;
    }
    
    public void establecerlargo(double c){
        largo = c;
    }
    
    public void establecervalorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    
    // public void establecerarea
    
    public void calculararea(){
        area = largo * ancho;
    }

    // Public void establecercosto_terreno
    
    public void calcularcosto_terreno(){
        costo_terreno = valorMetroCuadrado * area;
    }
    
    // Metodos obtener
    
    public double obtenerancho(){
        return ancho;
    }
    
    public double obtenerlargo(){
        return largo;
    }
    
    public double obtenervalorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    public double obtenercalculararea(){
        return area;
    }
    
    public double obtenercalcularcosto_terreno(){
        return costo_terreno;
    }
    
}

