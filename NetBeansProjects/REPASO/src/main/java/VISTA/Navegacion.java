/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VISTA;
import MODELO.Cliente;
import MODELO.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Navegacion {
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Empleado> empleados = new ArrayList();

    public void menuPrincipal() {
        int opcion = 0;
        do {
            try {
                System.out.println("""
                               ===== BIENVENIDO =====
                               1. Gestionar Cliente
                               2. Gestionar Empleado
                               3. SALIR
                               """);
                opcion = new Scanner(System.in).nextInt();
                switch (opcion) {
                    case 1:
                        GestionarClientes cliente = new GestionarClientes(clientes);
                        cliente.MenuPrincipal();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        System.out.println("Gracias por usar el sistema");
                        break;
                    default:
                        System.out.println("Opcion no encontrada");;
                }
            } catch (Exception e) {
                System.out.println("Error, tipo de dato no valido");
            }
        } while (opcion != 3);

    }
}
