public class DecimalPower {

    /*

    Implement your own method, which calculates "x" to the power of "n".
    Do not use a library.

    Example 1:
    Input = x:2 n:10
    Output = 1024

    Example 2:
    Input = x:3.5 n:4
    Output = 150.0625
 */
   
    public static String solution(String input){

        String[] values = input.split(" ");
        double x = Double.parseDouble(values[0].substring(values[0].indexOf(":")+1, values[0].length())) ,
         n = Double.parseDouble(values[1].substring(values[1].indexOf(":")+1, values[1].length()));
        return String.valueOf(Math.pow(x, n));
    }

    public static void main(String[] args){

        
        System.out.println(solution("x:3.5 n:4"));
    }
}
