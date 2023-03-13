package com.fomov.Paint.by.number.generator.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Palette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private PaletteColor paletteColorId;

    public Palette() {}

    public Palette(int id, PaletteColor paletteColorId) {
        this.id = id;
        this.paletteColorId = paletteColorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PaletteColor getPaletteColorId() {
        return paletteColorId;
    }

    public void setPaletteColorId(PaletteColor paletteColorId) {
        this.paletteColorId = paletteColorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palette palette = (Palette) o;
        return id == palette.id && Objects.equals(paletteColorId, palette.paletteColorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paletteColorId);
    }
}
