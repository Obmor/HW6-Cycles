public class Main {
    public static void main(String[] args) {
        System.out.println("Exrcise 1.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Exercase 2.");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Exercise 3.");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Exercise 4.");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Exercise 5.");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным.");
        }

        System.out.println();
        System.out.println("Exercise 6.");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Exercise 7.");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Exercise 8.");
        int salary = 29_000;
        for (int i = 0; i < 12; i++) {
            System.out.println("Месяц " + i + ", сумма накомлений равна " +
                    salary * i + " рублей.");
        }

        System.out.println();
        System.out.println("Exercise 9.");
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary / 100; // salary взято из задания 8.
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println();
        System.out.println("Exercise 10.");
        int multiplier = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplier + " * " + i + " = " + i * multiplier);
        }
    }
}