package lesson01.appStructureVar2.front.menu;

import java.util.Scanner;

public class UserInput {

    public int userInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public double userDouble(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double userDouble = scanner.nextDouble();
        return userDouble;
    }

    public String userText(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String userText = scanner.nextLine();
        return userText;
    }
}
