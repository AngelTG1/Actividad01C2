package com.upchiapas.Actividad01.Pages;

import java.util.Scanner;

public class visualizarMenu {
    Scanner entrada = new Scanner(System.in);
    public void visualizarMenu(){
        iniciarSesion ini = new iniciarSesion();
        inscribirAlumnos inscribir = new inscribirAlumnos();
        int opcion;
        do {
            System.out.println("--------------------------------");
            System.out.println("1.quieres iniciar secion como alumno");
            System.out.println("2.inicar secion como tutor");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    ini.iniciarSecionAlumno();
                    do {
                        System.out.println("1. agregar materia");
                        System.out.println("2. ver las materia");
                        System.out.println("4. salir");
                        opcion=entrada.nextInt();
                        switch (opcion){
                            case 1:
                                inscribir.registrarMaterias();
                                break;
                            case 2:
                                inscribir.verMaterias();
                                break;
                            case 3:
                                break;
                        }

                    }while (opcion!=4);
                    if(opcion==4){
                        inscribir.cargaManual();
                    }

                    break;
                case 2:
                    ini.iniciarSecionTutor();
                    System.out.println("mantenimiento aun no esta...");
                    break;
            }


        }while (opcion!=3);

    }
}
