package Math;
import java.util.Arrays;

/*
    Create a method to perform all mathematic operations (addition, subtraction, multiplication, and division) on the contents of a 2 item array within a multidimensional array.
    The method should return a two-dimensional array with the answers of the operations returned in the order addition, subtraction, multiplication, division as one array per two item array given
*/

public class MathematicalOperationsArray {
    
    public static String solution(String input) {

        String [] inputs = input.split(";");

        String [] arr1 = inputs[0].substring(1,inputs[0].length()-1).split(",");
        String [] arr2 = inputs[1].substring(1,inputs[1].length()-1).split(",");

        int[] intArr1 = new int[arr1.length];
        int[] intArr2 = new int[arr2.length];

        for(int i = 0; i< arr1.length; i++)
            intArr1[i] = Integer.parseInt(arr1[i]);

        for(int i = 0; i< arr2.length; i++)
            intArr2[i] = Integer.parseInt(arr2[i]);

        double[][] operation_results = new double[intArr2.length][4];

        for(int i = 0; i< arr1.length; i++){

            operation_results[i][0] = intArr1[i] + intArr2[i];
            operation_results[i][1] = intArr1[i] - intArr2[i];
            operation_results[i][2] = intArr1[i] * intArr2[i];
            operation_results[i][3] = (intArr1[i] + 0.0) / intArr2[i];
        }

        return Arrays.deepToString(operation_results);
    }

    public static void main(String[] args){
        System.out.print(solution("[1,2,3,4];[5,6,7,8]"));
    }
}
