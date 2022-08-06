public class Main {
    public static void main(String[] args) {
        //Задание1
        byte cat = 100;
        short dog = 1000;
        int mouse = 10000;
        long elephant = 100l;
        double sugarWeight = 5.5;
        float saltWeight = 1.5f;
        boolean catIsAdult = cat <= 10;
        char bar = 35;
        System.out.println(bar);

        //Задание2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOffAllBoxer = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println ("Общий вес боксеров" + weightOffAllBoxer);
        System.out.println ("Разница в весе боксеров" + weightDifference);


        // Задание3
        int bananas = 5;
        int egg = 4;
        int milkWeight = 210;
        int icecreamWeight = 200;
        int bananasWeight = 80;
        int eggWeight = 70;
        int productWeight = bananas + bananasWeight + egg + eggWeight + icecreamWeight + milkWeight;
        System.out.println ("Общий вес продуктов" + productWeight + "грамм!");
        float grPerKg = 1000;
        float weightGr = 569;
        float weightKg = weightGr / grPerKg;
        System.out.println ("Общий вес"+ weightKg + "кг!");


        //Задание4
        long sportsmenWeight = 7;
        long grPerGr = 1000;
        sportsmenWeight = sportsmenWeight * grPerGr;
        int dietWeight1 = 250;
        int dietWeight2 = 500;
        long daysDieta1 = sportsmenWeight / dietWeight1;
        long daysDieta2= sportsmenWeight / dietWeight2;
        long daysOnAverage = (daysDieta1 + daysDieta2)/2;
        System.out.println ("Вес спортсмена при первой диете" + sportsmenWeight / dietWeight1 + "кг!"  );
        System.out.println ( "Вес спортсмена при второй диете" + sportsmenWeight / dietWeight2 + "кг!");
        System.out.println ("Среднее количество дней для результата похудения" + (daysDieta1 + daysDieta2)/2);


        //Задание5
        long masha = 67760;
        long denis = 83690;
        long kristina = 76230;
        long years = 12;
        long salaryYearsMasha =  masha * years;
        long salaryYearsDenis =  denis * years;
        long salaryYearsKristina = kristina * years;
        double percent = 0.10;
        double salaryIncreaseMasha =  percent * salaryYearsMasha ;
        double salaryIncreaseDenis = percent * salaryYearsDenis ;
        double salaryIncreaseKristina = percent * salaryYearsKristina ;
        double profitPercentMasha = salaryIncreaseMasha + salaryYearsMasha;
        double profitPercentDenis = salaryIncreaseDenis + salaryYearsDenis;
        double profitPercentKristina = salaryIncreaseKristina + salaryYearsKristina;
        double incomeDifferenceMasha = profitPercentMasha - salaryYearsMasha;
        double incomeDifferenceDenis = profitPercentDenis - salaryYearsDenis;
        double incomeDifferenceKristina = profitPercentKristina - salaryYearsKristina;
        System.out.println("Доход Маши за год" + masha * years + "Деньги!" );
        System.out.println("Доход Дениса за год" + denis * years + "Деньги!" );
        System.out.println("Доход Кристины за год" + kristina * years + "Деньги!" );
        System.out.println("Доход Маши  с индексацией" + percent * salaryYearsMasha + "Процент!");
        System.out.println("Доход Дениса  с индексацией" + percent * salaryYearsDenis + "Процент!");
        System.out.println("Доход Кристины  с индексацией" + percent * salaryYearsKristina + "Процент!");
        System.out.println ("Прибыль Маши за год с индексацией" + profitPercentMasha + "Деньги!" );
        System.out.println ("Прибыль Дениса за год с индексацией" + profitPercentDenis + "Деньги!" );
        System.out.println ("Прибыль Кристины за год с индексацией" + profitPercentKristina + "Деньги!" );
        System.out.println ("Разница между годовым доходом до и после повышения"+ incomeDifferenceMasha + "Деньги" );
        System.out.println ("Разница между годовым доходом до и после повышения"+ incomeDifferenceDenis + "Деньги" );
        System.out.println ("Разница между годовым доходом до и после повышения"+ incomeDifferenceKristina + "Деньги" );

    }
}