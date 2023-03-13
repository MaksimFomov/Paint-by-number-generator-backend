package com.fomov.Paint.by.number.generator.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private User userId;
    @OneToOne
    private Picture pictureId;
    private int price;
    private int quantity;
    private int size;

    public ShoppingCart() {}

    public ShoppingCart(int id, User userId, Picture pictureId, int price, int quantity, int size) {
        this.id = id;
        this.userId = userId;
        this.pictureId = pictureId;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Picture getPictureId() {
        return pictureId;
    }

    public void setPictureId(Picture pictureId) {
        this.pictureId = pictureId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return id == that.id && price == that.price && quantity == that.quantity && size == that.size && Objects.equals(userId, that.userId) && Objects.equals(pictureId, that.pictureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, pictureId, price, quantity, size);
    }
}
