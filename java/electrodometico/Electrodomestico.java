/**
 * Clase electrodomestico
 * 
 * @author (Geles Gimenez) 
 *
 */
public class Electrodomestico
{
    
    //Colores disponibles
    /****
     * Al definirla como estatic, se comparte entre todos los objetos, pero solo
     * hay una copia
     */
    private static String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
    
    //Constantes
   
    /**
     * Constantes que almacenan los valores por defecto de los electrodomesticos
     * Al definirlas como constantes utilizamos el nombre de la constante para
     * asignar sus valores. Al ser static, se coparten entre todos los metodos
     */
    
    private final static String COLORDEF="blanco";
   
    
    //Consumo energetico por defecto
    private final static char CONSUMODEF='F';
   
    //Precio base por defecto
    private final static double PRECIODEF=100;
   
    
    //Peso por defecto
    private final static double PESODEF=5;
   
    /**
     * Atributos de los electrodomesticos
     */
   
    //El precio base del electrodomestico
     private double precioBase;
   
    
    //Color del electrodomestico
    private String color;
   
    //Indica el consumo energetico del electrodomestico
    private char consumoEnergetico;
   
    //Peso del electrodomestico
    private double peso;
    
    
    /**
     * Metodo prvado para comprobar que el color es válido
     */
    private void comprobarColor(String color)
    {
        
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color))
            {
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLORDEF;
        }
    }
    
    /**
     * Metodo privado para comprobar el consumo energético
     */
    private void comprobarConsumoEnergetico(char consumoEnergetico)
    {
        //Si la letra esta en el rango [A,F] damos eal atributo consumoEnergetico el valor del parametro
        if(consumoEnergetico>='A' && consumoEnergetico<='F'){
            this.consumoEnergetico=consumoEnergetico;
            
        //En otro caso damos al atributo el valor por defecto
        }else{
            this.consumoEnergetico=CONSUMODEF;
        }
    }
    
    /**
     * Constructores
     */
    
    //Constructor que recibe todos los parametros
     public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color)
     {
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
    
    //Constructor que recibe el precio y el peso
     public Electrodomestico(double precioBase, double peso)
     {
         
        //Hacemos una llamada al constructor que recibe todos los parametros con el presio y el peso recibido y los demas atributos por defecto
        this(precioBase, peso,CONSUMODEF,COLORDEF);
    }
    
    //Constructor por defecto
     public Electrodomestico()
     {
         //Hacemos una llamada al constructor que recibe todos los parametros con los valores por defecto
        this(PRECIODEF, PESODEF, CONSUMODEF, COLORDEF);
    }
    
    /**
     * Metodos publicos
     */
    
    //Metodos get
    public double getPrecioBase()
    {
        return precioBase;
    }
    
    public String getColor() 
    {
        return color;
    }
    
    public char getConsumoEnergetico() 
    {
        return consumoEnergetico;
    }
    
     public double getPeso()
     {
        return peso;
    }
    
    /**
     * Metodo que calcula el precio final del electrodomestico
     */
    
     public double precioFinal()
     {
        double plus=0;  //Dependiendo del consumoEnergetico y el peso se añade un plus al precioBase
        
        //Calculamos cuanto hay que añadir al plus dependiendo del consumoEnergetico
        switch(consumoEnergetico){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }
        
        //Claculamos cuanto hay que añadir al plus dependiendo del peso
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }
        
        //Devolvemos el precio final del electrodmestico
        return precioBase+plus;
    }
    
}//Fin de la clase Electrodomestico

