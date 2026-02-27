import java.util.*;


interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class PalindromeCheckerApp {

    public static boolean check(String s, int start, int end) {
        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return check(s, start + 1, end - 1);
    }

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

//        UC7 - Deque Based Optimized Palindrome Checker
        String input4 = "refer";
        boolean isPalindrome4 = true;
        Deque<Character> deque = new ArrayDeque<>();
        for(char c : input4.toCharArray()){
            deque.add(c);
        }
        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                isPalindrome4 = false;
            }
        }
        System.out.println("Input text: " + input4);
        System.out.println("Is it a palindrome?" + isPalindrome4);

//        UC8 - Linked List Based Palindrome Checker
        String input5 = "level";
        boolean isPalindrome5 = true;
        LinkedList<Character> list = new LinkedList<>();
        for(char c : input5.toCharArray()){
            list.add(c);
        }
        while (list.size() > 1){
            if(list.removeFirst() != list.removeLast()){
                isPalindrome5 = false;
            }
        }
        System.out.println("Input text: " + input5);
        System.out.println("Is it a palindrome?" + isPalindrome5);

        //    UC9 - Recursive Palindrome Checker
        String input6 = "madam";
        if (check(input6, 0, input6.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

//        UC10 - Normalized Palindrome Validation
        String input7 = "A man a plan a canal Panama";
        String normalized = input7.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome7 = true;
        for (int i = 0; i < normalized.length(); i++){
            if(normalized.charAt(i) != normalized.charAt(normalized.length()-1-i)){
                isPalindrome7 = false;
            }
        }
        System.out.println("Input text: " + input7);
        System.out.println("Is it a palindrome? " + isPalindrome7);

//        UC11 - Object Oriented
        PalindromeService p = new PalindromeService();

        System.out.println(
                p.checkPalindrome("A man a plan a canal Panama")
        );

//        UC12 - Strategy Pattern
        String input8 = "level";

        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input8);

        System.out.println("Input: " + input8);
        System.out.println("Is Palindrome? " + result);
    }

}




