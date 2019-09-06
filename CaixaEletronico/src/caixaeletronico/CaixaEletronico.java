package caixaeletronico;

public class CaixaEletronico {

    public static void main(String[] args) {
        int valor = 10;
        int[] notas = new int[]{2, 5, 10, 20, 50, 100};

        int qtNotas = notas.length - 1; // Quantidade de notas: 6
        for (int i = qtNotas; i >= 0; i--) {
            if (valor % notas[i] == 0) {
                System.out.println(valor / notas[i] +
                        " x " + notas[i]);
            }
//            if (notas[i] <= valor) {
//                notasUsadas[i] = notas[i];
//            }
        }

    }

}
