package String;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        charFrequency(input);
        sc.close();
    }

    static void charFrequency(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isFirstOccurrence(input, ch, i)) {
                int count = countOccurrences(input, ch);
                System.out.println(ch + " - " + count);
            }
        }
    }

    static boolean isFirstOccurrence(String str, char ch, int index) {
        for (int i = 0; i < index; i++) {
            if (str.charAt(i) == ch) {
                return false;
            }
        }
        return true;
    }

    static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}