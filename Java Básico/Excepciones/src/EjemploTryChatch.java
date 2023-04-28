public class EjemploTryChatch {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int[] numeros1 = {1,2,0,4,5};

        try {
            for (int i = 0; i <= numeros.length; i++) {
                System.out.println("numeros[" + i + "] = " + numeros[i]);
                //System.out.println("1/numeros1[" + i + "] = " + (1/numeros1[i]));
            }

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Leyendo fuera de limites");
            System.err.println("e.toString() = " + e.toString());
        }catch (ArithmeticException e){
            System.out.println("Dividiendo por cero");
            System.err.println("e.toString() = " + e.toString());
        }catch (Exception e){
            System.out.println("Se ha producido un error");
            System.err.println("e.toString() = " + e.toString());
        }finally {
            System.out.println("Proceso bajo inspección terminado");
        }


        System.out.println("resto de instrucciones del programa");
    }
}
