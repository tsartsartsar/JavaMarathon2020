package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(71777123));  //4
    }

    public static int count7(int number) {
        if (number == 0)
            return 0;
        else if (number % 10 == 7)
            return 1 + count7(number / 10);
        else
            return  count7(number / 10);
    }
}
