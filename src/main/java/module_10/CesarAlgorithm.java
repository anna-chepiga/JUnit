package module_10;

import java.util.ArrayList;
import java.util.List;

public class CesarAlgorithm {
    private static final List<Character> alphabet = new ArrayList<>();
    private final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '\'' , '?', '-', ' ', '\n', '\t', '='};

    static {
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alphabet.add(c);
        }
        for (char c : PUNCTUATION) {
            alphabet.add(c);
        }
    }

    public static String encrypt(String text, int key) {
        int n = alphabet.size();
        key = key % n;

        StringBuilder cryptogram = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (index + key) % n;
            cryptogram.append(alphabet.get(index));
        }
        return cryptogram.toString();
    }

    public static String decrypt(String text, int key) {
        int n = alphabet.size();
        key = key % n;

        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = ((index - key) % n + n) % n;
            newText.append(alphabet.get(index));
        }
        return newText.toString();
    }
}