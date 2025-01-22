
package String;/*package String;

import java.util.Scanner;

public class PrintWordWithMoreThanThreeLetter {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take the whole sentence as input
        String sentence = sc.nextLine();
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Loop through the words and print only those with length greater than 3
        for (String word : words) {
            if (word.length() > 3) {
                System.out.print(word + " ");
            }
        }
    }
}*/

import java.util.Scanner;

public class PrintWordWithMoreThanThreeLetter
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take the whole sentence as input
        String sentence = sc.nextLine();
        
        // Variables to hold the current word and processed sentence
        StringBuilder word = new StringBuilder();
        
        // Iterate through each character of the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            
            // If the current character is a space or punctuation, process the word
            if (currentChar == ' ' || currentChar == '?' || currentChar == '.' || currentChar == ',' || currentChar == '!') {
                if (word.length() > 3) {
                    System.out.print(word + " ");
                }
                // Reset the word for the next one
                word.setLength(0);
            } else {
                // Add the character to the current word
                word.append(currentChar);
            }
        }
        
        // Process the last word (in case there's no punctuation at the end)
        if (word.length() > 3) {
            System.out.print(word);
        }
    }
}

