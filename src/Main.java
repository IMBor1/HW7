public class Main {
    public static void main(String[] args) {
        //Задание № 1

        int salary = 15000;
        int total = 0;
        int count = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            count++;
            System.out.println("Месяц " + count + " сумма накоплений равна " + total + " рублей");
        }
        // Задание № 2
        int a = 1;
        while (a <= 10) {
            System.out.print(" " + a);
            a++;
        }
        System.out.println();
        for (a = 10; a >= 1; a--) {
            System.out.print(" " + a);
        }
        // Задание № 3
        int people = 12_000_000;
        int year = 0;
        for (; year <= 10; year++) {
            int birthRatePerYear = 17 * (people / 1000);
            int mortalityPerYear = 8 * (people / 1000);
            people = people + (birthRatePerYear - mortalityPerYear);
            System.out.println("Год " + year + " , численность населения составляет " + people);
        }
        // Задание № 4
        total = 15000;
        count = 0;
        while (total <= 12_000_000) {
            System.out.println(count + " месяц сумма накоплений равна " + total);
            total = total + (total * 7 / 100);
            count++;
        }
        // Задание № 5
        int deposit = 15000;
        total = 0;
        count = 0;
        while (total <= 12_000_000) {
            total = total + (total * 7 / 100);
            total = total + deposit;
            if (count % 6 == 0 && count != 0) {
                System.out.println(count + " месяц сумма накоплений равна " + total);
            }
            count++;

        }
        // Задание № 6
        deposit = 15000;
        total = 0;
        count = 0;
        int month = 9 * 12;
        for (; count < month; count++) {
            total = total + (total * 7 / 100);
            total = total + deposit;
            if (count % 6 == 0 && count != 0) {
                System.out.println(count + " месяц сумма накоплений равна " + total);
            }

        }
        // Задание № 7
        int dayFriday = 5;
        for (; dayFriday <= 31; dayFriday += 7) {
                System.out.println("Сегодня пятница, " + dayFriday +
                        " е число. Необходимо подготовить отчет");

        }
        // Задание № 8
        year = 0;
        for (; year <= 2123; year = year + 79) {
            if (year >= 1823 && year <= 2023 && (year % 79 == 0)) {
                System.out.println("комета была в " + year + " году за последние 200 лет");
            } else if (year >= 2023 && (year % 79 == 0)) {
                System.out.println("комета будет в " + year + " году в ближайшие 100 лет");
            }
        }

    }
}