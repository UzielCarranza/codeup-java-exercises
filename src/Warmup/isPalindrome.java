package Warmup;

import java.util.Locale;

public class isPalindrome {
    private String possiblePalindrome;
    private boolean isPalindrome;


    public String getPossiblePalindrome() {
        return possiblePalindrome;
    }

    public void setpossiblePalindrome(String getPalindrome) {
        this.possiblePalindrome = getPalindrome.toLowerCase(Locale.ROOT);
    }

    public boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;


        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    public void setPalindrome(boolean palindrome) {
        isPalindrome = palindrome;
    }
}
