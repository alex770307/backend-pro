package homework01.appStructureVar2.front.menu;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public int userInt(String message) {
        int userInput =0;
//        while (true) {
            System.out.println(message);
            try {
                userInput = scanner.nextInt();
                if (userInput <= 0) {
                    System.out.println("Error: Task ID must be a positive number.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
            }return userInput;
//        }
    }

    public double userDouble(String message) {
        double userDouble =0;
        System.out.println(message);
        try {
            userDouble = scanner.nextDouble();
        }catch (NumberFormatException e){
            System.out.println("Error: Invalid input. Please enter a valid decimal number.");
        }
        return userDouble;
    }

    public String userText(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String userText = scanner.nextLine();
        return userText;
    }
}
