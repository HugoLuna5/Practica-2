/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;

import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class TablaMult {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int  tabla,i,n;
        try{
            System.out.println("Que tabla de mutltiplicar desea ejecutar");
            tabla = T.nextInt();
            
            System.out.println("Hasta que numero desea que multiplique la tabla del: "+tabla);
            i = T.nextInt();
            
            
            for (int j=1;j<=i; j++){
        
                n = tabla*j;
                
                
                System.out.println(tabla+"x"+j+"="+ n);
               }
		
            
            
            
        }catch(Exception e){
             System.err.println("Upps ocurrio un error al ingresar los datos ");
        }
        
        
        
    }
}
