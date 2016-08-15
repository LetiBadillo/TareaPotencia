/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equisrecursivo;

/**
 *
 * @author ASUS
 */
public class equis {
    
     
      public static int elevar (int x, int n) {
        if (n==0) {  //Caso base, cuando n sea igual a 0, regresa 1 y se sale del método.
            return 1;  //Este uno se multiplica con el resultado final, no alterandolo.
        } else  { 
            return x*elevar(x, n-1); // Va multiplicando el valor de equis mientras n sea diferente de 0, 
                                     //a su vez n va contando regresivamente
        } 
    } 
 }


