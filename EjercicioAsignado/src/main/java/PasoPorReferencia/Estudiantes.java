package PasoPorReferencia;

import clases.Estudiante;

public class Estudiantes {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        estu.Nombre = "Kevin";
        estu.Apellido = "Alvarenga";
        estu.Edad = 20;
        estu.Carrera = "Licenciatura en computacion";
        System.out.println("ASIGNAR VALOR " + "\n" + "El estudiante es " + estu.Nombre + ", su apellido "
                + estu.Apellido + " tiene la edad de " + estu.Edad + " y estudia "
                + estu.Carrera);
        CambiarValores(estu);
        System.out.println("METODO CAMBIO VALOR " + "\n" + "El estudiante es " 
                + estu.Nombre + ", su apellido " + estu.Apellido + " tiene la edad de " 
                + estu.Edad + " y estudia " + estu.Carrera);
        DesplegarInformacion(estu);
    }

    public static void CambiarValores(Estudiante es) {
        es.Nombre = "Jose";
        es.Apellido = "Larin";
        es.Edad = 30;
        es.Carrera = "Ingeniera en sistema";
    }
    
      public static void DesplegarInformacion(Estudiante es){
          System.out.println("METODO DESPLEGAR INFORMACION");
        System.out.println("Nombre: " + es.Nombre);
        System.out.println("Apellido: " + es.Apellido);
        System.out.println("Edad: " + es.Edad);
        System.out.println("Carrera: " + es.Carrera);
    }

}
