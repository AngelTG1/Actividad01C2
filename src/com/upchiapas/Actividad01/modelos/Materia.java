package com.upchiapas.Actividad01.modelos;

public class Materia {
    private String grupo;
    private String nombreMaterias;

    public Materia() {
    }


    public Materia(String grupo, String nombreMaterias) {
        this.grupo = grupo;
        this.nombreMaterias = nombreMaterias;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNombreMaterias() {
        return nombreMaterias;
    }

    public void setNombreMaterias(String nombreMaterias) {
        this.nombreMaterias = nombreMaterias;
    }

}
