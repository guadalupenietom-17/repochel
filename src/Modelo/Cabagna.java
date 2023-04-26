package Modelo;

public class Cabagna extends Hospederia{
    private boolean chimenea;
    private  Integer capacidad;

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

    @Override
    public Integer getCapacidad() {
        return capacidad;
    }

    @Override
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}
