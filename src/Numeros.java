import java.util.Arrays;
import java.util.List;

enum Numeros {
    UNO('1', Arrays.asList(" ","|", "|")),
    DOS('2', Arrays.asList("_", "_|", "|_", "_")),
    TRES('3', Arrays.asList("_", "_|", "_|"));

    private final char numero;
    private final List<String> col;

    private Numeros(char num, List<String> col) {
        this.numero = num;
        this.col = col;
    }

    public char getNumero() {
        return numero;
    }

    public List<String> getCol() {
        return col;
    }
}
