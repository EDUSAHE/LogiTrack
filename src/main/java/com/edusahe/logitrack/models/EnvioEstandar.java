package com.edusahe.logitrack.models;

public class EnvioEstandar extends Envio{

    public EnvioEstandar(Cliente client, Paquete packet, Direccion originAddress, Direccion destinationAddress, EstadoEnvio shippingState) {
        super(client, packet, originAddress, destinationAddress, shippingState);
    }
}
