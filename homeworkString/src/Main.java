import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("I'm Vitor Iliukovich i'm bartender.");
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
        String textForReplacement = scanner.nextLine();
        System.out.println("First text with replacement: " + textOne.replace(replacementText, textForReplacement));
        System.out.println("First text lowercase: " + textOne.toLowerCase());

        System.out.println(String.format("I remind you: First text - %s, Char - %s.", textOne, valueSymbol));

        StringBuffer manyText = new StringBuffer("One");
        manyText.append(" Two");
        manyText.append(" Three");
        System.out.println(manyText);







    }
}