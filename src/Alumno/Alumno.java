package Alumno;

import java.util.UUID;

public class Alumno {
    String nombre;
    String edad;
    String telefono;
    String identidad;
    String email;
    String sexo;

    UUID id;

    public String getId() {
        return id.toString();
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Alumno(String nombre, String edad, String telefono, String identidad, String email, String sexo, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.identidad = identidad;
        this.email = email;
        this.sexo = sexo;
        this.id = id != null ? UUID.fromString(id) : UUID.randomUUID();
    }
}
