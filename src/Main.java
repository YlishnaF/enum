
public class Main {
    public static void main(String[] args) {

        Week day = Week.Sunday;


        int x = day.ordinal();
        if (x == 5 || x == 6) {
            System.out.println("Поздравляю, сегодня выходной!");
        } else {
                System.out.println("До выходных осталось продержаться " + (5 - x) * 24 + " часов");
        }

    }
}

