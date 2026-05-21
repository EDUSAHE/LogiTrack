package com.edusahe.logitrack.models;

public class EnvioUrgente extends Envio{

    public EnvioUrgente(Cliente client, Paquete packet, Direccion originAddress, Direccion destinationAddress, EstadoEnvio shippingState) {
        super(client, packet, originAddress, destinationAddress, shippingState);
    }
}
