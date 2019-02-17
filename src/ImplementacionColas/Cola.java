
package ImplementacionColas;
import java.util.Scanner;


public class Cola 
{
        //Atributos
        private int tamaño;
        private int inicio;
        private int fin;
        private int [] vectCola;
        
        Scanner entrada = new Scanner(System.in);
        
        public Cola()
        {
            this.tamaño = 100;
            this.inicio = 0;
            this.fin = 0;
            this.vectCola = new int [this.tamaño + 1];
        }
        
        public Cola(int tamaño)
        {
            this.tamaño = tamaño;
            this.inicio = 0;
            this.fin = 0;
            this.vectCola = new int [this.tamaño + 1];
        }
        
        public boolean EstaLlena()
        {
            if(this.fin == this.tamaño)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
        public boolean EstaVacia()
        {
            if(this.fin == this.inicio)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
        public void Encolar()
        {
            if(this.EstaLlena())
            {
                System.out.println("Cola Llena");
            }
            else
            {
                int item;
                System.out.println("Digite el elemento a encolar");
                item = entrada.nextInt();
                this.fin ++;
                this.vectCola[this.fin] = item;
            }
        }
        
        public void Desencolar()
        {
            if(this.EstaVacia())
            {
                System.out.println("Esta Vacia");
            }
            else
            {
                for(int i = this.inicio ; i < this.fin ; i++)
                {
                    vectCola[i] = vectCola [i+1];
                }
                this.fin--;
            }
        }
        
        public void MostrarCola()
        {
            if(this.EstaVacia())
            {
                System.out.println("Esta Vacia");
            }
            else
            {
                for(int i = this.inicio ; i<=this.fin ; i++)
                {
                    System.out.println(vectCola[i]);
                }
            }
        }
        
    
}
