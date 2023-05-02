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
        
        InstitucionesEducativas ed = new InstitucionesEducativas();
        
        // Asignamos valores 
        
        String nombre = "Unidad Educativa Fiscomisional 'Daniel Alvarez Burneo'";
        String tipoInstitucion = "Publica";
        int numeroAlumnos = 3000;
        int numeroDocentes = 130;
        int numeroSedes = 15;
        double gastoProyectado = 1000;
        
        // Llamamos a los metodos y les otorgamos los datos
        
        ed.establecernombre(nombre);
        ed.establecertipoInstitucion(tipoInstitucion);
        ed.establecernumeroAlumnos(numeroAlumnos);
        ed.establecernumeroDocentes(numeroDocentes);
        ed.establecernumeroSedes(numeroSedes);
        ed.establecergastoProyectado(gastoProyectado);
        
        // Llamamos a los metodos calcular, estos metodos tienen como funcion presentar
        // el resultado del calculo plateado en cada uno de los metodos, no se envian datos
        // pues trabaja con los datos asignados anteriormente
        
        ed.calcularpresupuesto();
        
        // Procedemos a mostrar cada uno de los datos
        
        System.out.printf("Datos Institucionales\n"
                + "\nNombre: %s\n"
                + "\nTipo de institucion: %s\n"
                + "\nNumero de alumnos: %d\n"
                + "\nNumero de docentes: %d\n"
                + "\nNumero de Sedes: %d\n"
                + "\nGasto proyectado por estudiante: %.2f\n"
                + "\nPresupuesto: %.2f\n"
                , ed.obtenernombre(),
                ed.obtenertipoInstitucion(), 
                ed.obtenernumeroAlumnos(),
                ed.obtenernumeroDocentes(),
                ed.obtenernumeroSedes(),
                ed.obtenergastoProyectado(),
                ed.obtenercalcularpresupuesto());
        
    }
    
}
