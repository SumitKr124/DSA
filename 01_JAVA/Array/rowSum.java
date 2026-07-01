public class rowSum{

    static void maxRowSum(int[][] arr) {

        int maxSum = Integer.MIN_VALUE;
        int rowIndex = -1;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }

        System.out.println("Maximum Row Sum = " + maxSum);
        System.out.println("Row Index = " + rowIndex);
    }

    public static void main(String[] args) {

        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        maxRowSum(arr);
    }
}