/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor;

/**
 *
 * @author ASUS
 */
public class DispositivosElectronicos {
    
    private String sistemaOperativo;
    private float tamanioPantalla;
    private double costoInicial;
    private double iva;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionIMEI;
   
    public void establecersistemaOperativo(String c){
        sistemaOperativo = c;
    }
     
    public void establecertamanioPantalla(float c){
        tamanioPantalla = c;
    }
    
    public void establecercostoInicial(double c){
        costoInicial = c;
    }
    
    public void estableceriva(double c){
        iva = c;
    }
    
    public void establecerdireccionMac(String c){
        direccionMac = c;
    }
    
    public void establecerinformacionIMEI(String c){
        informacionIMEI = c;
    }
    
    // public void establecerpresupuesto
    
    public void calcularivaCostoInicial(){
        ivaCostoInicial = costoInicial * iva;
    }
    
    public void calcularcostoFinal(){
        costoFinal = costoInicial + ivaCostoInicial ;
    }
    
    // Metodos obtener
     
    public String obtenersistemaOperativo(){
        return sistemaOperativo;
    }
     
    public float obtenertamanioPantalla(){
        return tamanioPantalla;
    }
    
    public double obtenercostoInicial(){
        return costoInicial;
    }
    
    public double obteneriva(){
        return iva;
    }
    
    public String obtenerdireccionMac(){
        return direccionMac;
    }
    
    public String obtenerinformacionIMEI(){
        return informacionIMEI;
    }
    
    // public void establecerpresupuesto
    
    public double obtenercalcularivaCostoInicial(){
        return ivaCostoInicial;
    }
    
    public double obtenercalcularcostoFinal(){
        return costoFinal;
    }
    
}

