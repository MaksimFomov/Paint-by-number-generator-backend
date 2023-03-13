package com.fomov.Paint.by.number.generator.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pictureName;
    private String pictureImage;
    private int activeSize;
    private boolean cleanPicture;
    @ManyToOne
    private User userId;
    @OneToOne
    private Palette paletteId;

    public Picture() {}

    public Picture(int id, String pictureName, String pictureImage, int activeSize, boolean cleanPicture, User userId, Palette paletteId) {
        this.id = id;
        this.pictureName = pictureName;
        this.pictureImage = pictureImage;
        this.activeSize = activeSize;
        this.cleanPicture = cleanPicture;
        this.userId = userId;
        this.paletteId = paletteId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPictureImage() {
        return pictureImage;
    }

    public void setPictureImage(String pictureImage) {
        this.pictureImage = pictureImage;
    }

    public int getActiveSize() {
        return activeSize;
    }

    public void setActiveSize(int activeSize) {
        this.activeSize = activeSize;
    }

    public boolean isCleanPicture() {
        return cleanPicture;
    }

    public void setCleanPicture(boolean cleanPicture) {
        this.cleanPicture = cleanPicture;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Palette getPaletteId() {
        return paletteId;
    }

    public void setPaletteId(Palette paletteId) {
        this.paletteId = paletteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return id == picture.id && activeSize == picture.activeSize && cleanPicture == picture.cleanPicture && Objects.equals(pictureName, picture.pictureName) && Objects.equals(pictureImage, picture.pictureImage) && Objects.equals(userId, picture.userId) && Objects.equals(paletteId, picture.paletteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pictureName, pictureImage, activeSize, cleanPicture, userId, paletteId);
    }
}
