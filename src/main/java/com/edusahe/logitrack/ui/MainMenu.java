package com.edusahe.logitrack.ui;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("▲▲▲▲▲▲ Bienvendido a LogiTrack ▲▲▲▲▲▲");
            System.out.println("    1.- Registrar un nuevo cliente.");
            System.out.println("    2.- Registrar un nuevo envío.");
            System.out.println("    3.- Actualizar estado de envío.");
            System.out.println("    4.- Rastrear envío.");
            System.out.println("    5.- Exportar a archivo.");
            System.out.println("    6.- Salir.");
            System.out.print("Selecciona una opción del Menú: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Opción 1 seleccionada");
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada");
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada");
                    break;
                case 4:
                    System.out.println("Opción 4 seleccionada");
                    break;
                case 5:
                    System.out.println("Opción 5 seleccionada");
                    break;
                case 6:
                    System.out.println("Gracias por utilizar LogiTrack");
                    break;
                default:
                    System.out.println("Opción Inválida");
                    break;
            }
        }while(option != 6);
    }

}
