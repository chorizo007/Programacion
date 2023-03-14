package academia;

public class academia {
     public static void main(String[] args) {
          asignatura[] notas;

          /* Creamos tres objetos tipo asignatura */
          asignatura as1=new asignatura(1, "Sistemas");
          asignatura as2=new asignatura(2, "Bases de datos");
          asignatura as3=new asignatura(3, "Entornos de desarrollo");

          /* Creamos el alumno */
          alumno al1=new alumno("Anibal", 3);

          /* Creamos el profesor */
          profesor p1=new profesor("Paco");

          /* Matriculamos al alumno en las asignaturas creadas */
          al1.insertar_asignatura(as1);
          al1.insertar_asignatura(as2);
          al1.insertar_asignatura(as3);

          /* El profesor pone las calificaciones */
          p1.poner_calificaciones(al1);

          /* Obtenemos las calificaciones del alumno */
          notas=al1.obtener_calificaciones();

          /* Mostramos la nota de cada asignatura */
          for (int i = 0; i < notas.length; i++) {
               System.out.println("La nota de " + notas[i].obtener_nombre()
               + " es " + notas[i].obtener_calificacion());
          }

          /* Mostramos la nota media */
          System.out.println("La media es " + p1.calculo_media(al1));
     }
}
