package myGames.rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        String[] choices = { "камень", "ножницы", "бумага" };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Добро пожаловать в игру 'Камень, ножницы, бумага'!");
        System.out.println("Выберите один из вариантов: камень, ножницы, бумага.");

        while (true) {
            System.out.print("Ваш выбор: ");
            String playerChoice = scanner.nextLine().toLowerCase();

            if (!isValidChoice(playerChoice)) {
                System.out.println("Некорректный выбор. Пожалуйста, выберите камень, ножницы или бумагу.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("Компьютер выбрал: " + computerChoice);

            int result = getResult(playerChoice, computerChoice);
            if (result == 0) {
                System.out.println("Ничья!");
            } else if (result == 1) {
                System.out.println("Вы победили!");
            } else {
                System.out.println("Вы проиграли!");
            }

            System.out.print("Хотите сыграть еще раз? (да/нет): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("да")) {
                break;
            }
        }

        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("камень") || choice.equals("ножницы") || choice.equals("бумага");
    }

    private static int getResult(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return 0; // Ничья
        }

        if (playerChoice.equals("камень")) {
            return (computerChoice.equals("ножницы")) ? 1 : -1;
        } else if (playerChoice.equals("ножницы")) {
            return (computerChoice.equals("бумага")) ? 1 : -1;
        } else {
            return (computerChoice.equals("камень")) ? 1 : -1;
        }
    }
}

