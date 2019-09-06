package caixaeletronico;

public class CaixaEletronico {

    public static void main(String[] args) {
        int valor = 12;
        int[] notas = new int[]{2, 5, 10, 20, 50, 100};

        int qtNotas = notas.length - 1; // Quantidade de notas: 6
        for (int i = qtNotas; i >= 0; i--) {
            if (valor >= notas[i]) {
                int notaAtual = valor / notas[i];
                int resto = valor % notas[i];
                System.out.println(valor / notas[i]
                        + " x " + notas[i]);
                if (resto > 0) {
                    for (int j = i - 1; j >= 0; j--) {
                        if (notas[j] <= resto) {
                            notaAtual = resto / notas[j];
                            System.out.println(notaAtual + " x " + notas[j]);
                            
                        }

                    }
                }
                System.out.println("--------------");
            }
        }

    }

}
