public class Main {

    static boolean search(int[][] arr, int target, int rows, int cols) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int rows = arr.length;
        int cols = arr[0].length;
        int target = 50;

        boolean ans = search(arr, target, rows, cols);

        System.out.println(ans);
    }
}