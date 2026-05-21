package com.edusahe.logitrack.models;

public class EnvioPesado extends Envio implements Asegurable{

    public EnvioPesado(Cliente client, Paquete packet, Direccion originAddress, Direccion destinationAddress, EstadoEnvio shippingState) {
        super(client, packet, originAddress, destinationAddress, shippingState);
    }

    @Override
    public float calculateShippingInsurance(float declaredValue) {
        return 0;
    }
}
