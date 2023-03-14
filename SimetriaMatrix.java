
public class SimetriaMatrix {
    public static void main(String[] args) {
        int[] tamanhos = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};       
        for (int n : tamanhos) {
            int[][] matriz = new int[n][n];
            
            // Preenche a matriz com valores aleatórios
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = j;
                }
            }
            
            // Verifica se a matriz é simétrica
            boolean simetrica = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                        break;
                    }
                }
                if (!simetrica) {
                    break;
                }
            }
            
            // Imprime o resultado
            if (simetrica) {
                System.out.println("Matriz " + n + "x" + n + " é simétrica.");
            } else {
                System.out.println("Matriz " + n + "x" + n + " não é simétrica.");
            }
        }
    }
}