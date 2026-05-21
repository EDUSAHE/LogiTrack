package com.edusahe.logitrack.models;


import java.util.Random;


public abstract class Envio implements Rastreable{

    private Cliente client;
    private Paquete packet;
    static int trackingNumber = 0;
    private Direccion originAddress;
    private Direccion destinationAddress;
    private EstadoEnvio shippingState;
    //Medidas estandar
    private float baseShippingRate = 65.2F;
    private float costExtraWeight = 12.0F;
    private float baseLarge = 30.0F;
    private float baseWidth = 30.0F;
    private float baseHeight = 30.0F;
    private float baseWeight = 3.0F;

    public Envio(Cliente client, Paquete packet, Direccion originAddress, Direccion destinationAddress) {
        this.client = client;
        this.packet = packet;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        setInitialState();
        trackingNumber++;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public Paquete getPacket() {
        return packet;
    }

    public void setPacket(Paquete packet) {
        this.packet = packet;
    }

    public Direccion getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(Direccion originAddress) {
        this.originAddress = originAddress;
    }

    public Direccion getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(Direccion destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public EstadoEnvio getShippingState() {
        return shippingState;
    }

    public void setShippingState(EstadoEnvio shippingState) {
        this.shippingState = shippingState;
    }

    public static int getTrackingNumber() {
        return trackingNumber;
    }

    public float getBaseShippingRate() {
        return baseShippingRate;
    }

    public void setBaseShippingRate(float baseShippingRate) {
        this.baseShippingRate = baseShippingRate;
    }

    @Override
    public void setInitialState() {
        this.shippingState = INITIAL_STATE;
    }

    @Override
    public void updateState(EstadoEnvio state) {
        this.shippingState = state;
    }

    @Override
    public EstadoEnvio getState() {
        return this.shippingState;
    }

    public float calculateShippingCost(){
        float finalCost = 0.0F;
        float finalWeight = Math.max(this.packet.calculateVolumetricWeight(), this.packet.getWeight());
        if(this.baseLarge <= this.packet.getLarge() && this.baseWidth <= this.packet.getWidth() && this.baseHeight <= this.packet.getHeight() && this.baseWeight <= this.packet.getWeight()){
            return baseShippingRate;
        }
        else{
            finalWeight = finalWeight - this.baseWeight;
            finalCost = finalCost + this.baseShippingRate;
            finalCost = finalCost + (finalWeight * this.costExtraWeight);
            return finalCost;
        }
    }
}
