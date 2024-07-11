package org.example;

public class Estudiante {
    String nombre;
    String cedula;
    int edad;
    String direccion;
    String telefono;
    String correo;

    public Estudiante(String nombre, String cedula, int edad, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    //metodos

    @Override
    public String toString() {
        return "nombre='" + nombre + '\n' +
                "cedula='" + cedula + '\n' +
                "edad=" + edad + '\n' +
                "direccion='" + direccion + '\n' +
                "telefono='" + telefono + '\n' +
                "Correo='" + correo + '\n';
    }
}
