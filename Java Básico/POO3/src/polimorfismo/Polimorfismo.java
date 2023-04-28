package polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        miAnimal.sonido();

        // Override (sobreescritura del método)
        Perro miPerro = new Perro();
        System.out.println(miPerro.descripcion);
        miPerro.sonido();

        Cerdo miCerdo = new Cerdo();
        miCerdo.sonido();
        System.out.println(miCerdo.pelo);
        System.out.println(miCerdo.descripcion);

        miAnimal.sonido();
        System.out.println(miAnimal.descripcion);
        // System.out.println(polimorfismo.Animal.pelo); // El atributo pelo es de la subclase

        // Sobrecarga
        Dalmata miDalmata = new Dalmata();
        miDalmata.sonido();
        miDalmata.sonido(2);


    }

}

class Animal{ // Superclase = clase padre
    String descripcion = "Soy un animal";
    public void sonido(){
        System.out.println("El animal emite un sonido");
    }
}

class Perro extends Animal{ // Subclase = clase hija de polimorfismo.Animal
    Perro(){
        descripcion = "Soy un perro";
    }
    public void sonido(){ // Overrides
        System.out.println("El perro ladra");
    }
}

class Dalmata extends Perro{
    public void sonido(int repeticiones){  // Sobrecarga el método de polimorfismo.Perro
        descripcion = "Soy un Dálmata";
        System.out.println("Ladro " +  repeticiones + " veces");
    }
}

class Cerdo extends Animal{ // Subclase = clase hija de polimorfismo.Animal
    String pelo = "Rizado";
    public void sonido(){ // Overrides
        descripcion = "Soy un cerdo";
        System.out.println("El cerdo gruñe");
    }
}
