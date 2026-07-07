/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VISTA;

import MODELO.Cliente;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author camper
 */
public class GestionarClientes {

    private ArrayList<Cliente> clientes;

    private int calcularId() {
        //obtiene el ultimo ID y le suma uno
        /* 
        Datos de clientes:
        
        cliente 0:
        id = 1
        cliente 1:
        id = 3,
        cliente 2:
        id = 4
         */
        return !clientes.isEmpty() ? clientes.get(clientes.size() - 1).getId() + 1 : 1;
    }

    private void agregarcliente() {
        try {
            int id = calcularId();
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = new Scanner(System.in).nextLine();
            System.out.println("Ingrese el apellido del cliente: ");
            String apellido = new Scanner(System.in).nextLine();
            System.out.println("Ingrese el documento del cliente: ");
            String documento = new Scanner(System.in).nextLine();
            System.out.println("Ingrese el tipo de documento del cliente: ");
            String tipoDocumento = new Scanner(System.in).nextLine();
            System.out.println("Ingrese el correo del cliente: ");
            String correo = new Scanner(System.in).nextLine();
            System.out.println("Ingrese la edad del cliente: ");
            int edad = new Scanner(System.in).nextInt();
            System.out.println("Ingrese los puntos del cliente: ");
            double puntos = new Scanner(System.in).nextDouble();
            Cliente c = new Cliente(puntos, id, tipoDocumento, documento, nombre, apellido, correo, edad);
            clientes.add(c);
            System.out.println("=======================");
            System.out.println("El cliente ha sido agregado con exito");
        } catch (Exception e) {
            System.out.println("Operacion cancelada, Error de datos");
        }
    }

    public GestionarClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    private void eliminarCliente(int id) {
        try {
            for (Cliente cliente : clientes) {
                if (cliente.getId() == id) {
                    int contraseña = 123456;
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Introduce la contraseña: ");
                        int inputContra = new Scanner(System.in).nextInt();

                        if (inputContra == contraseña) { 
                            clientes.remove(id);
                            System.out.println("Cliente eliminado con éxito");
                            break;
                        } else {
                            System.out.println("ÑEH, está mal. Intentos restantes: " + (2 - i));
                        }
                    }

                }
            }
        } catch (Exception e) {
            System.out.println("Error de datos");
        }
    }

    private void actualizarCliente(int id) {
        try {
            for (Cliente cliente : clientes) {
                if (cliente.getId() == id) {
                    System.out.println("Actualizacion de datos");
                    System.out.println("Si no quiere actualizar cierto dato, déjelo en blanco");
                    System.out.println("Ingrese el nuevo nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    cliente.setNombre(nombre);

                    System.out.println("Ingrese el nuevo apelldio: ");
                    String apellido = new Scanner(System.in).nextLine();
                    cliente.setApellido(apellido);

                    System.out.println("Ingrese el nuevo documento: ");
                    String documento = new Scanner(System.in).nextLine();
                    cliente.setDocumento(documento);

                    System.out.println("Ingrese el nuevo tipo de documento: ");
                    String tipoDocumento = new Scanner(System.in).nextLine();
                    cliente.setTipo_documento(tipoDocumento);

                    System.out.println("Ingrese el nuevo correo: ");
                    String correo = new Scanner(System.in).nextLine();
                    cliente.setCorreo(correo);

                    System.out.println("Ingrese la nueva edad: ");
                    int edad = new Scanner(System.in).nextInt();
                    cliente.setEdad(edad);

                    System.out.println("Ingrese los nuevos puntos: ");
                    double puntos = new Scanner(System.in).nextDouble();
                    cliente.setPuntos(puntos);
                }
            }
        } catch (Exception e) {
            System.out.println("Error de datos");
        }
    }

    private void buscarCliente(int id) {
        try {
            for (Cliente cliente : clientes) {
                if (cliente.getId() == id) {
                    System.out.println("=== Cliente Encontrado \nID: " + id + "\nNombre: " + cliente.getNombre() + " " + cliente.getApellido() + "\nEdad: " + cliente.getEdad() + "\nDocumento: " + cliente.getDocumento() + "\nTipo de documento: " + cliente.getTipo_documento() + "\nCorreo: " + cliente.getCorreo() + "\nPuntos: " + cliente.getPuntos());
                }
            }
        } catch (Exception e) {
        }
    }

    public ArrayList<Cliente> MenuPrincipal() {
        int opcion = 0;
        do {
            try {
                System.out.println("""
                               ===== BIENVENIDO =====
                               1. Agregar
                               2. Actualizar
                               3. Eliminar
                               4. Buscar
                               5. Listar
                               6. SALIR
                               """);
                opcion = new Scanner(System.in).nextInt();
                switch (opcion) {
                    case 1:
                        agregarcliente();
                        break;
                    case 2:
                        System.out.println("Ingrese el id del cliente a actualizar: ");
                        int id = new Scanner(System.in).nextInt();
                        actualizarCliente(id);
                        break;
                    case 3:
                        System.out.println("Ingrese el id del cliente a eliminar: ");
                        int id_dlt = new Scanner(System.in).nextInt();
                        eliminarCliente(id_dlt);
                        break;
                    case 4:
                        System.out.println("Ingrese el id del cliente a buscar: ");
                        int id_find = new Scanner(System.in).nextInt();
                        buscarCliente(id_find);
                        break;
                    case 5:
                        System.out.println("CLIENTES: ");
                        for (int i = 0; i < clientes.size(); i++) {
                            System.out.println(clientes.get(i));
                        }
                        break;
                    case 6:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("No encontrado");
                        ;
                }
            } catch (Exception e) {
                System.out.println("Error, tipo de dato no valido");
            }
        } while (opcion != 6);
        return clientes;
    }
}
