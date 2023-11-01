public class Ejercicio {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}}; // Definición de la matriz A de 2x3
        int[][] B = {{7, 8}, {9, 10}, {11, 12}}; // Definición de la matriz B de 3x2
        int m = A.length; // Número de filas de A
        int n = B[0].length; // Número de columnas de B
        int o = B.length; // Número de filas de B

        int[][] C = new int[m][n]; // Resultado de la multiplicación

        // Multiplicación de matrices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        // Imprimir el resultado
        
            System.out.println("Matriz resultante C es:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
    }
}
