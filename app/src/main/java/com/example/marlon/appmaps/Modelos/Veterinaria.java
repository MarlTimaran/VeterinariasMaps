package com.example.marlon.appmaps.Modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by marlon on 26/10/17.
 */

public class Veterinaria {
    @SerializedName("celular")
    @Expose
    private String celular;
    @SerializedName("direccion")
    @Expose
    private String direccion;

    @Expose
    private Double latitud;
    @SerializedName("longitud")
    @Expose
    private Double longitud;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("otros_contactos")
    @Expose
    private String otrosContactos;
    @SerializedName("representante")
    @Expose
    private String representante;
    @SerializedName("telefono")
    @Expose
    private String telefono;

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOtrosContactos() {
        return otrosContactos;
    }

    public void setOtrosContactos(String otrosContactos) {
        this.otrosContactos = otrosContactos;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
