/*

 */
package metodostatic;
import java.util.Scanner;
/**
 *
 * @author GSW1A3647356
 */
public class funcionespunto {
	private int x;
	private int y;
        //metodo que devulve la abstisa 
	public int leerX()
	{
            return this.x;
	}
        //funcion que muestra un menu
        public static void mostrarOpcion(){
            System.out.println("1. crear un punto");
            System.out.println("2. leer punto");
            System.out.println("3. hacer copia ");
            System.out.println("4. sumar dos puntos");
        }
        //funcion que crea un punto con valores por defecto
        public static punto crearPunto(){
            punto nuevo=new punto();
            return nuevo;
        }
        
        
        //fucion que lee la coordenada
        public static punto devolverX(punto p){
            return p.leerX();
        }
        
        public static int pedirOpcion(){
            Scanner lector = new Scanner(System.in);
            int opcion=0;
            do{
                System.out.print("Introduce la opcion que quieres ejecutar :");
                opcion = lector.nextInt();
            }while(opcion<0 && opcion>4);
            return opcion;
        }
        
        public static void ejecutarOpcion(int opcion){
            switch(opcion){
                case 1: crearPunto();
                case 2: devolverX();
                case 3: ; 
                case 4: ; 
                case 5: ; 
            }
        }
        
}
