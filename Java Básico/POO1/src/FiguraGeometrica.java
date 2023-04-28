public class FiguraGeometrica {
    // Representa polígonos regulares
    // Atributos
    String nombre;
    int nLados; // =0 -> circulo
    double lado; // o el radio si es un circulo

    // ...
    // Métodos
    // Perímetro
    public double perimetro(){
        if(nLados > 0) {
            return this.nLados * this.lado;
        }else{
            return 2 * Math.PI * lado;
        }
    }

    // Superficie
    public double superficie(){
        // si nLados = 0 -> circunferencia (PI * lado * lado)
        // si nLados = 1 o 2 -> no es un polígono
        // si nLados = 3 -> triangulo (base * altura) /2
        // si nLados = 4 -> cuadrado (lado * lado)
        // si nLados > 4 -> perimetro * apotema / 2;

        double perimetro = 0;
        double apotema = 0;
        double superficie = 0;

//        if(this.nLados == 0){
//            superficie = Math.PI * lado * lado;
//        }else if(this.nLados == 3){
//            apotema = Math.sqrt(3) / 2 * lado;
//            superficie = lado * apotema / 2;
//        }else if(this.nLados == 4){
//            superficie = lado * lado;
//        }else if(this.nLados > 4){
//            perimetro = this.nLados * this.lado;
//            apotema = this.lado / (2 * Math.tan(Math.PI/this.nLados));
//            superficie = perimetro * apotema / 2;
//        }else{ // linea/ángulo -> no superficie
//            superficie = 0;
//        }
        if(this.nLados == 0){
            superficie = Math.PI * lado * lado;
        }else if(this.nLados > 2){
            perimetro = this.nLados * this.lado;
            apotema = this.lado / (2 * Math.tan(Math.PI/this.nLados));
            superficie = perimetro * apotema / 2;
        }else{ // linea/ángulo -> no superficie
            superficie = 0;
        }
        return superficie;
    }

    // info
    public void info(){
        System.out.println( "-----------------------------------\n" +
                            "Nombre: " + this.nombre + "\n" +
                            "Número de lados = " + this.nLados + "\n" +
                            "Longitud lado = " + this.lado + "\n" +
                            "Perímetro = " + perimetro() + "\n" +
                            "Superficie = " + superficie() + "\n" +
                            "-----------------------------------\n");
    }

    // Constructor

    public FiguraGeometrica(String nombre, int nLados, double lado) {
        this.nombre = nombre;
        this.nLados = nLados;
        this.lado = lado;
    }
}
