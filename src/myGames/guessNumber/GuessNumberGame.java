package myGames.guessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
        public static void main(String[] args) {
            Random random = new Random();
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Добро пожаловать в игру 'Угадай число'!");
            System.out.println("Я загадал число от 1 до 100. Попробуйте угадать!");

            while (true) {
                System.out.print("Введите ваше предположение: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Поздравляю! Вы угадали число!");
                    System.out.println("Количество попыток: " + attempts);
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Загаданное число больше.");
                } else {
                    System.out.println("Загаданное число меньше.");
                }
            }

            scanner.close();
        }
    }


