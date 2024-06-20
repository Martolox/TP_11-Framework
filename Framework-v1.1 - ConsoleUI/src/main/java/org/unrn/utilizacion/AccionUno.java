package org.unrn.utilizacion;

import org.unrn.framework.Accion;

public class AccionUno implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando AccionUno...");
    }

    @Override
    public String nombreItemMenu() {
        return "Acción 1";
    }

    @Override
    public String descripcionItemMenu() {
        return "AccionUNO (Esto es para traer los twitts de Maradona...)";
    }
}