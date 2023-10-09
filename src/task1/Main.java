package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Collections.addAll(words,"aboba","lol","star","sponge","bob","patrik","squid","crab","squirrel","car",
                "boat","load","mark","nasa","nathan","artur","artem","arsen","lilia","power");
        words.sort(Comparator.comparing(String::toString));
        words = words.stream().filter(s -> s.length()>4).collect(Collectors.toList());
        System.out.println(words);
    }
}