package Matrix;

public class Matrix {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int[][] matrix = new int[a][b];
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (row == col) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }

                }
            System.out.println();
            }

        }

    }
