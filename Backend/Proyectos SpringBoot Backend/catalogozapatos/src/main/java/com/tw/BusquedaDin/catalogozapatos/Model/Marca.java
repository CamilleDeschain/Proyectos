package com.tw.BusquedaDin.catalogozapatos.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Marca {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column(unique = true)
    private String nombre;

    @OneToMany (mappedBy = "marca", fetch = FetchType.EAGER)
    private Set<Talla> tallas =new HashSet<>();


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

    public Set<Talla> getTallas() {
        return tallas;
    }

    public void setTallas(Set<Talla> tallas) {
        this.tallas = tallas;
    }
}
