public class Main {
    public static void main(String[] args) {
        char c = 33;
        char d = '!';
        System.out.println(c + " = " + d);
        int bitBox1 = 5;
        byte bitBox2 = 6;
        short bitBox3 = 7;
        long bitBox4 = 8;
        float bitBox5 = (float) 0.345;
        double bitBox6 = 3445.98;
        System.out.println( " значение переменной bitBox1 c типом int равно " + bitBox1);
        System.out.println( " значение переменной bitBox2 c типом  byte равно " + bitBox2);
        System.out.println( " значение переменной bitBox3 c типом  short равно " + bitBox3);
        System.out.println( " значение переменной bitBox4 c типом  long равно " + bitBox4);
        System.out.println( " значение переменной bitBox5 c типом  float равно " + bitBox5);
        System.out.println( " значение переменной bitBox6 c типом  double равно " + bitBox6);
        float table = (float) 27.12;
        System.out.println( table );
        double tableLand = 987678965549D;
        System.out.println( tableLand );
        byte planet = 2;
        System.out.println( planet );
        int map = 786;
        System.out.println( map );
        int age = 22;
        boolean isAdult = age <=18;
        System.out.println( isAdult );
        short kitchen = 569;
        System.out.println( kitchen );
        short flag = -159;
        System.out.println( flag );
        long billboard = 27897;
        System.out.println( billboard );
        int chart = 67;
        System.out.println( chart );
        short students1 = 23;
        short students2 = 27;
        short students3 = 30;
        short papersAll = 480;
        long papersStudent = papersAll / ( students1 + students2 + students3 );
        System.out.println(" на каждого ученика расчитано " + papersStudent + " листов бумаги" );

    }
}