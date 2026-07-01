public class wavearray{

    static void waveTraversal(int[][] arr) {

        for (int j = 0; j < arr[0].length; j++) {

            if (j % 2 == 0) {
                // Top to Bottom
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Bottom to Top
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        waveTraversal(arr);
    }
}
