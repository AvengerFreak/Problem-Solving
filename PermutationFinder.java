import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
    Given an array, words, and a string, pattern, return an array of strings of words[i] that match pattern.
    You may return the answer in any order.

    A word matches the pattern if there exists a permutation of letters, p, so that after replacing every
    letter, x, in the pattern with p(x), we get the desired word.

    A permutation of letters is a bijection from letters to letters: every letter maps to another letter,
    and no two letters map to the same letter.

    Examples:

    Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
    Output: ["mee","aqq"]
    problem.solve("abc,deq,mee,aqq,dkd,ccc,abb");

    Input: words = ["a","b","c"], pattern = "a"
    Output: ["a","b","c"]
    problem.solve("a,b,c,a");
 */
public class PermutationFinder {

    public static List<String> solution (String input) {

        String[] wordAndPattern = input.split(", ");
        String[] words =wordAndPattern[0].substring(9, wordAndPattern[0].length()-1).replaceAll("\"", "").split(",");
        String pattern = wordAndPattern[1].substring(11, wordAndPattern[1].length()-1);
        return findAndReplacePattern(words, pattern);
    }


    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        
        int[] p = F(pattern);
        List<String> res = new ArrayList<String>();
        for (String w : words)
            if (Arrays.equals(F(w), p)) res.add(w);
        return res;
    }

    public static int[] F(String w) {
        
        HashMap<Character, Integer> m = new HashMap<>();
        int n = w.length();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            m.putIfAbsent(w.charAt(i), m.size());
            res[i] = m.get(w.charAt(i));
        }
        
        return res;
    }

    public static void main(String[] args){
        System.out.print(solution("words = [\"a\",\"b\",\"c\"], pattern = \"a\""));
    }
}
