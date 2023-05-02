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
        
        DispositivosElectronicos de = new DispositivosElectronicos();
        
        // Asignamos valores 
        
        String sistemaOperativo = "Android";
        float tamanioPantalla = (float) 5.4;
        double costoInicial = 225;
        double iva = 0.12;
        String direccionMac = "40:11:C3:8F:4F:C0";
        String informacionIMEI = "359557705767172";
        
        // Llamamos a los metodos y les otorgamos los datos
        
        de.establecersistemaOperativo(sistemaOperativo);
        de.establecertamanioPantalla(tamanioPantalla);
        de.establecercostoInicial(costoInicial);
        de.estableceriva(iva);
        de.establecerdireccionMac(direccionMac);
        de.establecerinformacionIMEI(informacionIMEI);
        
        // Llamamos a los metodos calcular, estos metodos tienen como funcion presentar
        // el resultado del calculo plateado en cada uno de los metodos, no se envian datos
        // pues trabaja con los datos asignados anteriormente
        
        de.calcularivaCostoInicial();
        de.calcularcostoFinal();
        
        // Procedemos a mostrar cada uno de los datos
        
        System.out.printf("Datos del Dispositivo\n"
                + "\nSistema Operativo: %s \n"
                + "\nTamanio Pantalla: %.2f\n"
                + "\nCosto inicial: %.2f\n"
                + "\nIva 12: %.2f\n"
                + "\nCosto final mas IVA: %.2f\n"
                + "\nDireccion MAC: %s\n"
                + "\nInformacion IMEI: %s\n"  
                , de.obtenersistemaOperativo(),
                de.obtenertamanioPantalla(), 
                de.obtenercostoInicial(),
                de.obtenercalcularivaCostoInicial(),
                de.obtenercalcularcostoFinal(),
                de.obtenerdireccionMac(),
                de.obtenerinformacionIMEI());

    }
    
}
