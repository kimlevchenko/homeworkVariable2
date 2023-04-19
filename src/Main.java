public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte b = 1;
        short s = 100;
        int i = 1000;
        long l = 1000000L;
        float f = 1.5f;
        double d = 1.75;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float f = 27.12f;
        long l = 987678965549L;
        float f2 = 2.786f;
        short s = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b = 67;
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f2 с типом float равно " + f2);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной s2 с типом short равно " + s2);
        System.out.println("Значение переменной s3 с типом short равно " + s3);
        System.out.println("Значение переменной b с типом byte равно " + b);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int ludmilaPavlovnaStudents = 23;
        int annaSergeevnaStudents = 27;
        int ekaterinaAndreevnaStudents = 30;
        int totalPapers = 480;
        int totalStudents = ludmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents;
        int papersToEach = totalPapers / totalStudents;
        System.out.println("На каждого ученика рассчитано " + papersToEach + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int bottlesIn2Min = 16;
        int worksTime = 2;
        int machinePerformanceIn1Min = bottlesIn2Min / worksTime;
        int time20Min = 20;
        int time1Day = 60 * 24;
        int time3Days = 60 * 24 * 3;
        int time1Month = 60 * 24 * 30;
        int machinePerformanceIn20Min = machinePerformanceIn1Min * time20Min;
        int machinePerformanceIn1Day = machinePerformanceIn1Min * time1Day;
        int machinePerformanceIn3Days = machinePerformanceIn1Min * time3Days;
        int machinePerformanceIn1Month = machinePerformanceIn1Min * time1Month;
        System.out.println("За 20 минут машина произвела " + machinePerformanceIn20Min + " штук бутылок");
        System.out.println("За 1 день машина произвела " + machinePerformanceIn1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machinePerformanceIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + machinePerformanceIn1Month + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int totalPaintPot = 120;
        int whitePaintPotFor1Classroom = 2;
        int brownPaintPotFor1Classroom = 4;
        int totalPaintPotFor1Classroom = whitePaintPotFor1Classroom + brownPaintPotFor1Classroom;
        int totalClassroom = totalPaintPot / totalPaintPotFor1Classroom;
        int totalWhitePaintPotForScool = whitePaintPotFor1Classroom * totalClassroom;
        int totalBrownPaintPotForScool = brownPaintPotFor1Classroom * totalClassroom;
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalWhitePaintPotForScool + " банок белой краски и " + totalBrownPaintPotForScool + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        int weight1Banana = 80;
        int weight100MlMilk = 105;
        int weight1IceCream = 100;
        int weight1Egg = 70;
        int totalWeightBananas = bananas * weight1Banana;
        int totalWeightMilk = milk / 100 * weight100MlMilk;
        int totalWeightIceCream = iceCream * weight1IceCream;
        int totalWeightEggs = eggs * weight1Egg;
        int totalWeightGr = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        float totalWeightKg = totalWeightGr * 0.001f;
        System.out.println("Общий вес завтрака спортсмена " + totalWeightGr + "гр" + " или " + totalWeightKg + "кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weightKg = 7;
        int weightGr = weightKg * 1000;
        int minWeightLoss = 250;
        int maxWeightLoss = 500;
        int minDays = weightGr / minWeightLoss;
        int maxDays = weightGr / maxWeightLoss;
        int mediumWeightLoss = (minWeightLoss + maxWeightLoss) / 2;
        double mediumDays = (double) weightGr / mediumWeightLoss;
        System.out.println("Если спортсмен будет терять вес по 250гр в день, ему потребуется " + minDays + " дней");
        System.out.println("Если спортсмен будет терять вес по 500гр в день, ему потребуется " + maxDays + " дней");
        System.out.println("Чтобы добиться результата, спортсмену потребуется в среднем " + Math.round(mediumDays) + " дней");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float growthSalaruInMonth = 0.1f;
        int newSalaryMasha = (int) (salaryMasha * growthSalaruInMonth + salaryMasha);
        int newSalaryDenis = (int) (salaryDenis * growthSalaruInMonth + salaryDenis);
        int newSalaryKristina = (int) (salaryKristina * growthSalaruInMonth + salaryKristina);
        int diffSalaryMashaInYear = (newSalaryMasha - salaryMasha) * 12;
        int diffSalaryDenisInYear = (newSalaryDenis - salaryDenis) * 12;
        int diffSalaryKristinaInYear = (newSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + diffSalaryMashaInYear + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + diffSalaryDenisInYear + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + diffSalaryKristinaInYear + " рублей");
    }
}