package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10001);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        int countZero = 0;
        int sumZero = 0;
        for (int i : array) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            if (i % 10 == 0)
                countZero += 1;
            if (i % 10 == 0)
                sumZero += i;
        }
        System.out.println("Макс: " + max);
        System.out.println("Мин: " + min);
        System.out.println("Заканчиваются на ноль: " + countZero);
        System.out.println("Сумма зак. на ноль: " + sumZero);
    }
}
