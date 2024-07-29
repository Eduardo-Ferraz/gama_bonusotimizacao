# Desafio de Otimização/Desempenho de Código
Dado um array de números inteiros, encontra todos os pares de números cuja soma seja igual a um valor específico.

## Código Inicial

```
public class SomaPares {
    public static void main(String[] args) {
        int[] numeros = {1, 4, 5, 2, 7, 9, -1};
        int valor_soma = 6;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == valor_soma) {
                    System.out.println("Pares: (" + numeros[i] + ", " + numeros[j] + ")");
                }
            }
        }
    }
}
```
