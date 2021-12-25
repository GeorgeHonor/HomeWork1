package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
      byte numberOne = 10;
        System.out.println(numberOne);
      short numberTwo = 100;
        System.out.println(numberTwo);
      int numberThree = 1_000;
        System.out.println(numberThree);
      long numberFour = 1_000L;
        System.out.println(numberFour);
      float numberFive = 1.0f;
        System.out.println(numberFive);
      double numberSix = 10.0;
        System.out.println(numberSix);
      System.out.println("Получается " + numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix);



        float boxerOneWeight = 78.2f;
        System.out.println("Вес Рокки - " + boxerOneWeight + " кг.");
        float boxerTwoWeight = 82.7f;
        System.out.println("Вес Аполло - " + boxerTwoWeight + " кг.");
        float boxersWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Общий вес двух бойцов - " + boxersWeight + " кг.");
        float boxerDifferenceWeight = boxerTwoWeight - boxerOneWeight;
        System.out.println("Разница в весе двух бойцов - " + boxerDifferenceWeight + " кг.");



        byte oneBananasWeight = 80;
        byte numberBananas = 5;
        int totalBananasWeight = oneBananasWeight * numberBananas;
        System.out.println("Общий вес пяти бананов - " + totalBananasWeight + " гр.");
        short oneHundredMilkMililiters = 105;
        byte numberMilk = 2;
        int twoHundredMilkMililiters = oneHundredMilkMililiters * numberMilk;
        System.out.println("Общее количество молока - " + twoHundredMilkMililiters + " гр.");
        byte oneIceCreamPackage = 100;
        byte numberIceCreamPackage = 2;
        int twoIceCreamPackage = oneIceCreamPackage * numberIceCreamPackage;
        System.out.println("Вес двух брикетов мороженого - " + twoIceCreamPackage + " гр.");
        byte oneRawEgg = 70;
        byte numberRawEggs = 4;
        int fourRawEggs = oneRawEgg * numberRawEggs;
        System.out.println("Общий вес сырых яиц - " + fourRawEggs + " гр.");
        int totalIngredientsWeight = totalBananasWeight + twoHundredMilkMililiters + twoIceCreamPackage + fourRawEggs;
        System.out.println("Общий вес всех ингредиентов в граммах - " + totalIngredientsWeight + " гр.");
        double totalWeightKilos = (double) totalIngredientsWeight / 1_000;
        System.out.println("Общий вес всех ингредиентов в килограммах - " + totalWeightKilos + " кг.");




        byte loseWeightKilos = 7;
        short transfereKilosGramms = 1_000;
        int totalWeightGramms = loseWeightKilos * transfereKilosGramms;
        System.out.println("Необходимо сбросить - " + totalWeightGramms + " гр.");
        short minLoseGramm = 250;
        int numberDay1 = totalWeightGramms / minLoseGramm;
        System.out.println("Максимум дней - " + numberDay1);
        short maxLoseGramm = 500;
        int numberDay2 = totalWeightGramms / maxLoseGramm;
        System.out.println("Минимум дней - " + numberDay2);
        int numberDayAvg = (numberDay1 + numberDay2) / 2;
        System.out.println("Дней в среднем - " + numberDayAvg);





        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryCristina = 76230;
        float monthPersentRise = 0.1f;
        float monthRiseMasha = salaryMasha * monthPersentRise;
        float newSalaryMasha = salaryMasha + monthRiseMasha;
        System.out.println("Маша теперь получает - " + newSalaryMasha + " руб.");
        float monthRiseDenis = salaryDenis * monthPersentRise;
        float newSalaryDenis = salaryDenis + monthRiseDenis;
        System.out.println("Денис теперь получает - " + newSalaryDenis + " руб.");
        float monthRiseCristina = salaryCristina * monthPersentRise;
        float newSalaryCristina = salaryCristina + monthRiseCristina;
        System.out.println("Кристина теперь получает - " + newSalaryCristina + " руб.");
        float yearRiseMasha = monthRiseMasha * 12;
        System.out.println("Годовой доход Маши вырос на - " + yearRiseMasha + " руб.");
        float yearRiseDenis = monthRiseDenis * 12;
        System.out.println("Годовой доход Дениса вырос на - " + yearRiseDenis + " руб.");
        float yearRiseCristina = monthRiseCristina * 12;
        System.out.println("Годовой доход Кристины вырос на - " + yearRiseCristina + " руб.");
























    }
}
