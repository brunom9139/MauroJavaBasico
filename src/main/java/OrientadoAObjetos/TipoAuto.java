package OrientadoAObjetos;

public enum TipoAuto {

    SEDAN("Sedan", "Auto mediano", 4 ),
    STATION_WAGON("Station Wagon", "Auto grande", 4),
    HATCHBACK("Hatchback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 4);


    private final String nombre;
    private final int nroPuerta;
    private final String descripcion;



    TipoAuto(String nombre, String descripcion, int nroPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nroPuerta = nroPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNroPuerta() {
        return nroPuerta;
    }
}
