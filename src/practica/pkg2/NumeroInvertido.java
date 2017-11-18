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
public class NumeroInvertido {
    
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
         int num;
        try{
            
        System.out.println("Ingresa un número");
        num = T.nextInt();

        String str = String.valueOf(num) ;
        String rpta = " " ;

        char[] valor = str.toCharArray();

        for (int i = valor.length-1; i>-1; i--) {
        rpta+= valor[i]+ " ";
        }
        System.out.println(rpta);
        
        }catch(Exception e){
            
            System.err.println("Upps ocurrio un error al ingresar los datos ");
        }
    }
   
}
