package com.edusahe.logitrack.models;

import java.util.Random;

public class Envio {

    private int idEnvio;
    private int idCliente;
    private float weight;
    private final String TRACKING_GUIDE;

    public Envio(int idEnvio, int idCliente, float weight){
        this.idEnvio = idEnvio;
        this.idCliente = idCliente;
        this.weight = weight;
        TRACKING_GUIDE = trackingGuideGenerator();
    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getTrackingGuide() {
        return TRACKING_GUIDE;
    }

    private String trackingGuideGenerator(){
        Random rand = new Random();
        int min = 100000000;
        int max = 999999999;
        char letra1 = (char) (rand.nextInt(26) + 'A');
        char letra2 = (char) (rand.nextInt(26) + 'A');
        int randnum = rand.nextInt((max - min) + 1) + min;
        return randnum + "" + letra1 + "" + letra2;
    }
}
