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
    
    public static int[] solution(int[] digits) {

        int index = digits.length-1;
        
        if(index == 0){ // array of len 1
            if(digits[0] == 9)
                return new int[]{1,0};
            
            else{
               digits[0]+=1;
                return digits;
            }
               
        }
        
        int digit = digits[index];
        
        while(digit == 9 && index > 0){
            digits[index]=0;
            digit = digits[--index];
        }
        
        if(digits[index] == 9 && index == 0){ // traversed all the way to the first digit
            
            int N = digits.length;
            int incNine[] = new int[N+1];
            incNine[0]=1;
            
            for(int i = 1; i < N ; i++){
                incNine[i]= 0;
            }
            
            return incNine;
        }
        
        digits[index]+=1;
        return digits;
        
    }

    public static void main(String[] args){

        int[] input = {1,2,3};
        System.out.println(Arrays.toString(solution(input)));
    }
}
