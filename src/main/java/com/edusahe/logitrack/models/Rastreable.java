package com.edusahe.logitrack.models;

public interface Rastreable {
    EstadoEnvio INITIAL_STATE = EstadoEnvio.RECEPCIONADO;

    void setInitialState();
    void updateState(EstadoEnvio state);
    EstadoEnvio getState();
}
