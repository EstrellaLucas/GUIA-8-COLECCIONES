/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Alumno;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

public class AlumnoServicio {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearAlumno() {

        System.out.println("»SISTEMA DE CREACION DE ALUMNOS«");
        System.out.println("");
        String resp;

        ArrayList<Alumno> alumnos = new ArrayList();

        do {

            System.out.print("Ingrese nombre del alumno: ");
            String nombre = scanner.next();
            System.out.print("Ingrese la primer nota del alumno: ");
            int nota1 = scanner.nextInt();
            System.out.print("Ingrese la segunda nota del alumno: ");
            int nota2 = scanner.nextInt();
            System.out.print("Ingrese la tercer nota del alumno: ");
            int nota3 = scanner.nextInt();
            int notafinal = (nota1 + nota2 + nota3) / 3;

            System.out.println("");

            Alumno a = new Alumno(nombre, nota1, nota2, nota3, notafinal);
            alumnos.add(a);

            System.out.println("¿Desea crear otro Alumno? si/no");
            resp = scanner.next();

        } while (!resp.equalsIgnoreCase("no"));

        System.out.println("");
        System.out.println("Los alumnos son: ");
        for (Alumno aux : alumnos) {
            System.out.println("-" + aux.toString());
        }
        System.out.println("");
        return alumnos;
    }

    public void notaFinal(ArrayList<Alumno> alumnos) {

        Iterator<Alumno> it = alumnos.iterator();
        String nombreAlumno;

        System.out.println("¿De que alumno quiere calcular la nota final?");
        nombreAlumno = scanner.next();

        while (it.hasNext()) {

            Alumno aux = it.next();

            if (aux.getNombre().equals(nombreAlumno)) {
                System.out.println("La nota final del alumno " + nombreAlumno + " es de:" + aux.getNotafinal());
            } else if (!aux.getNombre().equals(nombreAlumno)) {

                System.out.println("El alumno que escogio no se encuentra en la lista.");
            }

        }

    }
}
