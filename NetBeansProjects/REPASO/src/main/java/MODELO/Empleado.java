/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author camper
 */
public class Empleado extends Persona {

    private double salario;
    private String username;
    private String password;

    public Empleado(double salario, String username, String password, int id, String tipo_documento, String documento, String nombre, String apellido, String correo, int edad) {
        super(id, tipo_documento, documento, nombre, apellido, correo, edad);
        //el super lo que hace es inicializar las variables de la clase, las manda a la clase persojna y me da acceso a ellas por medio de la herencia
        this.salario = salario;
        this.username = username;
        this.password = password;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString()
                + """
                Username:        %s
                Password:        %s
                Salario:         %s                 
                """.formatted(username, password, salario);
    }

}
