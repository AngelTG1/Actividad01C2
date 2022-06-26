package com.upchiapas.Actividad01.Pages;

import com.upchiapas.Actividad01.modelos.Tutor;
import com.upchiapas.Actividad01.modelos.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class iniciarSesion {
    Scanner entrada = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();
    ArrayList<Tutor> tutors = new ArrayList();
    public void iniciarSecionAlumno(){

        alumnos.add(new Alumno("Tagua",211223,211223));
        alumnos.add(new Alumno("Yair",123456,123456));
        alumnos.add(new Alumno("Osvaldo",31234,31234));
        alumnos.add(new Alumno("Luis",41234,41234));
        alumnos.add(new Alumno("Angel",51234,51234));

        alumnos.get(0).getMatriculaAlumno();
        System.out.println("ingresa tu maticula");
        int correo = entrada.nextInt();
        System.out.println("ingresa tu contraseña");
        int contrasena = entrada.nextInt();
        if (correo==alumnos.get(0).getMatriculaAlumno() && contrasena==alumnos.get(0).getContraseñaAlumno()){
            System.out.println("exitoso has inciado sesion con la cuenta de "+alumnos.get(0).getNombreAlumno());
        }else if (correo==alumnos.get(1).getMatriculaAlumno() && contrasena==alumnos.get(1).getContraseñaAlumno()){
            System.out.println("exitoso has inciado sesion con la cuenta de "+alumnos.get(1).getNombreAlumno());
        }else if (correo==alumnos.get(2).getMatriculaAlumno() && contrasena==alumnos.get(2).getContraseñaAlumno()){
            System.out.println("exitoso has inciado sesion con la cuenta de "+alumnos.get(2).getNombreAlumno());
        }else if (correo==alumnos.get(3).getMatriculaAlumno() && contrasena==alumnos.get(3).getContraseñaAlumno()){
            System.out.println("exitoso has inciado sesion con la cuenta de "+alumnos.get(3).getNombreAlumno());
        }else if (correo==alumnos.get(4).getMatriculaAlumno() && contrasena==alumnos.get(4).getContraseñaAlumno()){
            System.out.println("exitoso has inciado sesion con la cuenta de "+alumnos.get(4).getNombreAlumno());
        }else {
            System.out.println("datos incorectos");
        }

    }


    public void iniciarSecionTutor(){
        tutors.add(new Tutor("Diana",211475,211475));
        System.out.println("ingresa tu maticula");
        int correo = entrada.nextInt();
        System.out.println("ingresa tu contraseña");
        int contrasena = entrada.nextInt();
        if (correo==tutors.get(0).getMatriculaTutor() && contrasena==tutors.get(0).getContraseñaTutor()){
            System.out.println("exitoso has inciado sesion con la cuenta del Tutor: "+tutors.get(0).getNombreTutor());
        }else{
            System.out.println("datos incorectos");
        }
    }
}
