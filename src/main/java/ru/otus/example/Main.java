package ru.otus.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = new Integer[5];
        System.out.print(Arrays.toString(intArray));

        BackPack backPack = new BackPack();
        System.out.println(backPack.size());
        backPack.print();

        backPack.put("Ball");
        System.out.println(backPack.size());
        backPack.print();

        backPack.put("Shoes");
        System.out.println(backPack.size());
        backPack.print();

        backPack.put("Pen");
        backPack.put("Books");
        backPack.put("bottle");

        backPack.print();

        backPack.put("magazines");

        backPack.get("Pen");
        backPack.print();

        backPack.put("magazines");
        backPack.print();


    }

    public static void magicField(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = {
                "apple", "plum", "kiwi", "pear", "pineapple", "grape", "strawberry", "cherry",
                "banana"
        };

        int randomIndex = ((int)(Math.random() * fruits.length));
        String wordToGuess = fruits[randomIndex];

        boolean win = false;

        char[] result = new char[wordToGuess.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = '*';
        }

        while (!win) {
            System.out.println("Введите букву ");
            char letter = scanner.next().charAt(0);

            char[] toGuess = wordToGuess.toCharArray();
            System.out.print("Слово :");
            for (int i = 0; i < toGuess.length; i++) {
                if (toGuess[i] == letter) {
                    result[i] = letter;
                }
            }

            win = true;
            for (int i = 0; i < result.length; i++) {
                if (result[i] == '*') {
                    win = false;
                }
                System.out.print(result[i]);
            }
            System.out.println();

        }

        System.out.print("Слово :" + wordToGuess + " C Победой!");


    }

    public static void fruitGame(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = {
                "apple", "plum", "kiwi", "pear", "pineapple", "grape", "strawberry", "cherry",
                "banana"
        };

        int randomIndex = ((int)(Math.random() * fruits.length));
        String wordToGuess = fruits[randomIndex];

        boolean win = false;

        System.out.println("Угадайте фрукт");

        while (!win) {
            String inputFruit = scanner.next();

            if (wordToGuess.equals(inputFruit)) {
                System.out.println("Угадали");
                win = true;
            } else {
                char[] toGuess = wordToGuess.toCharArray();
                char[] input = inputFruit.toCharArray();
                for (int i = 0; i < toGuess.length && i < input.length; i++) {
                    if (toGuess[i] == input[i]) {
                        System.out.print(input[i]);
                    } else {
                        System.out.print("*");
                    }
                }
                for (int i = 0; i < (10 - toGuess.length); i ++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }




    }













    public static void max(String[] args) {
        int[] array = { 1, 2, 5, -18, 4, 1, 2};

        int min = array[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);

    }
}