package com.tw.BusquedaDin.catalogozapatos.Criteria;

import com.tw.BusquedaDin.catalogozapatos.Enums.Color;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.StringFilter;

public class ZapatoCriteria {
    public static class ColorFilter extends Filter<Color>{}
    private StringFilter marca;
    private StringFilter talla;
    private StringFilter version;
    private BooleanFilter cambio;
    private ColorFilter color;
    private IntegerFilter unidadesExistentes;

    public StringFilter getMarca() {
        return marca;
    }

    public void setMarca(StringFilter marca) {
        this.marca = marca;
    }

    public StringFilter getTalla() {
        return talla;
    }

    public void setTalla(StringFilter talla) {
        this.talla = talla;
    }

    public StringFilter getVersion() {
        return version;
    }

    public void setVersion(StringFilter version) {
        this.version = version;
    }

    public BooleanFilter getCambio() {
        return cambio;
    }

    public void setCambio(BooleanFilter cambio) {
        this.cambio = cambio;
    }

    public ColorFilter getColor() {
        return color;
    }

    public void setColor(ColorFilter color) {
        this.color = color;
    }

    public IntegerFilter getUnidadesExistentes() {
        return unidadesExistentes;
    }

    public void setUnidadesExistentes(IntegerFilter unidadesExistentes) {
        this.unidadesExistentes = unidadesExistentes;
    }
}
