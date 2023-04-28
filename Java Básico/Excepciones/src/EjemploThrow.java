import java.util.Scanner;

public class EjemploThrow {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce edad: ");
        int edad = entrada.nextInt();
        try {
            comprobarEdad(edad);
        }catch (Exception e){
            System.out.println("e.toString() = " + e.toString());
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("No se premite el acceso. Aviso a vigilantes");
        }
//        }catch (ArithmeticException e){
//            System.out.println("No se premite el acceso. Aviso a vigilantes");
//        }
    }

    public static void comprobarEdad(int edad){
        if(edad >= 18){
            System.out.println("Acceso autorizado");
        }else{
            //System.out.println("Acceso denegado");
            throw new ArithmeticException("Acceso denegado");
        }
    }
}
