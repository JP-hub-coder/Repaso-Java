/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cp.integrador.repaso;

import MODELO.Cliente;
import MODELO.Empleado;
import MODELO.Persona;
import VISTA.Navegacion;

/**
 *
 * @author camper
 */
public class REPASO {

    public static void main(String[] args) {
        /*
        CONTROLADOR: conecta con la base de datos, la vista con el modelo.
        VISTA: mayormente el frontend.
            
        POO:
        ABSTRACCION: 
            Aqui definimos de que manera un a clase se comportará, 
            que funciones o metodos tendrá, me preocupo solo por conocer el funcionamiento 
            y mas adelante estregaría o programaría la lógica.
        
        ENCAPSULAMIENTO: 
            public(se puede acceder desde cualquier clase o paquete), 
            protected(permite acceso a los datos en la mayoría de paquetes, pero solo en la misma clase o sus subclases), 
            private(no se puede acceder de ninguna otra clase ni paquete, para accederlo se usan los getters y setters), 
            default(se puede acceder desde cualquier 
            clase siempre y cuando esté en el mismo paquete)
        
        HERENCIA:
            todo lo que yo vaya a heredar depe implementar lo que yo implemento, la clase de la que yo quiero heredar
            debe ser una clase abstracta
        
        POLIMORFISMO:
            permite implementar un metodo de la clase madre de manera distinta para cada clase hija
        */
        
        
        
        //al persona ser una clase abstracta, no puede existir una "Persona" sino deben existir los que la expanden( en este caso empleado y cliente)
        //puedo poner Empleado o Cliente en vez de poner Persona, al tener estos los mismos atributos que Persona
        /*Empleado e1 = new Empleado(5000000, "alucard", "123", 1, "C.C", "1007", "Dracula", "PP", "alucard@gmail.com", 54);
        Cliente c1 = new Cliente(5, 1, "C.C", "1008", "David", "DM", "david@gmail.com", 28);
        
        System.out.println(e1); 
        System.out.println(c1);
        */
        
        Navegacion navegacion = new Navegacion();
        navegacion.menuPrincipal();
    }
}
