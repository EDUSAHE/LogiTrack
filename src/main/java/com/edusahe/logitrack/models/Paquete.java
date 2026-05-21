package com.edusahe.logitrack.models;

public class Paquete {
    private float large;
    private float width;
    private float height;
    private float declaredValue;
    private float weight;
    private final int VOLUMETRIC_DIVISOR = 5000;

    public Paquete() {}

    public Paquete(float large, float width, float height, float declaredValue, float weight) {
        this.large = large;
        this.width = width;
        this.height = height;
        this.declaredValue = declaredValue;
        this.weight = weight;
    }

    public float getLarge() {
        return large;
    }

    public void setLarge(float large) {
        this.large = large;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(float declaredValue) {
        this.declaredValue = declaredValue;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getVolumetricDivisor() {
        return VOLUMETRIC_DIVISOR;
    }

    public float calculateVolumetricWeight(){
        return (this.large * this.weight * this.width)/VOLUMETRIC_DIVISOR;
    }
}
