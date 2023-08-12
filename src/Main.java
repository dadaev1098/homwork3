

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
        public static void task1 () {
            System.out.println("задача1");
            byte bakar = 127;
            System.out.println(bakar);
            short bakar2 = -32768;
            System.out.println(bakar2);
            int bakar3 = 2145678978;
            System.out.println(bakar3);
            long bakar4 = 92107867;
            System.out.println(bakar4);
            float bakar5 = 36f;
            System.out.println(bakar5);
            double bakar6 = 2.76d;
            System.out.println(bakar6);
        }
        public static void task2() {
            System.out.println("задача2");
        Float s = 27.12f;
        int b = 123;
         long c = 987678965549L;
        double g =2.786;
        short u = 569;
        byte t = 67;
        char m = 27897;
        }
    public static void task3() {
        System.out.println("задача3");
         int ludmila = 23;
         int ekatirina =30;
         int anna = 27;
         int students = ludmila + ekatirina + anna;
         int sheets = 480 / students;
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");

    }
    public static void task4() {
        System.out.println("задача4");
        int minutes = 20;
        minutes = 20 / 2;
        int woter = 16 * minutes;
        System.out.println("За 20 минут машина произвела " + woter + "  штук бутылок");
        int day = 1440;
        day = 1440 / 2;
        woter = 16 * day;
        System.out.println("За один день машина произвела " + woter + " штук бутылок");
        int days = 4320;
        days = 4320 / 2;
        woter = 16 * days;
        System.out.println("За 3 сутки  машина произвела " + woter + " штук бутылок");
        int month = 43200;
        month = 43200 / 2;
        woter = 16 * month;
        System.out.println("За 1 месяц  машина произвела " + month + " штук бутылок");

    }
    public static void task5 () {
        System.out.println("задача 5");
        int cans = 120;
        int clas = 120 / 6;
        int wheti = 2 * 20;
        int brown = 4 * 20;
        System.out.println("В школе, где " + clas + " классов, нужно " + wheti + "  банок  белой краски и " + brown + " банок коричневой краски");

    }
    public static void task6 () {
        System.out.println("задача 6");
        double bananas = 5 * 80;
        double milk = 200 * 105;
        double iceСream = 2 * 100;
        double eggs = 4 * 70;
        double cocktail =  bananas + milk + iceСream + eggs;
        double killogramm = cocktail / 1000;
        System.out.println(cocktail + " результат в граммах");
        System.out.println(killogramm + " результат в килограммах");


    }
    public static void task7 () {
        System.out.println("задача 7");
        double athlete = 7;
        double gram = 7 / 0.400;
        System.out.println("понадобиться " + gram + " дней");

    }
    public static void task8 () {
        int mashaSalary =  67760;
        int denisSalary = 83690;
        int crestinaSalary = 76230;

        double indexPercent = 1.1;
        double newMashaSalary = mashaSalary * indexPercent;
        double newDenisSalary = denisSalary * indexPercent;
        double newCrestinaSalary = crestinaSalary * indexPercent;

        double annualMashaSalary = 12 * mashaSalary;
        double newAnnualMashaSalary = 12 * newMashaSalary;

        double annualDenisSalary = 12 * denisSalary;
        double newAnnualDenisSalary = 12 * newDenisSalary;

        double annualCrestinaSalary = 12 * crestinaSalary;
        double newAnnualCrestinaSalary = 12 * newCrestinaSalary;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + (newAnnualMashaSalary - annualMashaSalary) + " рублей ");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + (newAnnualDenisSalary - annualDenisSalary)+ " рублей");
        System.out.println("Кристина теперь получает " + newCrestinaSalary + "рублей. Годовой доход вырос на " + (newAnnualCrestinaSalary - annualCrestinaSalary) + " рублей");

    }

}



