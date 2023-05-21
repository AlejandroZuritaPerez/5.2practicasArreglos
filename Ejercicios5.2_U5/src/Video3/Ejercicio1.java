/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Video3;

import java.util.Scanner;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabla1[] = new int[10]; //tabla1
        int tabla2[] = new int[10]; //tabla2
        int tabla3[] = new int[20]; //tabla3, guardando lo que tiene tabla 1 y 2
        
        //pedimos al usuario el tabla|1
        System.out.println("SOLICITANDO DATOS DE LA TABLA 1: ");
        for (int i = 0; i<tabla1.length; i++){
            System.out.print((i+1)+". DAME UN NUMERO: ");
            tabla1[i] = teclado.nextInt();
    }
        System.out.println("---------------------------------------");
        //pedimos al usuario el tabla2
        System.out.println("\nSOLICITANDO DATOS DE LA TABLA 2: ");
        for (int i = 0; i<tabla2.length; i++){
            System.out.print((i+1)+ ". DAME OTRO NUMERO: ");
            tabla2[i] = teclado.nextInt();
        }
        //imprimimos las 2 tablas
        for (int i:tabla1){
            System.out.println(i);
        }
        System.out.println("---------------------------------------");
        for (int i:tabla2){
            System.out.println(i);
        }
        
        //creamos el tabla3
        //utilizare el iterador i para tabla 1 y 2
        //y el iterador j para la tabla3
        int j=0;
        for (int i = 0; i<10; i++){
            tabla3[j] = tabla1[i]; //1-A
            j++;
            tabla3[j] = tabla2[i]; //2-B
            j++;
        }
        System.out.println("---------------------------------------");
        System.out.print("\nLa tabla 3 queda de la siguente forma: ");
        for (int i:tabla3){
            System.out.print(i + " ");
        }
        
    }
}
