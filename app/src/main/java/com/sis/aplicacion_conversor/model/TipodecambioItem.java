package com.sis.aplicacion_conversor.model;
import io.realm.RealmObject;
import com.sis.aplicacion_conversor.model.MonedaItem;

public class TipodecambioItem {
    private MonedaItem monedaBase;
    private MonedaItem monedaObjetivo;
    private double tasa;

    // Getter y Setter para monedaBase
    public MonedaItem getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(MonedaItem monedaBase) {
        this.monedaBase = monedaBase;
    }

    // Getter y Setter para monedaObjetivo
    public MonedaItem getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public void setMonedaObjetivo(MonedaItem monedaObjetivo) {
        this.monedaObjetivo = monedaObjetivo;
    }

    // Getter y Setter para tasa
    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }
}
