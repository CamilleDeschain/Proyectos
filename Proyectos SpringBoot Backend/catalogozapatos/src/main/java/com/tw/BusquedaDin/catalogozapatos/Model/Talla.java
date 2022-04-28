package com.tw.BusquedaDin.catalogozapatos.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Talla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column
    private String talla;
    @ManyToOne(optional = false)
    private Marca marca;

    @OneToMany(mappedBy = "talla")
    private Set<Zapato> zapatos=new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Set<Zapato> getZapatos() {
        return zapatos;
    }

    public void setZapatos(Set<Zapato> zapatos) {
        this.zapatos = zapatos;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
