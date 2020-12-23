package PracticeDecember;

public class AlgorithmsPractice {
    /**
     * This is to reverse a string
     * This to check if this is reflecting in git 
     * @param name
     */
    public void reverseString(String name) {
        String reverseName = "";
        for(int i = name.length() - 1; i >= 0; i--) {
            reverseName = reverseName + name.charAt(i);
        }
        System.out.println(name + " reverse is " + reverseName);
    }
}
