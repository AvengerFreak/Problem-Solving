public class RomanNumeralConverter{

    
    /*

    There are seven Roman Numerals: I for 1, V for 5, X for 10, L for 50, C for 100, D for 500, and M for 1000.
    Given a whole number n, return the roman numeral equivalent as a string.

    Example:
    Input = 6
    Output = VI

    Example:
    Input = 86
    Output = LXXXVI
*/


    public static String solution(int num) {

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();

        for(int i=0;i<values.length;i++)
        {
            while(num >= values[i])
            {
                num-= values[i];
                roman.append(romanLetters[i]);
            }
        }

        return roman.toString();
    }

    public static void main(String[] args){
        System.out.println(solution(86));
    }
}
