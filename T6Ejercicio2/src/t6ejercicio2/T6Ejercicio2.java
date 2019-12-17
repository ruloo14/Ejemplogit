/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6ejercicio2;

import java.util.*;

/**
 *
 * @author usuario
 */
public class T6Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = new int[5];
        int cuadrado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 5 números");
        for (int i = 0; i < numeros.length; i++) {
            do {
                numeros[i] = sc.nextInt();
                if (numeros[i] <= 0) {
                    System.out.println("número incorrecto");
                }
            } while (numeros[i] <= 0);
        }

        for (int i = 0; i < numeros.length; i++) {
            cuadrado=numeros[i]*numeros[i];
            System.out.println(cuadrado);
        }
    }

}
