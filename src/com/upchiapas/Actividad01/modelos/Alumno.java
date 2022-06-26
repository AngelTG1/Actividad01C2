package com.upchiapas.Actividad01.modelos;
import java.util.ArrayList;

public class Alumno {
    private String nombreAlumno;
    private int matriculaAlumno;
    private int contraseñaAlumno;


    public Alumno(String nombreAlumno, int matriculaAlumno,int contraseñaAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.matriculaAlumno = matriculaAlumno;
        this.contraseñaAlumno = contraseñaAlumno;

    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getMatriculaAlumno() {
        return matriculaAlumno;
    }

    public void setMatriculaAlumno(int matriculaAlumno) {
        this.matriculaAlumno = matriculaAlumno;
    }

    public int getContraseñaAlumno() {
        return contraseñaAlumno;
    }

    public void setContraseñaAlumno(int contraseñaAlumno) {
        this.contraseñaAlumno = contraseñaAlumno;
    }

}
