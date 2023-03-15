package com.fomov.Paint.by.number.generator.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "picture_id")
    private Picture picture;
    private int price;
    private int quantity;
    private int size;

    public Cart() {}

    public Cart(int id, User user, Picture picture, int price, int quantity, int size) {
        this.id = id;
        this.user = user;
        this.picture = picture;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
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
        Cart cart = (Cart) o;
        return id == cart.id && price == cart.price && quantity == cart.quantity && size == cart.size && Objects.equals(user, cart.user) && Objects.equals(picture, cart.picture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, picture, price, quantity, size);
    }
}
