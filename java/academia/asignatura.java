package academia;

public class asignatura {
     /* Atributos de clase asignatura */
     private int identificador;
     private String nombre;
     private double calificacion;

     /* Constructor */
     public asignatura(int identificador, String nombre) {
          this.identificador=identificador;
          this.nombre=nombre;
     }

     /* Metodos get */
     public int obtener_identificador() {
          return this.identificador;
     }

     public String obtener_nombre() {
          return this.nombre;
     }

     public double obtener_calificacion() {
          return this.calificacion;
     }

     /* Metodo set */
     public void poner_calificacion(double calif) {
          this.calificacion=calif;
     }
}
