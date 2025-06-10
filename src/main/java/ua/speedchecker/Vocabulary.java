package ua.speedchecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vocabulary {

    public static List<String> basicVocabulary() {
        List<String> text = new ArrayList<>();

        // English phrases
        text.add("Hello, world!");
        text.add("How are you?");
        text.add("It's a sunny day.");
        text.add("Java is cool.");
        text.add("Typing is fun!");
        text.add("Let's go!");

        // Ukrainian phrases
        text.add("Слава Україні!");
        text.add("Героям слава!");
        text.add("Доброго вечора, ми з України!");
        text.add("Паляниця — це не просто хліб.");
        text.add("Килим на підлозі красивий.");
        text.add("Мишка їсть сирок.");

        // Funny / absurd
        text.add("Пока какашка!");
        text.add("Пуки насорога.");
        text.add("Трактор в полі дир-дир-дир.");
        text.add("Мишка плавает в пруду.");
        text.add("Тролейбус втік з депо!");
        text.add("Слон на велосипеді.");

        // Mixed / tricky
        text.add("A-B-C, easy as 1-2-3!");
        text.add("Was it a car or a cat I saw?");
        text.add("No lemon, no melon.");
        text.add("1234567890");
        text.add("!@#$%^&*()");
        text.add("Паляниця, борщ і вареники!");

        return text;
    }

    public static String randomizePhrase(List<String> phrases) {
        Random rand = new Random();
        return phrases.get(rand.nextInt(phrases.size()));
    }
}
