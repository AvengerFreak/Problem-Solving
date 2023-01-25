public class PalindromeValidator {

    /*

    Given an integer, write a function that returns true if the integer is a palindrome.
    The integer is a palindrome when the integer reads the same backwords and forwards.

    Example 1:
    Input = 101
    Output = true

    Example 2:
    Input = 123
    Output = false

    Example 3:
    Input = -121
    Output = false
*/


    public static String solution(String input) {

        StringBuilder stringBuilder = new StringBuilder(input);
        return String.valueOf(input.equals(stringBuilder.reverse().toString()));
    }

    public static void main(String[] args){
        System.out.print(solution("101"));
    }
}
