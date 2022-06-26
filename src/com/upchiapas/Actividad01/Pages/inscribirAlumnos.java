package com.upchiapas.Actividad01.Pages;

import com.upchiapas.Actividad01.modelos.Materia;

import java.util.ArrayList;
import java.util.Scanner;

public class inscribirAlumnos {
    static Scanner entrada = new Scanner(System.in);
    ArrayList<Materia> materias= new ArrayList<>();
    public void registrarMaterias(){


        System.out.println("ingresa el nombre de la materia");
        String materia =entrada.nextLine();
        System.out.println("ingresa el grupo de la materia");
        String grupo = entrada.nextLine();
        Materia materia1= new Materia();
        materia1.setNombreMaterias(materia);
        materia1.setGrupo(grupo);
        materias.add(materia1);

    }


    public void verMaterias(){
        for (int i=0;i < materias.size();i++){
            System.out.println("materia "+materias.get(i).getNombreMaterias()+" grupo: "+materias.get(i).getGrupo());
        }
    }
    public void cargaManual(){
        int opc;
        System.out.println("quieres agregar una carga manual  1:si  2:no");
        opc=entrada.nextInt();
        System.out.println("1: poo A");
        System.out.println("2. calculo C");
        System.out.println("ingresa la materia que quieres registar");
        opc=entrada.nextInt();


    }
}
