import java.util.Arrays;

public class EjemploEnumerador {
    public static void main(String[] args) {
        Color miColor = Color.ROJO;
        System.out.println("miColor = " + miColor);
        System.out.println("------------------------------");
        
        // Recorrer enumerador
        //System.out.println("Arrays.toString(Color.values()) = " + Arrays.toString(Color.values()));
        for(Color unColor:Color.values()){
            System.out.println("unColor = " + unColor);
        }
        System.out.println("------------------------------");

        // Control de flujo o toma de decisiones
        // if
        //miColor = Color.VERDE;
        if(miColor == Color.AZUL){
            System.out.println("El color es Azul");
        } else if (miColor == Color.VERDE) {
            System.out.println("El color es Verde");
        }else{
            System.out.println("El color no es Verde ni Azul");
        }
        System.out.println("------------------------------");
        // switch - notación estandar
        switch(miColor){
            case AZUL:
                System.out.println("El color es Azul");
                break;
            case VERDE:
                System.out.println("El color es Verde");
                break;
            case ROJO:
                System.out.println("El color es Rojo");

            case BLANCO:
                System.out.println("El color es Blanco");
                break;
            default:
                System.out.println("El color ni es Blanco, no es Verde, ni es Azul");
        }
        System.out.println("------------------------------");
        // switch -> notación funcional
        switch (miColor){
            case AZUL -> {
                System.out.println("El color es Azul");
                System.out.println("El cielo es azul");
            }
            case VERDE -> {
                System.out.println("El color es Azul");
            }
            case ROJO -> System.out.println("El color es Rojo");

            case BLANCO -> {
                System.out.println("El color es Blanco");
            }
            default -> {
                System.out.println("El color ni es Blanco, no es Verde, ni es Azul");
            }
        }
        System.out.println("------------------------------");
    }
}
