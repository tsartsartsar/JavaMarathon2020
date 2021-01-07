package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] += (int) (Math.random() * 10001);
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
        int maxThree = 0;
        int indexMaxThree = 0;
        for (int i = 1; i < array.length - 1; i++) {
            int sumThree = array[i] + array[i - 1] + array[i + 1];
            if (sumThree > maxThree){
                maxThree = sumThree;
                indexMaxThree = array[i - 1];
            }
        }
        System.out.println(maxThree);
        System.out.println(indexMaxThree);
    }
}
