package com.sis.aplicacion_conversor.model;

import io.realm.RealmObject;

public class MonedaItem extends RealmObject {
    private String nombre;
    private String pais;
    private String simbolo;
    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para pais
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Getter y Setter para simbolo
    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}

