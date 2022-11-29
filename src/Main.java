public class Main {
    public static void main(String[] args) {
        var weightBoxer1 = 78.2;
        var weightBoxer2= 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("общий вес " + totalWeight + " кг ");
        var weightDifference = weightBoxer1 - weightBoxer2;
        System.out.println("разница в весе " + weightDifference + " кг ");
        var weightDifferences = weightBoxer2 -weightBoxer1;
        System.out.println("вес первого боксёра меньше на  " + weightDifferences + " кг ");
        var weightDifferencess = weightBoxer2 % weightBoxer1;
        System.out.println("вес первого боксёра меньше на  " + weightDifferences + " кг при использовании функции остаток от деления ");
        var workHours = 640;
        var oneWorker = 8;
        var workers = workHours / oneWorker;
        System.out.println(" всего работников в компании " + workers + " человек ");
        var workerss =  workers + 94;
        var hourss = workerss * oneWorker;
        System.out.println(" Если в компании работает " + workerss + " человек,то всего " + hourss + " часов работы может быть поделено между сотрудниками ");
    }
}