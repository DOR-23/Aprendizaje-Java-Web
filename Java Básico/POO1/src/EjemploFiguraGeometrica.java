public class EjemploFiguraGeometrica {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new FiguraGeometrica("Circulo",0,2.5);
        circulo.info();
        System.out.println("circulo.superficie() = " + circulo.superficie());

        FiguraGeometrica triangulo = new FiguraGeometrica("Triángulo", 3, 10);
        triangulo.info();

        FiguraGeometrica cuadrado = new FiguraGeometrica("Cuadrado", 4 ,10);
        cuadrado.info();
    }
}
