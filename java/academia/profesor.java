package academia;

import java.lang.Math;

public class profesor {
     /* Atrubutos de la clase */
     private String nombre;

     /* Constructor */
     public profesor(String nombre) {
          this.nombre=nombre;
     }

     /* Metodo poner las notas */
     public void poner_calificaciones(alumno alum) {
          double notas;
          for (int i = 0; i < alum.indice; i++) {
               notas=Math.random()*10;

               /* El atrubuto calificaciones de la clase alumno es protected entonces
               se puede acceder de forma directa a las asignaturas almacenadas en ese array 
               Los atributos del objeto asigantura son pv por eso no se puede acceder directamente
               a ellos*/

               /* Si el atrubuto de calificacion de la clase asignatura hubiese sido protected
               podriamos modificarlo de la siguiente forma */

               alum.calificaciones[i].poner_calificacion(notas);
          }
     }

     /* Metodo que calcule la media */
     public double calculo_media(alumno alum) {
          asignatura notas[]=alum.obtener_calificaciones();
          double acumulador=0;

          /* Recorremos el array y vamos sumando */
          for (int i = 0; i < notas.length; i++) {
               acumulador+= notas[i].obtener_calificacion();
          }

          /* Devolvemos la media */
          return acumulador/notas.length;
     }
}
