package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (x < 5){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            x++;
            if (b == 0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
