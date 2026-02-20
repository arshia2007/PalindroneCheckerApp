import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Checker App Management System");

//        UC2 - Hardcoded Palindrome Validation
        String text = "madam";
        int len = text.length();
        boolean flag = true;
        for(int i = 0; i < len/2 ; i++){
            if(text.charAt(i) != text.charAt(len-1-i)){
                flag = false;
                break;
            }
        }
        System.out.println("Input text: " + text);
        System.out.println("Is it a palindrome?" + flag);

//        UC3 - Reverse Case based Palindrome checker
        String rev="";
        for(int i = len-1, j = 0; i >= 0; i--, j++){
            rev += text.charAt(i);
        }
        if(rev.equals(text)){
            System.out.println("It is a palindrome");
        }

//        UC4 - Character Array Based Validation
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;
        while (start < end){
            if(chars[start] != chars[end]){
                isPalindrome = false;
            }
            start++;
            end--;
        }
        System.out.println("Input text: " + input);
        System.out.println("Is it a palindrome?" + isPalindrome);

//        UC5 - Stack Based Palindrome Checker
        String input2 = "noon";
        boolean isPalindrome2 = true;
        Stack<Character> stack = new Stack<>();
        for(char c : input2.toCharArray()){
            stack.push(c);
        }
        for(char c : input2.toCharArray()){
            if(c != stack.pop()){
                isPalindrome2 = false;
            }
        }

        System.out.println("Input text: " + input2);
        System.out.println("Is it a palindrome?" + isPalindrome2);

//        UC6 - Queue + Stack Fairness Check
        String input3 = "civic";
        boolean isPalindrome3 = true;
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();
        for(char c : input3.toCharArray()){
            queue.add(c);
            stack.push(c);
        }

        while (!queue.isEmpty()){
            if (queue.remove() != stack.pop()){
                isPalindrome3 = false;
            }
        }

        System.out.println("Input text: " + input3);
        System.out.println("Is it a palindrome?" + isPalindrome3);




    }
}
