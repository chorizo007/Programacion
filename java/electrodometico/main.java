/*
 * La empresa nos dice que quiere almacenar los electrodomesticos que tiene en el almacen
   en un array de 10 posiciones y que debe ser capaz:
    
    Mostrar un listado de todos los electrodomesticos

    Saber cual sera la ganancia final de los electrodomesticos que tiene en el
    almacen, sabiendo que ellos solo pagan por el precio base

    Saber cuantos electrodomesticos tiene de un determinado color que se leera
    por teclado
 */

/**
 *
 * @author Geles
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        //Creamos el array de objetos
        Electrodomestico prueba[]=new Electrodomestico[5];
        Electrodomestico nuevo;

        //Recorremos el arry y para cada posicion
        for(int ind = 0; ind < 5; ind++)
        {
            //Pedimos los valores de los atributos
            System.out.print("Peso: ");
            double peso = leer.nextDouble();
            
            System.out.print("PRecio base: ");
            double precioBase = leer.nextDouble();
            
            prueba[ind] = new Electrodomestico(precioBase,peso);
            
            /**nuevo = new Electrodomestico(precioBase,peso);
            prueba[ind] = nuevo;**/
        }
        
        //Hacemos un nuevo recorrido pra mostrar un listado
        for(int ind = 0; ind < 5; ind++)
        {
            System.out.println(prueba[ind].getColor()+" "+prueba[ind].getPeso()+" "+
                    prueba[ind].getPrecioBase()+" "+prueba[ind].getConsumoEnergetico()+" "+
                    prueba[ind].precioFinal());
        }
    }
    
}
