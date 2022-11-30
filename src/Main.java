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
        int mass = 7000;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int dayLoss1 = mass / weightLoss1;
        int dayLoss2 = mass / weightLoss2;
        System.out.println( " спортсмен скинет лишний вес за "+ dayLoss1 +" дней при похудении на "+ weightLoss1 +" грамм в сутки " );
        System.out.println( " спортсмен скинет лишний вес за "+ dayLoss2 +" дней при похудении на "+ weightLoss2 +" грамм в сутки " );
        int masha = 67760;
        int denis = 83690;
        int krist = 76230;
        int mashaSalary = ( masha / 100 * 10 ) + masha;
        int denisSalary = ( denis / 100 * 10 ) + denis;
        int kristSalary = ( krist / 100 * 10 ) + krist;
        int incomeMasha = mashaSalary * 12;
        int incomeDenis = denisSalary * 12;
        int incomeKrist = kristSalary * 12;
        int oldMasha = masha * 12;
        int oldDenis = denis * 12;
        int oldKrist = krist * 12;
        int ma = incomeMasha - oldMasha;
        int de = incomeDenis - oldDenis;
        int kr = incomeKrist - oldKrist;
        System.out.println( " маша теперь получает " + mashaSalary + " рублей. Годовой доход вырос на " + ma + " рублей ");
        System.out.println( " денис теперь получает " + denisSalary + " рублей. Годовой доход вырос на " + de + " рублей ");
        System.out.println( " кристина теперь получает " + kristSalary + " рублей. Годовой доход вырос на " + kr + " рублей ");



    }
}