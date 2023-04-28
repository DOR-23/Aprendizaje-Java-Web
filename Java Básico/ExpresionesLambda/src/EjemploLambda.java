import java.util.ArrayList;
import java.util.function.Consumer;


public class EjemploLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(0);

        ArrayList<Integer> numeros1 = new ArrayList<>();
        numeros1.add(4);
        numeros1.add(5);
        numeros1.add(1);
        numeros1.add(3);
        numeros1.add(10);
        
        // sin lambda
        for(Integer n:numeros){
            System.out.println("n = " + n);
        }
        System.out.println("-------------------------");

        // con lambda
        numeros.forEach((n)-> System.out.println("n = " + n));
        System.out.println("-------------------------");

        // bloque con lambda
        numeros.forEach((valor) -> {
            if(valor == 0){
                System.out.println("Es el 0");
            }else {
                valor *=2;
            }
            System.out.println("valor = " + valor);
        });
        System.out.println("-------------------------");

        // Asignar lambda a variable tipo Interface
        Consumer numerar = (n) -> System.out.println("n = " + n);
        numeros.forEach(numerar);
        System.out.println("-------------------------");
        numeros1.forEach(numerar);
        
        // InterfaceString
        InterfaceStrings interrogacion = (s) -> "¿" + s + "?";
        System.out.println("interrogacion.ejecuta(\"Cómo estás\") = " + interrogacion.ejecuta("Cómo estás"));

        // InterfaceNumeros
        InterfaceNumeros suma = (a,b) -> a + b;
        System.out.println("suma.ejecuta(3,8) = " + suma.ejecuta(3,8));

        InterfaceNumeros multiplica = (a,b) -> a * b;
        System.out.println("multiplica.ejecuta(3,8) = " + multiplica.ejecuta(3,8));
    }
}
