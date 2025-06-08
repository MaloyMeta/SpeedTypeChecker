package ua.speedchecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vocabulary {

    public static List<String> basicVocabulary() {
        List<String> text = new ArrayList<>();

        text.add("Hello, world!");
        text.add("Traloleilo Tralala");
        text.add("Slava, Ukraine");
        text.add("Пока какашка!");
        text.add("Пуки насорога");
        text.add("Мышка плавает в пруду");

        return text;
    }

    public static String randomizePhrase(List<String> phrases) {
        Random rand = new Random();

        return phrases.get(rand.nextInt(phrases.size()));
    }
}
