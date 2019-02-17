
package ImplementacionColas;

import java.util.Scanner;

public class Ejecucion {

    public static void main(String[] args) 
    {
     
        Cola objCola;
        Scanner entrada = new Scanner (System.in);
        int tamaño;
        
        System.out.println("Ingrese el tamaño de la cola");
        tamaño = entrada.nextInt();
        
        objCola = new Cola (tamaño);
        
        int opcion = 0;
        
        do
        {
           System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion");
            opcion=entrada.nextInt(); 
            
            switch(opcion)
            {
                case 1: objCola.Encolar();
                    break;
                case 2: objCola.Desencolar();
                    break;
                case 3: objCola.MostrarCola();
                    break;
            }
        }
        while(opcion!=4);
    }
}  

