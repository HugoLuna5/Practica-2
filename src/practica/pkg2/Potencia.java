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
public class Potencia {
    public static void main(String[] args) {
        Scanner T= new Scanner(System.in);
        int base, exponente;
        Potencia obj = new Potencia();
        try{
        
            System.out.println("Escribe la base");
            base = T.nextInt();
            System.out.println("Escribe el exponente");
            exponente = T.nextInt();
            
            
            System.out.println("La potencia de "+base+"^"+exponente+" es: "+obj.calcularPotencia(base,exponente));
            
        }catch(Exception e){
        
         System.err.println("Upps ocurrio un error al ingresar los datos ");
        }
        
        
    }
    
     public int calcularPotencia(int base, int exp){
    
        int potencia =1;
        
        for(int i = 0; i < exp; i++){
        potencia = potencia * base;
        
        }
        
        return potencia;
    }
}
