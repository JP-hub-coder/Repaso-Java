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
    
    private int calcularId(){
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
        return !clientes.isEmpty()?clientes.get(clientes.size()-1).getId()+1 : 1;
    }
    
    private void agregarcliente(){
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
        } catch (Exception e) {
            System.out.println("Operacion cancelada, Error de datos");
        }
    }
    
    public GestionarClientes(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }
    
    public ArrayList<Cliente> MenuPrincipal(){
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
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        System.out.println("CLIENTES: ");
                        for(int i = 0; i < clientes.size(); i++){
                            System.out.println(clientes.get(i));
                        }
                        break;
                    case 6:
                        
                        break;
                    default:
                        System.out.println("No encontrado");;
                }
            } catch (Exception e) {
                System.out.println("Error, tipo de dato no valido");
            }
        } while (opcion != 6);
        return clientes;
    }
}
