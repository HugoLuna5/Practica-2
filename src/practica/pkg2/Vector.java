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
public class Vector {
    public static void main(String[] args) {
        
        int nNumero;
        Scanner T = new Scanner(System.in);
        try{
        System.out.println("Ingresa un numero");
        nNumero = T.nextInt();
        
        int vector[] = new int [nNumero];
        
            for (int i = 0; i < nNumero; i++) {
                System.out.println("Ingresa un numero");
                
                vector[i] = T.nextInt();
            }
        
            //Orden de los numero en el vector
            
            for (int i = 0; i <= nNumero; i++) {
                System.out.println("El orden en que se ingresaron los numero fue "+(i+1)+": "+vector[i]);    
            }
            
            
        }catch(Exception e){
         System.err.println("Upps ocurrio un error al ingresar los datos ");
        
        }
        
        
        
    }
}
