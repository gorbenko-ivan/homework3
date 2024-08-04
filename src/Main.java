public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 129;
        int c = 32768;
        long d = 2000000000;
        float e = 3.7F;
        double f = 1.1234567890;
        System.out.println("Значение переменной a с типом byte = " + a);
        System.out.println("Значение переменной b с типом short =" + b);
        System.out.println("Значение переменной c с типом int =" + c);
        System.out.println("Значение переменной d с типом long =" + d);
        System.out.println("Значение переменной e с типом float =" + e);
        System.out.println("Значение переменной f с типом double =" + f);

        float a1 = 27.12f;
        long b1 = 987678965549L;
        float c1 = 2.786f;
        short d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte g1 = 67;

        byte lyudmilaPLeadsStudents = 23;
        byte annaSLeadsStudents = 27;
        byte ekaterinaALeadsStudents = 30;
        short boughtSheetsPaper = 480;
        int sheetsForEachStudent = boughtSheetsPaper / (lyudmilaPLeadsStudents + annaSLeadsStudents + ekaterinaALeadsStudents);
        System.out.println("На каждого ученика расчитано " + sheetsForEachStudent + " листов бумаги");

        byte productivityBottlesPer2Minute = 16;
        int productivityBottlesPerMinute = productivityBottlesPer2Minute / 2;
        int productivityBottlesPer20Minute = productivityBottlesPerMinute * 20;
        int productivityBottlesPerDay = productivityBottlesPer20Minute * 3;
        int productivityBottlesPer3Day = productivityBottlesPerDay * 3;
        int productivityBottlesPerMonth = productivityBottlesPerDay * 30;
        System.out.println("за 20 минут машина произвела " + productivityBottlesPer20Minute + " штук бутылок");
        System.out.println("за 1 день машина произвела " + productivityBottlesPerDay + " штук бутылок");
        System.out.println("за 3 дня машина произвела " + productivityBottlesPer3Day + " штук бутылок");
        System.out.println("за 1 месяц машина произвела " + productivityBottlesPerMonth + " штук бутылок");

        byte paintIsNeededToRenovateTheSchool = 120;
        byte oneClassUsesWhitePaint = 2;
        byte oneClassUsesBrownPaint = 4;
        int usedPerClass = paintIsNeededToRenovateTheSchool / (oneClassUsesWhitePaint + oneClassUsesBrownPaint);
        int purchasedWhitePaint = usedPerClass * oneClassUsesWhitePaint;
        int purchasedBrownPaint = usedPerClass * oneClassUsesBrownPaint;
        System.out.println("в школе,где " + usedPerClass + " классов,нужно " + purchasedWhitePaint + " банок белой краски и " + purchasedBrownPaint + " банок коричневой краски ");

        float gramsInKg = 1000;
        byte weight1Banana = 80;
        byte weight100MlMilk = 105;
        byte weight1BriquetteIceCream = 100;
        byte weight1Egg = 70;
        byte quantityBananas = 5;
        byte quantity100MlMilk = 2;
        byte quantityBriquetteIceCream = 2;
        byte quantityEgg = 4;
        int cocktailWeightInGrams = (weight1Banana * quantityBananas) + (weight100MlMilk * quantity100MlMilk) + (weight1BriquetteIceCream * quantityBriquetteIceCream) + (weight1Egg * quantityEgg);
        float cocktailWeightInKg = cocktailWeightInGrams / gramsInKg;
        System.out.println("вес коктеля в граммах " + cocktailWeightInGrams);
        System.out.println("вес коктеля в киллограммах " + cocktailWeightInKg);

        byte needToResetKg = 7;
        int needToResetGram = needToResetKg * 1000;
        short minLoseWeightDay = 250;
        short maxLoseWeightDay = 500;
        int numberOfDaysToLoseWeight250Grams = needToResetGram / minLoseWeightDay;
        int numberOfDaysToLoseWeight500Grams = needToResetGram / maxLoseWeightDay;
        int averageDaysToLoseWeight = needToResetGram / ((minLoseWeightDay + maxLoseWeightDay) / 2);
        System.out.println(numberOfDaysToLoseWeight250Grams + " дней потребуеться если похудеть по 250 грамм");
        System.out.println(numberOfDaysToLoseWeight500Grams + " дней потребуеться если похудеть по 500 грамм");
        System.out.println(averageDaysToLoseWeight + " дней потребуеться в среднем для похудения");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        int persent = 10;
        float newSalaryMultipleir = 1 + (persent / 100f);
        float salaryNewMash = salaryMasha * newSalaryMultipleir;
        float salaryNewDenis = salaryDenis * newSalaryMultipleir;
        float salaryNewChristina = salaryDenis * newSalaryMultipleir;
        float mashaTotalSalaryDiff = (salaryNewMash - salaryMasha) * 12;
        float denisTotalSalaryDiff = (salaryNewDenis - salaryDenis) * 12;
        float christinaTotalSalaryDiff = (salaryNewChristina - salaryChristina) * 12;
        System.out.println("Маша теперь получает " + salaryNewMash + " рублей. Годовой доход вырос на " + mashaTotalSalaryDiff + " рублей");
        System.out.println("Денис теперь получает " + salaryNewDenis + " рублей. Годовой доход вырос на " + denisTotalSalaryDiff + " рублей");
        System.out.println("Кристина теперь получает " + salaryNewChristina + " рублей. Годовой доход вырос на " + christinaTotalSalaryDiff + " рублей");
    }
}