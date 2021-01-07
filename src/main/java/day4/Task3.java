package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 51);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= maxSum){
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println("Макс. сумма в строке " + maxSumIndex);
    }
}
