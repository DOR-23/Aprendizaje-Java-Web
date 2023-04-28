package abstraccion;

public class Cuadrado extends FiguraGeometrica{
    float lado;


    @Override
    public void perimetro() {
        System.out.println("perímetro = " + 4 * lado);
    }

    @Override
    public void superficie() {
        System.out.println("sueprficie = " + lado * lado);
    }

    @Override
    public void grafico() {
        System.out.println("Dibujo el cuadrado");
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
}
