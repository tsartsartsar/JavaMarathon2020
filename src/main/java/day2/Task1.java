package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stage = Integer.parseInt(scanner.nextLine());
        if ((stage >= 1) && (stage <= 4))
            System.out.println("Малоэтажный дом");
        else if ((stage >= 5) && (stage <= 8))
            System.out.println("Среднеэтажный дом");
        else if (stage >= 9)
            System.out.println("Многоэтажный дом");
        else
            System.out.println("Ошибка ввода");
    }
}
