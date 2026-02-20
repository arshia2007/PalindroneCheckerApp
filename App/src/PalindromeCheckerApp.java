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
    }
}
