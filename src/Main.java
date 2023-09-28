public class Main {
    public static void main(String[] args) {
        int check = 100;
        int refill = 1299;
        int finalScor = 0;
        int kolvobonus = 0;
        if (refill >= 1000) {
            finalScor = refill / 100 + check + refill;
            kolvobonus = refill / 100;
        } else {
            finalScor = refill + check;
            kolvobonus = 0;
        }

        System.out.println("Итоговый счёт = " + finalScor);
        System.out.println("Количество бонусных рублей = " + kolvobonus);
    }
}