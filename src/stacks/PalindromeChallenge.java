package stacks;

public class PalindromeChallenge {
    public static void main(String[] args) {
        String text1="I did, did i?";
        System.out.println("IsPalindrome?: "+(Palindrome.isPalindrome(text1)?"YES":"NO"));
        String text2="Racecar";
        System.out.println("IsPalindrome?: "+(Palindrome.isPalindrome(text2)?"YES":"NO"));
        String text3="hello";
        System.out.println("IsPalindrome?: "+(Palindrome.isPalindrome(text3)?"YES":"NO"));

        System.out.println("IsPalindrome?: "+(Palindrome.isPalindrome("abccba")?"YES":"NO"));
        System.out.println("IsPalindrome?: "+(Palindrome.isPalindrome("Was it a car or a cat i saw?")?"YES":"NO"));
        System.out.println("IsPalindrome?: "+(Palindrome.isPalindrome("Don't nod")?"YES":"NO"));

    }
}
