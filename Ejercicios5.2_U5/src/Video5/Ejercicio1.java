/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Video5;

import java.util.Scanner;

/**
 *
 * @author ap550
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        int arreglo []= new int[10];//Creamos el arreglo de 10 elementos enteros
        int ultimo;
        
        System.out.println("SOLICITANDO DATOS: ");
        for(int i=0;i<arreglo.length;i++){
            System.out.print((i+1)+". Dame un numero: ");  
            arreglo[i]=entrada.nextInt();
        }
        
        ultimo= arreglo[9];//Guardamos el ultimo elemento
        
        for(int i=8;i>=0;i--){//Avanzar un posición abajo en el arreglo
            arreglo[i+1]=arreglo[i];
        }
        
        arreglo[0]=ultimo;//Ponemos el último elemento como primero 
        
        System.out.println("\nEl nuevo arreglo es: ");
        for(int i=0;i<10;i++){
                System.out.println(i+". Número: "+arreglo[i]);
        }
    }
}
