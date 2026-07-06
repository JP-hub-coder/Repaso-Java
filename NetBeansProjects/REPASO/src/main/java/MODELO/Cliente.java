/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author camper
 */
public class Cliente extends Persona{
    private double puntos;
    
    public Cliente(double puntos, int id, String tipo_documento, String documento, String nombre, String apellido, String correo, int edad){
        super(id, tipo_documento, documento, nombre, apellido, correo, edad);
        this.puntos = puntos;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return super.toString()+"""
                                Puntos:          %s
                                """.formatted(puntos);
    }
    
    
}
