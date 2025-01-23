public class Array_Matrix {
    public static void main(String[] args) {
        // Create and initialize the 5x5 array with values from 1 to 25
        int[][] array = new int[5][5];
        int value = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = value++;
            }
        }

        // Output-1: Print elements column-wise
        System.out.println("Output-1:");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(array[i][j] + ", ");
            }
        }
        System.out.println();

        // Output-2: Print elements in a zig-zag manner
        System.out.println("Output-2:");
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(array[i][j] + ", ");
                }
            } else {
                for (int j = 4; j >= 0; j--) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println();

        // Output-3: Print elements diagonally (by columns first)
        System.out.println("Output-3:");
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(array[j][i] + ", ");
            }
        }
        System.out.println();
    }
}