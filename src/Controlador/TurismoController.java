package Controlador;

import Modelo.MedioDeAlojamiento;

import java.util.ArrayList;

public class TurismoController {
    private ArrayList<MedioDeAlojamiento> alojamiento;

    public ArrayList<MedioDeAlojamiento> getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(ArrayList<MedioDeAlojamiento> alojamiento) {
        this.alojamiento = alojamiento;
    }
}
