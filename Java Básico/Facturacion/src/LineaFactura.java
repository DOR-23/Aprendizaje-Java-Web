public class LineaFactura {
    private int uds;
    private Double total;
    private Catalogo producto;

    //
    // Constructors
    //

    public LineaFactura(int uds, Catalogo producto) {
        this.uds = uds;
        this.producto = producto;
        this.total = uds * producto.getPvp();
    }

    // getters


    public int getUds() {
        return uds;
    }

    public Double getTotal() {
        return total;
    }

    public Catalogo getProducto() {
        return producto;
    }

    /**
     * @return String
     */
    public String generaLinea() {
        return uds + "\t" + producto.getNombre() + "\t" + producto.getDescripcion() + "\t" + producto.getPvp() + "\t" + total;    }


}
