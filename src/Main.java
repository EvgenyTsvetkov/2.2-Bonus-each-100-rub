public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int amount = 1500;
        int bonus;

        if (amount >= 1000) {
            bonus = amount / 100;
            System.out.println(" Сумма поплнения " + amount  + " Бонус за пополнение " + bonus + " Баланс " + (balance+amount+bonus));
        } else {
            bonus = 0;
            System.out.println("В бонусной акции участвуют пополнения счета только от 1000 рублей");
        }

    }
}