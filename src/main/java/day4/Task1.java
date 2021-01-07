package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mas = scanner.nextInt();
        int[] x = new int[mas];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 11);
        }

        int nine = 0;
        int one = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 8)
                nine += 1;
            if (x[i] == 1)
                one += 1;
            if (x[i] % 2 == 0)
                even += 1;
            if (x[i] % 2 != 0)
                odd += 1;
            sum += x[i];
        }

        System.out.println("Введено число 10. Сгенерирован следующий массив: ");
        System.out.println(Arrays.toString(x));
        System.out.println("Информация о массиве. ");
        System.out.println("Длина массива: " + x.length);
        System.out.println("Количество чисел больше 8: " + nine);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
