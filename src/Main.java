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
        System.out.println("Задача 2");
        int contribution = 15000;
        int moneyAccumulation = 0;
        int monthAccumulation = 1;
        while (moneyAccumulation < 2_459_000) {
            moneyAccumulation = moneyAccumulation + contribution;
            System.out.println("Месяц " + monthAccumulation + ", сумма накоплений равна " + moneyAccumulation + " рублей");
            monthAccumulation++;
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int populationOfTheCountryY = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int differenceFertilityMortality = fertility - mortality;
            for (int i = 1; i <= 10; i++) {
            populationOfTheCountryY = populationOfTheCountryY / 1000 * differenceFertilityMortality + populationOfTheCountryY;
            System.out.println("Год " + i + " численность населения составляет " + populationOfTheCountryY);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15000;
        int moneyAccumulation = 0;
        int monthAccumulation = 0;
        moneyAccumulation = moneyAccumulation + contribution;
        while (moneyAccumulation <= 12_000_000) {
            moneyAccumulation = moneyAccumulation + moneyAccumulation * 7 / 100;
            monthAccumulation++;
            System.out.println("Месяц " + monthAccumulation + ", сумма накоплений равна " + moneyAccumulation + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15000;
        int moneyAccumulation = 0;
        int monthAccumulation = 0;
        moneyAccumulation = moneyAccumulation + contribution;
        while (moneyAccumulation < 12_000_000) {
            moneyAccumulation = moneyAccumulation + moneyAccumulation * 7 / 100;
            monthAccumulation++;
            if (monthAccumulation % 6 == 0) {
                System.out.println("Месяц " + monthAccumulation + ", сумма накоплений равна " + moneyAccumulation + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15000;
        int moneyAccumulation = 0;
        int monthAccumulation = 0;
        moneyAccumulation = moneyAccumulation + contribution;
        while (monthAccumulation <= 9 * 12) {
            moneyAccumulation = moneyAccumulation + moneyAccumulation * 7 / 100;
            monthAccumulation++;
            if (monthAccumulation % 6 == 0)
                System.out.println("Месяц " + monthAccumulation + ", сумма накоплений равна " + moneyAccumulation + " рублей");
            }
        }
    public static void task7() {
        System.out.println("Задача 7");
        for (int friday = 1; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int yearBeforeCurrent = 2023 - 200;
        int yearAfterTheCurrent = 2023 + 100;
        for (int i = 0; i < yearAfterTheCurrent; i = i + 79) {
            if (i > yearBeforeCurrent) {
                System.out.println(i);
            }
        }

    }
}
