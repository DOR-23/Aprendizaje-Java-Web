public enum Carroceria {
    SEDAN("Sedán","Mediano",4),
    BERLINA("Berlina","Grande",4),
    COUPE("Coupe","Deportivo",2),
    STATION_WAGON("Familiar","Grande",5),
    SUV("SUV","Todo camino urbano",5),
    PICKUP("PickUp","Furgoneta abierta",2),
    HATCHBACK("Compacto","Aspecto deportivo",4),
    CABRIO("Cabrio","Descapotable",2);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    Carroceria(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
