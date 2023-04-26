package com.miguel.david.grupo.parkingmanagerdemo.user.domain;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDao {
    @Email(message = "El formato del correo no es valido")
    @NotBlank(message = "No puede estar vacio")
    private String email;
    @NotBlank(message = "No puede estar vacio")
    private String nombre;
    @NotBlank(message = "No puede estar vacio")
    private String apellido1;
    private String apellido2;
    private Rol rol;
    public UserDao(){
        this("","","","",null);
    }
    public UserDao(String email, String nombre, String apellido1, String apellido2, Rol rol) {
        this.email = email;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.rol = rol;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public Rol getRole() {
        return rol;
    }
    public void setRole(Rol role) {
        this.rol = rol;
    }
}