package daw.rcaracuelweb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rosa
 */
public class Cliente {
  
    private String nombre;
    private String email;
    private int edad;

    public Cliente(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
        this.nombre="Paquita";
        this.email="email@email.com";
        this.edad=24;
    }
    
    
    
    
}

