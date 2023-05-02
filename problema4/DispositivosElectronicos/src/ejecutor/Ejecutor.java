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
        
        DispositivosElectronicos de2 = new DispositivosElectronicos();
        
        // Asignamos valores 
        
        String sistemaOperativo2 = "Android";
        float tamanioPantalla2 = (float) 5.5;
        double costoInicial2 = 200;
        double iva2 = 0.12;
        String direccionMac2 = "40:13:C3:9F:4F:C0";
        String informacionIMEI2 = "359557707894572";
        
        // Llamamos a los metodos y les otorgamos los datos
        
        de2.establecersistemaOperativo(sistemaOperativo2);
        de2.establecertamanioPantalla(tamanioPantalla2);
        de2.establecercostoInicial(costoInicial2);
        de2.estableceriva(iva2);
        de2.establecerdireccionMac(direccionMac2);
        de2.establecerinformacionIMEI(informacionIMEI2);
        
        // Llamamos a los metodos calcular, estos metodos tienen como funcion presentar
        // el resultado del calculo plateado en cada uno de los metodos, no se envian datos
        // pues trabaja con los datos asignados anteriormente
        
        de2.calcularivaCostoInicial();
        de2.calcularcostoFinal();
        
        // Procedemos a mostrar cada uno de los datos
        
        System.out.printf("Datos del Dispositivo\n"
                + "\nSistema Operativo: %s \n"
                + "\nTamanio Pantalla: %.2f\n"
                + "\nCosto inicial: %.2f\n"
                + "\nIva 12: %.2f\n"
                + "\nCosto final mas IVA: %.2f\n"
                + "\nDireccion MAC: %s\n"
                + "\nInformacion IMEI: %s\n"  
                , de2.obtenersistemaOperativo(),
                de2.obtenertamanioPantalla(), 
                de2.obtenercostoInicial(),
                de2.obtenercalcularivaCostoInicial(),
                de2.obtenercalcularcostoFinal(),
                de2.obtenerdireccionMac(),
                de2.obtenerinformacionIMEI());

    }
    
}
