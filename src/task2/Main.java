package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Collections.addAll(words,
                "abracadabra", "lol", "hergovano", "zingber", "china",
                "maneken","robot","leptograph","sinegar","jones",
                "lebrukon","word","literal","boy","girls"
                );
        words.sort(Comparator.comparing(String::toString));
        System.out.println(words);
    }
}
