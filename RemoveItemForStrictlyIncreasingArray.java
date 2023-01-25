public class RemoveItemForStrictlyIncreasingArray {

    /*

    Given a 0-indexed integer array, return true if it can be made strictly increasing by removing exactly one
    element. Return false if it cannot. Return true if it already is strictly increasing.

    Strictly Increasing: the integers are sequentially increasing with no gap between them greater than 1.
                [n+1]-[n] = 1

    Examples:
    Input - [2,3,7,4,5]
    Output - true
    Explanation - 7 can be removed to make the array strictly increasing

    Input - [1,1,1]
    Output - false
    Explanation - this array does not increase by removing any element
    */

    public static String solution(int[] arr) {

        return String.valueOf(checkIfIncreasing(arr));
    }

    private static boolean checkIfIncreasing(int[] arr) {

            // Stores the count of numbers that
            // are needed to be removed
            int count = 0;
            int n = arr.length;

            // Store the index of the element
            // that needs to be removed
            int index = -1;

            // Traverse the range [1, N - 1]
            for(int i = 1; i < n; i++)
            {

                // If arr[i-1] is greater than
                // or equal to arr[i]
                if (arr[i - 1] >= arr[i])
                {

                    // Increment the count by 1
                    count++;

                    // Update index
                    index = i;
                }
            }

            // If count is greater than one
            if (count > 1)
                return false;

            // If no element is removed
            if (count == 0)
                return true;

            // If only the last or the
            // first element is removed
            if (index == n - 1 || index == 1)
                return true;

            // If a[index] is removed
            if (arr[index - 1] < arr[index + 1])
                return true;

            // If a[index - 1] is removed
            if (index - 2 >= 0 && arr[index - 2] < arr[index])
                return true;

            // if there is no element to compare
            if(index < 0)
                return true;

            return false;
        }

    public static void main(String[] args){

        int[] input = {2,3,7,4,5};
        System.out.println(solution(input));
    }

}

