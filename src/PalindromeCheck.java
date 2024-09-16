public class PalindromeCheck {
    public static boolean isPalindrome(String word){
        int length = word.length();

        for(int i = 0; i < length/2; i++){
            if(word.charAt(i) != word.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String testWord = "madam";
        boolean result = isPalindrome(testWord);
        System.out.println("is this word a palindrome: " + result);
    }

}
