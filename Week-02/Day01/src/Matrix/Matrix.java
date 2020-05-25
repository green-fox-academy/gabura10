package Matrix;

public class Matrix {
    public static void main(String[] args) {
        int i= 4;
        int[][] matrix = {{0, 1},{0, 1}};
        for (int row = 0; row <i ; row++) {
            for (int col = 0; col <i ; col++) {
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
