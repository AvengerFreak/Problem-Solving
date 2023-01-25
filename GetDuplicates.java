import java.util.ArrayList;
import java.util.Arrays;

public class GetDuplicates {

    /*

    Given an integer array, arr, of length n where all integers of arr are in the range [1,n] and each integer
    appears either once or twice, return an array of all the integers that appear twice. The output array order
    should be the first integer that appears twice, the next integer that appears twice, and so on.

    Examples:
    Input - [7,3,2,6,3,5,7]
    Output - [7,3]

    Input - [1]
    Output - []

    Input - [3,2,3]
    Output - [3]
*/

    public static ArrayList<Integer> solution(int[] input) {

        Arrays.sort(input);
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < input.length -1; i++){

            if(input[i] == input[i+1]) {
                result.add(input[i]);
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args){

        int[] input = {7,3,2,6,3,5,7};
        System.out.println(solution(input));
    }
}
