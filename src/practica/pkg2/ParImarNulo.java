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
public class ParImarNulo {
    public static void main(String[] args) {
        
        
         Scanner T = new Scanner(System.in);
        int A;
     
       try{
            System.out.println("Escribe un número: ");
        A = T.nextInt();
        
        if(A % 2 == 0 && A != 0){
            System.out.println(A+" es par");
        }else if(A == 0){
        System.out.println(A+" es nulo");
        }
        
        else{
            System.out.println(A+" es impar");

        }
       
       }catch(Exception e){
            System.err.println("Upps ocurrio un error al ingresar los datos ");
       }
    }
}
