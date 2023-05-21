/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Video2;

import java.util.Scanner;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numeros[] = new float[5];
        float sumaPositivos = 0, sumaNegativos = 0, mediaPositivos = 0, mediaNegativos = 0;
        int conteoPositivos = 0, conteoNegativos = 0, conteoCeros = 0;
        
        //memoría de numeros en el arreglo
        System.out.println("OBTENIENDO NUMEROS");
        for(int i = 0; i < numeros.length; i++){
            System.out.print((i+1)+ ". DEME UN NUMERO: ");
            numeros[i] = teclado.nextFloat();
            
            if (numeros[i] == 0){
                conteoCeros++;
            } else
                if(numeros[i] > 0){
                    sumaPositivos += numeros[i];
                    conteoPositivos++;
                } else
                    sumaNegativos += numeros[i];
                    conteoNegativos++;
                    
        }
        
        //media de numeros positivos
        if (conteoPositivos == 0){
            System.out.println("NO SE PUEDE CALCULAR LA MEDIA DE LOS NUMEROS POSITIVOS");
        }else
            mediaPositivos = sumaPositivos / conteoPositivos;
            System.out.println("LA MEDIA DE LOS NUMEROS POSITIVOS ES: " +mediaPositivos);
        
            
        //media de numeros negativos
        if (conteoNegativos == 0){
            System.out.println("NO SE PUEDE CALCULAR LA MEDIA DE LOS NUMEROS NEGATIVOS");
        }else
            mediaNegativos = sumaNegativos / conteoNegativos;
            System.out.println("LA MEDIA DE LOS NUMEROS NEGATIVOS ES: " +mediaNegativos);
        
        System.out.println("LA CANTIDAD DE CEROS ES: "+conteoCeros);
    }
}
