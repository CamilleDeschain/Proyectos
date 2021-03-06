package com.tw.BusquedaDinamica.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tw.BusquedaDinamica.enums.Color;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
public class Computadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String version;
    private boolean cambio;
    @Enumerated(EnumType.STRING)
    private Color color;
    @Min(0)
    private int tamanoDisco;
    @ManyToOne(optional = false)
    @JsonIgnoreProperties("computadoras")
    private Modelo modelo;

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

    public int getTamanoDisco() {
        return tamanoDisco;
    }

    public void setTamanoDisco(int tamanoDisco) {
        this.tamanoDisco = tamanoDisco;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}
