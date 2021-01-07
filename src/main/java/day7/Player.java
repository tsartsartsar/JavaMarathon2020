package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player() {
        this.stamina = (int) (90 + Math.random() * 11);

        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public void run(){
        stamina--;
        if (stamina == MIN_STAMINA)
            countPlayers--;
    }

    public static void info(){
        if (countPlayers < 6)
            System.out.println("Команды неполные, на поле есть ещё " + (6 - countPlayers) + " свободных мест");
        else System.out.println("На поле нет свободных мест");
    }
}
