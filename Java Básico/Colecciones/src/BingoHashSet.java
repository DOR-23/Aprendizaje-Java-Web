import java.util.HashSet;

public class BingoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> partida = new HashSet<>();
        // generar numero en bucle
        int n = 78;
        if(partida.add(n)){
            System.out.println("1 n = " + n);
        }
        n = 78;
        if(partida.add(n)){
            System.out.println("2 n = " + n);
        }




    }
}
