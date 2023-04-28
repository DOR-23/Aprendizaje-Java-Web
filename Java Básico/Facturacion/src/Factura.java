import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Factura {
    private Cliente comprador;
    private String numFactura;
    private String fecha;
    private ArrayList<LineaFactura> items;
    private Double totalFactura;

    //
    // Constructors
    //

    public Factura(Cliente comprador, ArrayList<LineaFactura> items) {
        this.comprador = comprador;
        this.numFactura = generaNumFra();
        this.fecha = generaFecha();
        this.items = items;
        this.totalFactura = calculaTotal();
    }


    //
    // Methods
    //



    //
    // Other methods
    //


    public Double calculaTotal() {
        double suma = 0;
        for(LineaFactura lin:items){
            suma += lin.getTotal();
        }
        return suma;
    }


    public String generaNumFra() {
        Random num = new Random();
        return num.nextInt(100000) + "/2023";
    }


    public String generaFecha() {
        //DateFormat formato = new SimpleDateFormat("dd - MMM - yyyy");
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(new Date());
        return fecha;
    }


    public void imprimeFactura() {
        // cabecera
        System.out.println("Ferretería Martínez \nPonzano, 17\n28001 - Madrid\nCIF: B84/56662544\n\n");
        // cliente
        System.out.println(comprador.datosCliente());
        // nº fra
        System.out.println("Nº factura: " + numFactura + "\n");
        // fecha
        System.out.println("Fecha: " + fecha + "\n");
        // los items
        System.out.println("Uds\tNombre\t\tDescripción\t\tUnitario\tTotal");
        for(LineaFactura lin:items){
            System.out.println(lin.generaLinea());
        }
        // total
        System.out.println("Total fatura: " + totalFactura);
        System.out.println("IVA 21%: " + (totalFactura * 0.21));
        System.out.println("Total a pagar: " + (totalFactura + 1.21));
    }


}
