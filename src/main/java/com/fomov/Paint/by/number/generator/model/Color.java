package com.fomov.Paint.by.number.generator.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "colors")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int red;
    private int green;
    private int blue;

    public Color() {}

    public Color(int id, int red, int green, int blue) {
        this.id = id;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color that = (Color) o;
        return id == that.id && red == that.red && green == that.green && blue == that.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, red, green, blue);
    }
}
