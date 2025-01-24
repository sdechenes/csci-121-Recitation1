import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        Scanner scnr = new Scanner(System.in);
        //Text and Scanner for Int
        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        //Text and Scanner for double
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();
        //Text and Scanner for Character
        System.out.println("Enter character:");
        userChar = scnr.next().charAt(0);
        //Text and Scanner for String
        System.out.println("Enter string:");
        userString = scnr.next();

        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
        int convertedValue = (int)userDouble;
        System.out.println(userDouble + "cast to an integer is " + convertedValue);
    }
}