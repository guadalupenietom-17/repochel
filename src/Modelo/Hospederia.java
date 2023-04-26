package Modelo;

public class Hospederia extends MedioDeAlojamiento {
    private boolean esfumador;
    private Integer capacidad;

    public boolean isEsfumador() {
        return esfumador;
    }

    public void setEsfumador(boolean esfumador) {
        this.esfumador = esfumador;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}
