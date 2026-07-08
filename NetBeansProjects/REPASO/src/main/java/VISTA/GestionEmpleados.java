package VISTA;

import MODELO.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {

    private ArrayList<Empleado> empleados;

    public GestionEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    private int calcularId() {
        return !empleados.isEmpty() ? empleados.get(empleados.size() - 1).getId() + 1 : 1;
    }

    private void agregarEmpleado() {
        try {
            int id = calcularId();

            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = new Scanner(System.in).nextLine();

            System.out.println("Ingrese el apellido del empleado: ");
            String apellido = new Scanner(System.in).nextLine();

            System.out.println("Ingrese el documento del empleado: ");
            String documento = new Scanner(System.in).nextLine();

            System.out.println("Ingrese el tipo de documento: ");
            String tipoDocumento = new Scanner(System.in).nextLine();

            System.out.println("Ingrese el correo: ");
            String correo = new Scanner(System.in).nextLine();

            System.out.println("Ingrese la edad: ");
            int edad = new Scanner(System.in).nextInt();

            System.out.println("Ingrese el salario: ");
            double salario = new Scanner(System.in).nextDouble();

            System.out.println("Ingrese el username: ");
            String username = new Scanner(System.in).nextLine();

            System.out.println("Ingrese el password: ");
            String password = new Scanner(System.in).nextLine();

            Empleado e = new Empleado(salario, username, password, id, tipoDocumento, documento, nombre, apellido, correo, edad);

            empleados.add(e);

            System.out.println("=================================");
            System.out.println("Empleado agregado correctamente.");

        } catch (Exception e) {
            System.out.println("Error en los datos.");
        }
    }

    private void eliminarEmpleado(int id) {

        boolean eliminado = false;

        try {

            for (Empleado empleado : empleados) {

                if (empleado.getId() == id) {

                    int contraseña = 123456;

                    for (int i = 0; i < 3; i++) {

                        System.out.print("Ingrese la contraseña: ");
                        int input = new Scanner(System.in).nextInt();
                        new Scanner(System.in).nextLine();

                        if (input == contraseña) {

                            empleados.remove(empleado);
                            System.out.println("Empleado eliminado correctamente.");
                            eliminado = true;
                            break;

                        } else {

                            System.out.println("Contraseña incorrecta. Intentos restantes: " + (2 - i));

                        }

                    }

                }

                if (eliminado) {
                    break;
                }

            }

        } catch (Exception e) {

            System.out.println("Error de datos.");

        }

    }

    private void actualizarEmpleado(int id) {

        try {

            for (Empleado empleado : empleados) {

                if (empleado.getId() == id) {

                    System.out.println("=== ACTUALIZAR EMPLEADO ===");

                    System.out.println("Nuevo nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    if (!nombre.isEmpty()) {
                        empleado.setNombre(nombre);
                    }

                    System.out.println("Nuevo apellido: ");
                    String apellido = new Scanner(System.in).nextLine();
                    if (!apellido.isEmpty()) {
                        empleado.setApellido(apellido);
                    }

                    System.out.println("Nuevo documento: ");
                    String documento = new Scanner(System.in).nextLine();
                    if (!documento.isEmpty()) {
                        empleado.setDocumento(documento);
                    }

                    System.out.println("Nuevo tipo documento: ");
                    String tipoDocumento = new Scanner(System.in).nextLine();
                    if (!tipoDocumento.isEmpty()) {
                        empleado.setTipo_documento(tipoDocumento);
                    }

                    System.out.println("Nuevo correo: ");
                    String correo = new Scanner(System.in).nextLine();
                    if (!correo.isEmpty()) {
                        empleado.setCorreo(correo);
                    }

                    System.out.println("Nueva edad (0 para mantener): ");
                    int edad = Integer.parseInt(new Scanner(System.in).nextLine());
                    if (edad != 0) {
                        empleado.setEdad(edad);
                    }

                    System.out.println("Nuevo salario (0 para mantener): ");
                    double salario = new Scanner(System.in).nextDouble();
                    if (salario != 0) {
                        empleado.setSalario(salario);
                    }

                    System.out.println("Nuevo username: ");
                    String username = new Scanner(System.in).nextLine();
                    if (!username.isEmpty()) {
                        empleado.setUsername(username);
                    }

                    System.out.println("Nuevo password: ");
                    String password = new Scanner(System.in).nextLine();
                    if (!password.isEmpty()) {
                        empleado.setPassword(password);
                    }

                    System.out.println("Empleado actualizado correctamente.");

                }

            }

        } catch (Exception e) {

            System.out.println("Error de datos.");

        }

    }

    private void buscarEmpleado(int id) {

        try {

            for (Empleado empleado : empleados) {

                if (empleado.getId() == id) {

                    System.out.println("""
                    ===== EMPLEADO =====
                    ID: %d
                    Nombre: %s %s
                    Documento: %s
                    Tipo Documento: %s
                    Correo: %s
                    Edad: %d
                    Username: %s
                    Salario: %.2f
                    """.formatted(empleado.getId(),empleado.getNombre(),empleado.getApellido(),empleado.getDocumento(),empleado.getTipo_documento(),empleado.getCorreo(),empleado.getEdad(),empleado.getUsername(),empleado.getSalario()));
                }
            }
        } catch (Exception e) {

            System.out.println("Error de datos.");

        }

    }

    public ArrayList<Empleado> menuPrincipal() {

        int opcion = 0;

        do {

            try {

                System.out.println("""
                        ===== GESTIÓN DE EMPLEADOS =====
                        1. Agregar
                        2. Actualizar
                        3. Eliminar
                        4. Buscar
                        5. Listar
                        6. Salir
                        """);

                opcion = new Scanner(System.in).nextInt();

                switch (opcion) {

                    case 1:
                        agregarEmpleado();
                        break;

                    case 2:
                        System.out.print("ID del empleado: ");
                        actualizarEmpleado(new Scanner(System.in).nextInt());
                        break;

                    case 3:
                        System.out.print("ID del empleado: ");
                        eliminarEmpleado(new Scanner(System.in).nextInt());
                        break;

                    case 4:
                        System.out.print("ID del empleado: ");
                        buscarEmpleado(new Scanner(System.in).nextInt());
                        break;

                    case 5:

                        System.out.println("=== EMPLEADOS ===");

                        for (Empleado empleado : empleados) {
                            System.out.println(empleado);
                        }

                        break;

                    case 6:
                        System.out.println("Volviendo al menú...");
                        break;

                    default:
                        System.out.println("Opción no válida.");

                }

            } catch (Exception e) {

                System.out.println("Tipo de dato inválido.");

            }

        } while (opcion != 6);

        return empleados;

    }

}
