public class PerfectSquareChecker {

    /*

    Given a positive integer, write a function which returns true if the integer is a perfect square.
    Return false if it is not a perfect square.

    Example 1:
    Input = 16
    Output = true

    Example 2:
    Input = 80
    Output = false
*/


    public static String solution(int input) {
        return String.valueOf(Math.sqrt(input) - Math.floor(Math.sqrt(input)) == 0);
    }

    public static void main(String[] args){
        System.out.println(solution(80));
    }
}
