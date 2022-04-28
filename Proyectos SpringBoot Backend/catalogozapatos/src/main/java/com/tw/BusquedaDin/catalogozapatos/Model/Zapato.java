package com.tw.BusquedaDin.catalogozapatos.Model;

import com.tw.BusquedaDin.catalogozapatos.Enums.Color;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
public class Zapato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String version;
    private boolean cambio;
    @Enumerated(EnumType.STRING)
    private Color color;
    @Min(0)
    private int unidadesExistentes;
    @ManyToOne(optional = false)
    private Talla talla;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isCambio() {
        return cambio;
    }

    public void setCambio(boolean cambio) {
        this.cambio = cambio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getUnidadesExistentes() {
        return unidadesExistentes;
    }

    public void setUnidadesExistentes(int unidadesExistentes) {
        this.unidadesExistentes = unidadesExistentes;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }
}
