package Modelo;

public class MedioDeAlojamiento {

    //Se añaden dos atributos nombre y tipo de alojamiento para poder identificar el objeto almacenado.
    private String nombre;
    private String tipoAlojamiento;
    private Integer valorbasenoche;
    private Integer cantidaddenoches;
    private DatosCliente datosdelcliente;
    private String temporada;
    //GETS AND SETS
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }
    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }
    public Integer getValorbasenoche() {
        return valorbasenoche;
    }
    public void setValorbasenoche(Integer valorbasenoche) {
        this.valorbasenoche = valorbasenoche;
    }
    public Integer getCantidaddenoches() {
        return cantidaddenoches;
    }
    public void setCantidaddenoches(Integer cantidaddenoches) {
        this.cantidaddenoches = cantidaddenoches;
    }
    public DatosCliente getDatosdelcliente() {
        return datosdelcliente;
    }
    public void setDatosdelcliente(DatosCliente datosdelcliente) {
        this.datosdelcliente = datosdelcliente;
    }
    public String getTemporada() {
        return temporada;
    }
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
}
