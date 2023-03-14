package com.fomov.Paint.by.number.generator.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "pictures")
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @JoinColumn(name = "picture_name")
    private String pictureName;
    @JoinColumn(name = "picture_image")
    private String pictureImage;
    @JoinColumn(name = "active_size")
    private int activeSize;
    @JoinColumn(name = "clean_picture")
    private boolean cleanPicture;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "palette_id")
    private Palette palette;

    public Picture() {}

    public Picture(int id, String pictureName, String pictureImage, int activeSize, boolean cleanPicture, User user, Palette palette) {
        this.id = id;
        this.pictureName = pictureName;
        this.pictureImage = pictureImage;
        this.activeSize = activeSize;
        this.cleanPicture = cleanPicture;
        this.user = user;
        this.palette = palette;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Palette getPalette() {
        return palette;
    }

    public void setPalette(Palette palette) {
        this.palette = palette;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return id == picture.id && activeSize == picture.activeSize && cleanPicture == picture.cleanPicture && Objects.equals(pictureName, picture.pictureName) && Objects.equals(pictureImage, picture.pictureImage) && Objects.equals(user, picture.user) && Objects.equals(palette, picture.palette);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pictureName, pictureImage, activeSize, cleanPicture, user, palette);
    }
}
