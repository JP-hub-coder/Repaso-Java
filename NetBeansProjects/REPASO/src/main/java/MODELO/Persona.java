/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author camper
 */
public abstract class Persona {
    /*
    int id; default
    */
    private int id;
    private String tipo_documento;
    private String documento;
    private String nombre;
    private String apellido;
    private String correo;
    private int edad;
    private boolean Mayor_edad;

    
    public Persona(int id, String tipo_documento, String documento, String nombre, String apellido, String correo, int edad){
        this.id = id;
        this.tipo_documento = tipo_documento;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.edad = edad;
        this.Mayor_edad = edad >= 18;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public boolean isMayor_edad(){
        return Mayor_edad;
    }
    
    public String presentacion(){
        return """
               %s %s es %s""".formatted(nombre, apellido, Mayor_edad?"Mayor de edad": "Menor de edad");
                                                        //condicion? "valor si positivo" : "valor si negativo";
    }
    
    //elegir como se muestra un objeto u otra cosa, el %s es que en ese espacio va a ir una variable la cual se define despues con el .formatted
    @Override
    public String toString() {
        return """
               =====================================
               ID:              %s
               Tipo Documento:  %s
               Documento:       %s
               Nombre Completo: %s %s
               Edad:            %s
               Correo:          %s
               Tipo de edad:    %s
               """.formatted(id,tipo_documento,documento,nombre,apellido,edad,correo, presentacion());
    }
}
