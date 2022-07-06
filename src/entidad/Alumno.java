/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

public class Alumno {
    
    private String nombre;
    private int nota1;
    private int nota2;
    private int nota3;
    private int notafinal;

  

    public Alumno() {
    }

    public Alumno(String nombre, int nota1, int nota2, int nota3, int notafinal) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notafinal = notafinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
      public int getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(int notafinal) {
        this.notafinal = notafinal;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", notafinal=" + notafinal + '}';
    }
    
    } 

