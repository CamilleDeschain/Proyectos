package com.tw.BusquedaDinamica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column(unique = true)
    private String nombre;
    @ManyToOne(optional = false)
    @JsonIgnoreProperties("modelos")
    private Marca marca;
    @OneToMany(mappedBy = "modelo")
    @JsonIgnore
    private Set<Computadora> computadoras = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Set<Computadora> getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(Set<Computadora> computadoras) {
        this.computadoras = computadoras;
    }
}
