/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor;

/**
 *
 * @author ASUS
 */
public class EquivalenteHora {
    
    private float horas;
    private float minutos;
    private float segundos;
    private float dias;
    
    public void establecerhoras(float c){
        horas = c;
    }
    
     // public void establecerarea
     
    public void calcularminutos(){
        minutos = horas * 60;
    }
    
    // public void establecerarea
    
    public void calcularsegundos(){
        segundos = horas * 3600;
    }
    
    // public void establecerarea
    
    public void calculardias(){
        dias = horas / 24;
    }
     
    // Metodos obtener
    
    public double obtenerhoras(){
        return horas;
    }
    
    public double obtenercalcularminutos(){
        return minutos;
    }
    
    public double obtenercalcularsegundos(){
        return segundos;
    }
    
    public double obtenercalculardias(){
        return dias;
    }
    
}
