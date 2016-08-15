/*
 Blanca Leticia Badillo Guzmán 511262
Cuarto Semestre
 */
package equisrecursivo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Equisrecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x, n; //Declaración de variables
        Scanner sc = new Scanner(System.in); //Creación del escanner
        System.out.println("Calcule x^n:");
        System.out.println("Introduzca el valor de x: ");
        x = sc.nextInt(); //Asigna en la variable x el valor introducido por el usuario
        System.out.println("Introduzca el valor de n: ");
        n=sc.nextInt(); //Asigna el valor de n
        if (n>=0){ 
        System.out.println("El resultado es: "+equis.elevar(x, n)); //Imprime el resultado accediendo al método elevar si n es igual o mayor a 0
        }else{ //Si n es menor que 0
        System.out.println("El valor de n debe ser mayor o igual a 0"); 
        }
    }
    
}
