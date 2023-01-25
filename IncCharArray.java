import java.util.Arrays;

public class IncCharArray {

    /*
    You are given an integer represented by an integer array. The integer does not contain leading 0's.
    Increment the integer by one and return the resulting integer array.

    Examples:
    Input - [1,2,3] -> 123 + 1 -> 124 -> [1,2,4]
    Output - [1,2,4]
    Explanation - the integer represented is 123, the increased integer is 124

    Input - [9]
    Output - [1,0]
    Explanation - the integer represented is 9, the increased integer is 10
*/
    
    public static int[] solution(int[] input) {

        input[input.length-1]+=1;
        return input;
    }

    public static void main(String[] args){

        int[] input = {1,2,3};
        System.out.println(Arrays.toString(solution(input)));
    }
}
