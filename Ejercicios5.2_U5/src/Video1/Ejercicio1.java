package Video1;

import java.util.Scanner;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio1 {
        public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        float Numeros[] = new float [5];
        
        //Memoria de numeros
        System.out.println("Obteniendo Numeros: ");
        for(int i = 0; i<Numeros.length; i++){
            System.out.print((i+1)+". Ingrese un Numero:");
            Numeros[i] = teclado.nextFloat();
        }
        
        System.out.println("Devolviendo Numeros: ");
        for(float i:Numeros){
            System.out.println(i);
        }
    }
}
