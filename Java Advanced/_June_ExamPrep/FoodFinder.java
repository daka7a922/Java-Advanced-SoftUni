package _June_ExamPrep;

import java.util.*;

public class FoodFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String vowelsInput = scanner.nextLine();
        String constantsInput = scanner.nextLine();

        Queue<Character> vowels = new LinkedList<>();
        Stack<Character> consonants = new Stack<>();
        String[] words = {"pear", "flour", "pork", "olive"};
        Set<Character>[] wordSets = new HashSet[words.length];
        Set<String> foundWords = new LinkedHashSet<>();

        for (String str : vowelsInput.split("\\s+")) {

            vowels.add(str.charAt(0));

        }

        for (String str : constantsInput.split("\\s+")) {

            consonants.push(str.charAt(0));
        }

        for (int i = 0; i < words.length; i++) {
            wordSets[i] = new HashSet<>();
            for (char ch : words[i].toCharArray()) {
                wordSets[i].add(ch);
            }
        }

        while (!consonants.isEmpty()) {
            char vowel = vowels.poll();
            char consonant = consonants.pop();

            vowels.offer(vowel);

            for (int i = 0; i < words.length; i++) {
                if (words[i].contains(Character.toString(vowel)) || words[i].contains(Character.toString(consonant))) {
                    wordSets[i].remove(vowel);
                    wordSets[i].remove(consonant);

                    if (wordSets[i].isEmpty()) {
                        foundWords.add(words[i]);

                    }
                }
            }
        }
        System.out.println("Words found: " + foundWords.size());
        for (String word : words) {
            if (foundWords.contains(word)) {
                System.out.println(word);
            }
        }
    }
}
