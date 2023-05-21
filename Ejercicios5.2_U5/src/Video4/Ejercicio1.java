/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Video4;

import java.util.Scanner;


/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int serie[] = new int[10]; //creamos el arreglo de nuestra serie de 10 elementos
        boolean creciente = false, decreciente = false;
        
        System.out.println("SOLICITANDO DATOS: ");
        for(int i = 0; i<serie.length; i++){
            System.out.print((i+1)+ ". DIGAME UN NUMERO: ");
            serie[i] = teclado.nextInt();
        }        
        
        for(int i = 0; i<9; i++){
            if(serie[i] < serie[i+1]){ //creciente: 1,2,3,4,5,6...
                creciente = true;
            }
            if(serie[i] > serie[i+1]){ //decreciente: 10,9,8,7,6,5,4...
                decreciente =  true;
            }
        }
        
        if(creciente == true && decreciente == false){ //condicion para ver si es forma creciente
            System.out.println("La serie tiene una forma creciente");
        }
        else if(creciente == false && decreciente == true){ //condicion para ver si es forma decreciente
            System.out.println("La serie tiene una forma decreciente");
        }
        else if(creciente == true && decreciente == true){ //condicion para ver si la serie esta desordenada
            System.out.println("La serie esta desordenada");
        }
        else if (creciente == false && decreciente == false){ //condicion para ver si los numeros de la serie son iguales
            System.out.println("Los numeros de la serie son iguales");
        }
        
        
        
    }
}
