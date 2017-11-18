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
public class Farenheit {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        double f,k,k1;
        try{
        
            System.out.println("Ingrese la temperatura en Farenheit");
            f = T.nextDouble();
            
            k=f+459.67;
            k1=k*5/9;
            
            System.out.println("Los grados farenheit:"+ f+ "∞f");
            System.out.println("son en kelvin:"+ k1+ "∞k");
            
        }catch(Exception e){
            System.out.println("Upps ocurrio un error al ingresar los datos ");
        
        }
        
        
        
    }
}
