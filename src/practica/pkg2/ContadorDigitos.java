/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class ContadorDigitos {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, cifras;
        char car;
        try{
        do{
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            if(n>999 || n <0){
                System.err.println("Numero invalido, por favor ingresa un numero entre 0 y 999");
            }
                    
            cifras= 0;    //esta variable es el contador de cifras
            while(n!=0){             //mientras a n le queden cifras
                    n = n/10;         //le quitamos el último dígito
                   cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El número tiene " + cifras+ " cifras");
            System.out.print("Continuar? ");
            car = (char)System.in.read();
        }while(car!='n' && car != 'N');    
        }catch(Exception e){
            System.err.println("Upss ocurrio un error ");
        }
    }
    }

