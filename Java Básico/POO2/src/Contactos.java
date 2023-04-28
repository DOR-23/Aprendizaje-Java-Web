public enum Contactos {
    // Constantes -> Nombres compañeros
    // Attr -> nombre, email, móvil
    PEPE("José Pérez", "pepe@eoi.es", "629292929"),
    ANA("Ana María Gónzalez", "ana@eoi.es","629292930"),
    JUAN("Juan Antonio Corral","juan@eoi.es","629292931"),
    MARTA("Marta Castillo","marta@eoi.es","629292932");

    private final String nombre;
    private final String email;
    private final String movil;

    Contactos(String nombre, String email, String movil) {
        this.nombre = nombre;
        this.email = email;
        this.movil = movil;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getMovil() {
        return movil;
    }
}
