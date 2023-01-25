import java.util.Arrays;

/*
    Given two strings, s and t, return true if t is an anagram of s. Return false otherwise.

    An anagram is a word or phrase formed by rearranging the letters of a different word
    or phrase, using the letters only once.

    Examples:

    Input: s = "anagram", t = "nagaram"
    solve("anagram, nagram");
    Output: true

    Input: s = "rat", t = "car"
    solve("rat, car");
    Output: false
 */
public class AnagramValidator  {
   
    public static boolean solution(String input) {

        String[] words = input.split(", ");

        char[] word1 = words[0].substring(5,words[0].length()-1).toCharArray(),
                word2 = words[1].substring(6,words[1].length()-1).toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        boolean isAnagram = Arrays.equals(word1, word2);

        return isAnagram;
    
    }

    public static void main(String[] args){
        System.out.println(solution("s = \"rat\", t = \"car\""));
    }
}
