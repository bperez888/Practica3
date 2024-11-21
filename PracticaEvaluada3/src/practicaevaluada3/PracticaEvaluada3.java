package practicaevaluada3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author bren
 */
public class PracticaEvaluada3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Informacion sobre los productos y ventas
        String dia[] = new String[7];
        System.out.println("dia[]" + dia[0]);
        
        dia[0] = "lunes";
        dia[1] = "martes";
        dia[2] = "miercoles";
        dia[3] = "jueves";
        dia[4] = "viernes";
        dia[5] = "sabado";
        dia[6] = "domingo";
        
        
        int arroz[] = new int[7];
        System.out.println("arroz[]" + arroz[0]);
        
        arroz[0] = 5;
        arroz[1] = 7;
        arroz[2] = 6;
        arroz[3] = 3;
        arroz[4] = 9;
        arroz[5] = 4;
        arroz[6] = 2;
        
        int azucar[] = new int[7];
        System.out.println("azucar[]" + azucar[0]);
        
        azucar[0] = 3;
        azucar[1] = 8;
        azucar[2] = 4;
        azucar[3] = 5;
        azucar[4] = 2;
        azucar[5] = 7;
        azucar[6] = 6;
        
        int leche[] = new int[7];
        System.out.println("leche[]" + leche[0]);
        
        leche[0] = 6;
        leche[1] = 2;
        leche[2] = 7;
        leche[3] = 5;
        leche[4] = 4;
        leche[5] = 8;
        leche[6] = 3;
        
        //dia con la mayor venta
     Dia MayorVenta = encontrarMayorVenta(dia);
        System.out.println("El dia con mayores ventas es : " + MayorVenta);
        
    //producto más vendido
      double arroz = calcularTotal(arroz);
        System.out.println("El total de ventas del arroz es: : " + arroz);
        
        
    ///total ventas por producto
    private static double calcularTotal(arroz[] producto) {
        double suma = 0;
        for (producto arroz : arroz) {
            suma += arroz.getproducto();
        }
        return   
        suma / arroz.length;
    }
     
    
    //totales por producto
    int totalArroz = 0, totalAzucar = 0, totalLeche = 0;
        for (Dia dia : dias) {
            totalArroz += dia.arroz.getCantidad();
            totalAzucar += dia.azucar.getCantidad();
            totalLeche += dia.leche.getCantidad();
            
            
            System.out.println("Total Arroz: " + totalArroz);
            System.out.println("Total Azucar: " + totalAzucar);
            System.out.println("Total Leche: " + totalLeche);
        }
        
        
        
        
        
        
        
        
        
        
                
      
              
        
        
        
        
              
    }

   
