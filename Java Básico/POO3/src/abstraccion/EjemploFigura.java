package abstraccion;

public class EjemploFigura {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(2);
        miCirculo.perimetro();
        miCirculo.superficie();
        miCirculo.grafico();
        miCirculo.elimar();

        Cuadrado miCuadro = new Cuadrado(2);
        miCuadro.perimetro();
        miCuadro.superficie();
        miCuadro.grafico();
        miCuadro.elimar();

    }


}
