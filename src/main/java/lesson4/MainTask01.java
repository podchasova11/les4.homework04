package lesson4;

import java.util.HashMap;

public class MainTask01 {

    public static void main(String[] args) {

        String[] wordsArray = {"Podchasova", "Car", "Dog", "Cat", "Human", "Mila", "Cat", "Dog", "Cat"};
        HashMap<String, Integer> words = new HashMap<>();


        for (int i = 0; i < wordsArray.length; i++) {

            if (words.containsKey(wordsArray[i])) {
                words.put(wordsArray[i], words.get(wordsArray[i]) + 1);
            } else
            {
                words.put(wordsArray[i], 1);
            }
        }
        System.out.println("Список уникальных слов: " + words);
    }
}
