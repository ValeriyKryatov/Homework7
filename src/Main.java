public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        //task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
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
        int a = 10;
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationOfTheCountryY = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int fertilityInYear = populationOfTheCountryY * fertility / 1000;
        int mortalityInYear = populationOfTheCountryY * mortality / 1000;
        int year = 0;
        while (year < 10) {
            year++;
            populationOfTheCountryY = populationOfTheCountryY + fertilityInYear - mortalityInYear;
            System.out.println("Год " + year + " численность населения составляет " + populationOfTheCountryY);
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
        int yearAccumulation = 0;
        int monthAccumulation = 0;
        moneyAccumulation = moneyAccumulation + contribution;
        while (yearAccumulation < 9) {
            moneyAccumulation = moneyAccumulation + moneyAccumulation * 7 / 100;
            monthAccumulation++;
            if (monthAccumulation % 12 == 0)
                yearAccumulation++;
            if (monthAccumulation % 6 == 0)
                System.out.println("Месяц " + monthAccumulation + ", сумма накоплений равна " + moneyAccumulation + " рублей");
            }
        }
    }
