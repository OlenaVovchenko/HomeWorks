package org.example.homeWork_20_03;
import java.util.HashMap;
import java.util.Map;
// 2) Постройте частотный словарь букв русского (или английского) алфавита (количество различных букв,
// которые встречаются в тексте);


public class FrequencyDictionary {

    public static void main(String[] args) {
        String text = "Простите за задержку с домашним заданием";
        Map<Character, Integer> frequencyDictionary = buildFrequencyDictionary(text);

        for (Map.Entry<Character, Integer> entry : frequencyDictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<Character, Integer> buildFrequencyDictionary(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        text = text.toLowerCase();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
            }
        }

        return frequencyMap;
    }
}
