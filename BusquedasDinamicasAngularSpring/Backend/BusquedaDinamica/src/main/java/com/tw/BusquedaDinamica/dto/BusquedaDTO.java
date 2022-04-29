package com.tw.BusquedaDinamica.dto;

public class BusquedaDTO {
    private String marca;
    private String modelo;
    private String version;
    private String cambio;
    private String color;
    private Integer tamanoDesde;
    private Integer tamanoHasta;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getTamanoDesde() {
        return tamanoDesde;
    }

    public void setTamanoDesde(Integer tamanoDesde) {
        this.tamanoDesde = tamanoDesde;
    }

    public Integer getTamanoHasta() {
        return tamanoHasta;
    }

    public void setTamanoHasta(Integer tamanoHasta) {
        this.tamanoHasta = tamanoHasta;
    }
}
