import java.util.List;

public class ImpresoraLCD {
    private final  char[] arr_num;

    public ImpresoraLCD(String num) {
        this.arr_num = num.toCharArray();
    }

    public void ImprimirNumeros() {
        for (int i=0; i<=2; i++) { // Itero en las 3 filas
            for (int j=0; j<=arr_num.length-1; j++) { // Itero sobre cada letra
                // Busco en el enum numeros su lista:
                for (Numeros n : Numeros.values()) {
                    if (n.getNumero() == arr_num[j]) {
                        // Imprimo el caracter en formato LCD
                        ImprimirFil(n.getCol(), i);
                    }
                }
                System.out.print("````");
            }
            System.out.println(""); // Nueva linea
        }
    }

    public void ImprimirFil(List<String> num, int fil) {
        System.out.print(num.get(fil));
    }
}
