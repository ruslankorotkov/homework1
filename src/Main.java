public class Main {
    public static void main(String[] args) {
        int bottles2Min = 16;
        int bottlesMinute = bottles2Min / 2;
        System.out.println(bottlesMinute);
        int hourBottles = bottlesMinute * 60;
        int dayBottles = hourBottles * 24;
        int Minute20 = 20;
        int bottlesMinute20 = bottlesMinute * Minute20;
        int day3Bottles = dayBottles * 3;
        int monthBottles = dayBottles * 31;
        System.out.println("за 20 минут машина произвела бутылок " + bottlesMinute20 + " штук ");
        System.out.println("за день машина произвнла бутылок " + dayBottles + " штук ");
        System.out.println("за 3 дня машина произвнла бутылок " + day3Bottles + " штук ");
        System.out.println("за месяц машина произвнла бутылок " + monthBottles + " штук ");
        int bottlesPaint = 120;
        int whitesBox = 2;
        int brownBox = 4;
        int classBottles = whitesBox + brownBox;
        int box = bottlesPaint / classBottles;
        int whiteBottles = whitesBox * box;
        int bottlesBrown = brownBox * box;
        System.out.println(" в школе, где " + box + " классов, нужно " + whiteBottles + " банок белой краски и " + bottlesBrown + " банок коричневой краски");
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int mousse = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        System.out.println( mousse + " грамм " );


    }
}