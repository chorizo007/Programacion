package academia;

public class alumno {
     /* Atrubutos de la clase */
     private String nombre;
     protected asignatura[] calificaciones;
     protected int indice;

     /* Constructor */
     public alumno(String nombre, int num) {
          this.nombre=nombre;
          this.indice=0;

          /* Creo el array con el tamaño indicado del parametro indice */
          this.calificaciones=new asignatura[num];
     }

     /* Metodos get */
     public String obtener_nombre() {
          return this.nombre;
     }

     public asignatura[] obtener_calificaciones() {
          return this.calificaciones;
     }

     /* Metodo para añadir asignaturas al array */
     public void insertar_asignatura(asignatura asig) {
          /* Comprobamos que haya espacio para la nueva asignatura */
          if (indice < calificaciones.length) {
               this.calificaciones[indice]=asig;
               this.indice++;
          } else {
               System.out.println("El alumno ya esta matriculado en esas asignatura");
          }
     }
}
