import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args){

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s){
        //best example of sliding window problem

        int max_len = 0;

        int start_win = 0;
        int end_win = 0;

        Set<Character> set = new HashSet<>();

        while(end_win < s.length()){
            while(set.contains(s.charAt(end_win))){
                set.remove(s.charAt(start_win));
                start_win++;
            }

            set.add(s.charAt(end_win));
            max_len = Math.max(max_len, set.size());
            end_win++;
        }

        return max_len;
    }
}
