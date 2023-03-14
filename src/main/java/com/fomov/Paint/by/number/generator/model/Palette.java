package com.fomov.Paint.by.number.generator.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "palette")
public class Palette {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    @JoinColumn(name = "color_id")
    private Color color;

    public Palette() {}

    public Palette(int id, Color color) {
        this.id = id;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palette palette = (Palette) o;
        return id == palette.id && Objects.equals(color, palette.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color);
    }
}
