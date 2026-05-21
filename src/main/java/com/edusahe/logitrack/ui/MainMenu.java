package com.edusahe.logitrack.ui;

import com.edusahe.logitrack.models.Cliente;
import com.edusahe.logitrack.models.Direccion;
import com.edusahe.logitrack.models.Paquete;

import java.util.Scanner;
import java.util.TreeSet;

public class MainMenu {

    // Lo declaramos como variable de instancia, privada y final.
    // 'final' asegura que no podamos reemplazar este Scanner por error.
    private final Scanner sc = new Scanner(System.in);
    private TreeSet<Cliente> clients = new TreeSet<>();


    public void mainMenuStart() {
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
                    Cliente newClient = new Cliente();
                    System.out.println("Ingrese los datos del cliente");
                    System.out.println("Nombre: ");
                    newClient.setName(sc.next());
                    System.out.println("Apellido(s): ");
                    newClient.setLastName(sc.next());
                    System.out.println("Correo Electrónico: ");
                    newClient.setEmail(sc.next());
                    System.out.println("Teléfono: ");
                    newClient.setPhoneNumber(sc.next());
                    System.out.println("Dirección: ");
                    newClient.setAddress(sc.next());
                    clients.add(newClient);
                    System.out.println("Registro de Cliente Exitoso.");
                    break;
                case 2:
                    if(!clients.isEmpty()) {
                        int i = 0;
                        int numclient;
                        System.out.println("En caso de no encontrar el cliente primero tendrá que crearlo.");
                        System.out.println("        LISTA DE CLIENTES       ");
                        for (Cliente c : clients) {
                            System.out.println("    " + i++ + ". " + c.getFullName());
                        }
                        System.out.println("    0. SALIR AL MENÚ PRINCIPAL");
                        System.out.println("Ingrese el número de cliente(0 PARA REGRESAR): ");
                        numclient = sc.nextInt();
                        if (numclient != 0) {
                            for (Cliente c : clients) {}

                        }
                        else {
                            break;
                        }

                    }
                    int shippingtype;
                    System.out.println("Seleccione el tipo de envio a realizar");
                    System.out.println("    1.- Envio Estándar.");
                    System.out.println("    2.- Envio Urgente.");
                    System.out.println("    3.- Envio Pesado.");
                    shippingtype = sc.nextInt();
                    switch (shippingtype) {
                        case 1:
                            Direccion originAddress = new Direccion();
                            Direccion destinationAddress = new Direccion();
                            Paquete newPackage = new Paquete();
                            System.out.println("Ingrese los datos de la dirección Origen");
                            System.out.println("País: ");
                            originAddress.setCountry(sc.next());
                            System.out.println("Estado: ");
                            originAddress.setState(sc.next());
                            System.out.println("Ciudad: ");
                            originAddress.setCity(sc.next());
                            System.out.println("Colonia: ");
                            originAddress.setNeighborhood(sc.next());
                            System.out.println("Código Postal: ");
                            originAddress.setPostcode(sc.next());
                            System.out.println("Calle: ");
                            originAddress.setStreet(sc.next());
                            System.out.println("Número Exterior: ");
                            originAddress.setHouseNumber(sc.next());
                            System.out.print("Número Interior(Opcional): ");
                            originAddress.setUnitNumber(sc.next());
                            System.out.println("Referencia: ");
                            originAddress.setLandmark(sc.next());
                            System.out.println("Nombre completo: ");
                            originAddress.setFullName(sc.next());
                            System.out.println("Número Telefónico: ");
                            originAddress.setPhoneNumber(sc.next());
                            System.out.println("---------------------------------------------------");
                            System.out.println("Ingrese los datos de la dirección Destino");
                            System.out.println("País: ");
                            destinationAddress.setCountry(sc.next());
                            System.out.println("Estado: ");
                            destinationAddress.setState(sc.next());
                            System.out.println("Ciudad: ");
                            destinationAddress.setCity(sc.next());
                            System.out.println("Colonia: ");
                            destinationAddress.setNeighborhood(sc.next());
                            System.out.println("Código Postal: ");
                            destinationAddress.setPostcode(sc.next());
                            System.out.println("Calle: ");
                            destinationAddress.setStreet(sc.next());
                            System.out.println("Número Exterior: ");
                            destinationAddress.setHouseNumber(sc.next());
                            System.out.print("Número Interior(Opcional): ");
                            destinationAddress.setUnitNumber(sc.next());
                            System.out.println("Referencia: ");
                            destinationAddress.setLandmark(sc.next());
                            System.out.println("Nombre completo: ");
                            destinationAddress.setFullName(sc.next());
                            System.out.println("Número Telefónico: ");
                            destinationAddress.setPhoneNumber(sc.next());
                            System.out.println("---------------------------------------------------");
                            System.out.println("Ingrese los datos del paquete");
                            System.out.println("Largo(cm): ");
                            newPackage.setLarge(sc.nextFloat());
                            System.out.println("Ancho(cm): ");
                            newPackage.setWidth(sc.nextFloat());
                            System.out.println("Alto(cm): ");
                            newPackage.setHeight(sc.nextFloat());
                            System.out.println("Peso(kg): ");
                            newPackage.setWeight(sc.nextFloat());
                            System.out.println("Valor declarado: ");
                            newPackage.setDeclaredValue(sc.nextFloat());







                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
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
