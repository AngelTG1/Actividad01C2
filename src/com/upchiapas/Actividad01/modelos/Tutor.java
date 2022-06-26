package com.upchiapas.Actividad01.modelos;

public class Tutor {
    private String nombreTutor;
    private int matriculaTutor;
    private int contraseñaTutor;

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public int getMatriculaTutor() {
        return matriculaTutor;
    }

    public void setMatriculaTutor(int matriculaTutor) {
        this.matriculaTutor = matriculaTutor;
    }

    public int getContraseñaTutor() {
        return contraseñaTutor;
    }

    public void setContraseñaTutor(int contraseñaTutor) {
        this.contraseñaTutor = contraseñaTutor;
    }

    public Tutor(String nombreTutor, int matriculaTutor, int contraseñaTutor) {
        this.nombreTutor = nombreTutor;
        this.matriculaTutor = matriculaTutor;
        this.contraseñaTutor = contraseñaTutor;
    }
}
