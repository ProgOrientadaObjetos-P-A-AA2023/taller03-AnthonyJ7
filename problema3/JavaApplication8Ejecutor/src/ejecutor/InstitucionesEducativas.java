/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor;

/**
 *
 * @author ASUS
 */
public class InstitucionesEducativas {
    
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoProyectado;
    private double presupuesto;
    
    public void establecernombre(String c){
        nombre = c;
    }
     
    public void establecertipoInstitucion(String c){
        tipoInstitucion = c;
    }
    
    public void establecernumeroAlumnos(int c){
        numeroAlumnos = c;
    }
    
    public void establecernumeroDocentes(int c){
        numeroDocentes = c;
    }
    
    public void establecernumeroSedes(int c){
        numeroSedes = c;
    }
    
    public void establecergastoProyectado(double c){
        gastoProyectado = c;
    }
    
    // public void establecerpresupuesto
    
    public void calcularpresupuesto(){
        presupuesto = numeroAlumnos * gastoProyectado;
    }
    
    // Metodos obtener
     
    public String obtenernombre(){
        return nombre;
    }
     
    public String obtenertipoInstitucion(){
        return tipoInstitucion;
    }
    
    public int obtenernumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public int obtenernumeroDocentes(){
        return numeroDocentes;
    }
    
    public int obtenernumeroSedes(){
        return numeroSedes;
    }
    
    public double obtenergastoProyectado(){
        return gastoProyectado;
    }
    
    // public void obtenerpresupuesto
    
    public double obtenercalcularpresupuesto(){
        return presupuesto;
    }
    
}
