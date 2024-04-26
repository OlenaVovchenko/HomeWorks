
package org.example.homework_12_04;
//Взять две строки случайных символов ,длина каждой строки от 20 до 50 символов.
//Вывести в консоль список символов которые встречаются только один раз на все две строки.


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str1 = generateRandomString();
        String str2 = generateRandomString();

        List<Character> allCharacters = new ArrayList<>();
        List<Character> uniqueCharacters = new ArrayList<>();

        for (char c : (str1 + str2).toCharArray()) {
            allCharacters.add(c);
        }

        for (Character c : allCharacters) {
            if (allCharacters.indexOf(c) == allCharacters.lastIndexOf(c)) {
                uniqueCharacters.add(c);
            }
        }

        System.out.println("Уникальные символы: " + uniqueCharacters);
    }

    private static String generateRandomString() {
        int leftLimit = 33; // код ASCII символа '!'
        int rightLimit = 126; // код ASCII символа '~'
        int targetStringLength = 20 + new Random().nextInt(31);
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}