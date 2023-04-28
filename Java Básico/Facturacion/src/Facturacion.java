import java.util.ArrayList;
import java.util.Scanner;

public class Facturacion {
    public static void main(String[] args) {
        // introducir datos cliente
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce datos cliente");
        String nombre = introDatos("Nombre",entrada);
        String apellidos = introDatos("Apellidos",entrada);
        String dni = introDatos("DNI",entrada);
        String direccion = introDatos("Dirección",entrada);
        String cPostal = introDatos("Código Postal",entrada);
        String poblacion = introDatos("Población",entrada);
        String email = introDatos("Email",entrada);
        Cliente comprador = new Cliente(nombre,apellidos,dni,direccion,cPostal,poblacion,email);
        //System.out.println(comprador.datosCliente());

        // introducir los productos
        ArrayList<LineaFactura> lineas = new ArrayList<>();
        System.out.println("Introduce productos");
        int uds = 1;
        while(uds > 0) {
            uds = Integer.parseInt(introDatos("Unidades (0=salir)", entrada));
            if(uds > 0) {
                String tipo = introDatos("Producto: 1 - Taladro, 2 - Destornillador, 3 - Puntas, 4 - Brocas :", entrada);
                Catalogo producto;
                switch (tipo) {
                    case "1":
                        producto = Catalogo.TALADRO;
                        break;
                    case "2":
                        producto = Catalogo.DESTORNILLADOR;
                        break;
                    case "3":
                        producto = Catalogo.JUEGO_PUNTAS;
                        break;
                    case "4":
                        producto = Catalogo.JUEGO_BROCAS;
                        break;
                    default:
                        producto = Catalogo.TALADRO;
                }
                LineaFactura linea = new LineaFactura(uds, producto);
                lineas.add(linea);
            }
        }

        // generar factura
        Factura miFactura = new Factura(comprador,lineas);
        miFactura.imprimeFactura();
    }

    public static String introDatos(String mensaje, Scanner in){
        System.out.print(mensaje + ": ");
        return in.nextLine();
    }
}
