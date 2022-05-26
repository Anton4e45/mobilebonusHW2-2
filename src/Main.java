public class Main {
    public static void main(String[] args) {

        double min = 100;
        double balance = 365.50;
        double payment = 85;
        int bonus;

        if (payment > min) {
            bonus = (int) (payment / min);
            System.out.println("Вам начислен бонус в размере: " + bonus + "руб.");
        } else {
            bonus = 0;
            System.out.println("Бонус не начислен");
        }

        double newBalance = balance + payment + bonus;

        System.out.println("Новый баланс: " + newBalance + "руб.");
    }
}
