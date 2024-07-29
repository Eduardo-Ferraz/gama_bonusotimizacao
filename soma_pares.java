import java.util.HashSet;

public class soma_pares {
    public static void main(String[] args) {
        int[] numeros = { 1, 4, 5, 2, 7, 9, -1 };
        int valor_soma = 6;

        HashSet<Integer> vistos = new HashSet<>();

        for (int num : numeros) {
            int complemento = valor_soma - num;

            if (vistos.contains(complemento)) {
                System.out.println("Pares: (" + complemento + ", " + num + ")");
            }

            vistos.add(num);
        }
    }
}