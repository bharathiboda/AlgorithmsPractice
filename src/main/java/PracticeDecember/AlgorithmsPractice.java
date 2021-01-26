package PracticeDecember;

import java.util.Arrays;

public class AlgorithmsPractice {
    transient static boolean name;
    /**
     * This is to reverse a string
     * This to check if this is reflecting in git
     * @param name - String
     */
    public void reverseString(String name) {
        String reverseName = "";
        for(int i = name.length() - 1; i >= 0; i--) {
            reverseName = reverseName.concat(name.charAt(i)+"");
        }
        System.out.println(name + " reverse is " + reverseName);
    }

    /**
     * This will tell us if the given strings are permutation of other
     * @param s1 - string one
     * @param s2 - string two
     * @return - boolean
     */
    public boolean permutationOfStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s2.contains(s1.charAt(i) + "")) {
                    count++;
                }
            }
            return count == s1.length();
        }
    }
    public String replaceWith(String string, String replaceWith) {
        for(int i = 0; i < string.length(); i++) {
            if((string.charAt(i) + "").equals(" ")) {
                string = string.substring(0, i) + replaceWith + string.substring(i + 1);
            }
        }
        return string;
    }

    /**
     * This is
     * @param sentence -String of sentence
     * @param anotherSentence - String
     * @return - String
     */
    public String palindromeSentence(String sentence, String anotherSentence) {

        String[] words = sentence.split(" ");
        String[] wordsAnother = anotherSentence.split(" ");

        if (words.length != wordsAnother.length) {
            return "this is not a word palindrome sentence";
        } else {
            String[] modified = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                int count = 0;
                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].length() == wordsAnother[i].length() && words[i].contains(wordsAnother[i].charAt(j) + "")) {
                        count++;
                    }
                }
                if (count == words[i].length()) {
                    modified[i] = wordsAnother[i];
                } else {
                    return "This is not a word palindrome sentence";
                }
            }
            return Arrays.toString(words) + " is a palindrome sentence : " + Arrays.toString(modified);
        }
    }

    public void isPrime(int n) {
        if(n <= 2) {
            System.out.println(n + " is a prime number ");
        }
        for(int i = 2; i < n; i ++) {
            if(n % i == 0) {
                System.out.println(n + "is not a prime no ");
                break;
            } else {
                System.out.println(n + " is a prime no ");
            }
        }
    }



    public static void main(String[] args) {
        AlgorithmsPractice algorithmsPractice = new AlgorithmsPractice();
        //System.out.println(algorithmsPractice.replaceWith("bharathi sandeep", "02%"));
        // System.out.println( algorithmsPractice.permutationOfStrings("dad", "dda"));
        //System.out.println(algorithmsPractice.palindromeSentence("taco cat", "atco cta"));
      algorithmsPractice.isPrime(4);
        int[] array = {1, 2, 3, 1, 4, 2, 1};
        
    }
}
