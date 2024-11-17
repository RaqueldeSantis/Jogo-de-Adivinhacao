// Programa de jogo de Adivinhação

import java.util.Scanner;
import java.util.Random;

class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 50.");
        
        while (guess != numberToGuess) {
            System.out.println("Digite seu palpite:");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < numberToGuess) {
                System.out.println("O número é maior.");
            } else if (guess > numberToGuess) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número em " + attempts + " tentativas.");
            }
        }
    }
}
