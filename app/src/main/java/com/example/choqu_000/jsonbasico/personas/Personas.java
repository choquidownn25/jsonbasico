package com.example.choqu_000.jsonbasico.personas;

/**
 * Created by choqu_000 on 13/06/2015.
 */
public class Personas {

    //Atributos
    private String nombre;
    private String dni;
    private String telefono;
    private String  email;

    //Constructor
    public Personas(){}

    //Encasulamiento de Datos o Propiedad
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
