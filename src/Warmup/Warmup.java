package Warmup;

public class Warmup {


    public static void main(String[] args) {
        isPalindrome isPalindrome = new isPalindrome();
        isPalindrome.setGetPalindrome("abba");
        System.out.println(isPalindrome.isPalindrome(isPalindrome.getGetPalindrome()));
    }
}
