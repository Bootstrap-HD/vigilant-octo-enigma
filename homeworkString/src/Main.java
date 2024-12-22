import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        homeTasksManager();
    }

    public static void homeTasksManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a homework number: ");

        switch (scanner.nextInt()) {
            case 1: homework1(); homeTasksManager();
            case 2: homework2(); homeTasksManager();
            case 3: homework3(); homeTasksManager();
            default: homeTasksManager();
        }
    }

    public static void homework1() {

    }

    public static void homework2() {
        System.out.println("I'm Vitar Iliukovich i'm bartender.");
        byte valueByte = 4;
        short valueShort = 15;
        int valueInt = 43;
        long  valueLong = 100;
        boolean valueHappy = true;
        float valueFractionalOne = 1.1f; // число с плавающей запетой
        double valueFractionalTwo = 2.22;
        char valueSymbol = 3333;
        System.out.println("Byte: " + valueByte + ", short: " + valueShort +", int: " + valueInt
                + ", long; " + valueLong + ", boolean: " + valueHappy + ", float: " + valueFractionalOne
                + ", double: " + valueFractionalTwo + ", char: " + valueSymbol);
        Scanner scanner = new Scanner(System.in);
        System.out.print("ввести текст: ");
        String textOne = scanner.nextLine();
        System.out.println("length: " + textOne.length());
        System.out.println("Is empty: " + textOne.isEmpty());
        System.out.println("Input symbol number: ");
        int symbolNumber = scanner.nextInt();
        System.out.println("Symbol: " + textOne.charAt(symbolNumber));
        System.out.print("Input another text: ");
        scanner.nextLine();
        String textTwo = scanner.nextLine();
        System.out.println("The text and symbols is the same: " + textOne.equals(textTwo));
        System.out.println("The text is the same: " + textOne.equalsIgnoreCase(textTwo));
        System.out.print("Input beginnin of the first text: ");
        String beginning = scanner.nextLine();
        System.out.println("The first text start with " + beginning + ":" + textOne.startsWith(beginning) );

        System.out.print("Input ends of the first text: ");
        String ends = scanner.nextLine();
        System.out.println("The first text ends with " + ends + ":" + textOne.endsWith(ends) );
        System.out.print("Input text: ");
        String textContains = scanner.nextLine();
        System.out.println("The first text conteins " + textContains + ":" + textOne.contains(textContains));
        System.out.print("Input replacement text:");
        String replacementText = scanner.nextLine();
        System.out.print("Input text for replacement:");
        String
                textForReplacement = scanner.nextLine();
        System.out.println("First text with replacement: " + textOne.replace(replacementText, textForReplacement));
        System.out.println("First text lowercase: " + textOne.toLowerCase());

        System.out.println(String.format("I remind you: First text - %s, Char - %s.", textOne, valueSymbol));

        StringBuffer manyText = new StringBuffer("One");
        manyText.append(" Two");
        manyText.append(" Three");
        System.out.println(manyText);

    }

    public static void homework3() {
       tasksManager();
    }

    public static void tasksManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter a task number: ");

        switch (scanner.nextInt()) {
            case 1: {
                System.out.println();
                task1();
                tasksManager();
            }
            case 2: {
                System.out.println();
                task2();
                tasksManager();
            }
            case 3: {
                System.out.println();
                task3();
                tasksManager();
            }
            case 4: {
                System.out.println();
                task4();
                tasksManager();
            }
            default: tasksManager();
        }
    }

    public static void task1() {
        System.out.print("Please enter yor score: ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        // proverka
        while (score < 0 || score > 100)
        {
            System.out.print("Enter the correct score: ");
            score = scanner.nextInt();
        }

        if (score >= 90)
        {
            System.out.println("your grade is A");

        } else  if (score >= 80) {
            System.out.println("Your grade is B!");
        } else if (score >= 70) {
            System.out.println("Your grade is C!");

        } else if (score >= 60) {
            System.out.println("Yoer grade is D!");
        }  else if (score >= 50) {
            System.out.println("Yoer grade is E!");
        } else System.out.println("Yoer grade is F!");
    }

    public static void task2() {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        while (!userInput.equalsIgnoreCase("Exit")) {
            System.out.print("Please enter something:");
            userInput = scanner.nextLine();
        }
        System.out.println("You've entered: " + userInput);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= Math.abs(x); i++) {
            sum += i;
        }
        System.out.printf("The sum of all number from 0 to %d is %d", x, x >= 0 ? sum : -sum);
        System.out.println();
    }

    public static void task4() {
        int channel;
        String[] array = new String[]{"1 - Форсик", "2 - Хант"};
        do {
            System.out.println("Ввeдите номер канала(0 - выход ): ");
            Scanner scanner = new Scanner(System.in);
            channel = scanner.nextInt();

            switch (channel) {
                case 0 -> System.out.println("Выход");
                case 1 -> System.out.println(array[0]);
                case 2 -> System.out.println(array[1]);
                default -> System.out.println("Такого канала не существует");
            }
        } while (channel != 0);
    }
}