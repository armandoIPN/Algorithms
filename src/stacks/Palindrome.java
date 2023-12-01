package stacks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {

    public static boolean isPalindrome(String text){
        if(text.isBlank())
            return false;
        List cleanedString= text.toLowerCase().chars().filter(Character::isLetterOrDigit)
                .mapToObj(character ->Character.valueOf((char)character))
                .collect(Collectors.toList());
        //Collections.reverse(cleanedString);
        return applyPalindromeAlgorithm(cleanedString);
    }

    private static boolean applyPalindromeAlgorithm(List cleanedString) {
        int mid=cleanedString.size()/2;
        LinkedList<Character> stack = new LinkedList<>(cleanedString.subList(0, mid ));
        LinkedList queue = new LinkedList<>();
        Collections.reverse(stack);
        if(cleanedString.size()%2==1)
            queue.addAll(cleanedString.subList(mid+1,cleanedString.size()));
        else
            queue.addAll(cleanedString.subList(mid,cleanedString.size()));

        while(!stack.isEmpty()&&!queue.isEmpty()){
            if (stack.pop()!=queue.pop())
                return false;
        }
        return true;

    }
}
