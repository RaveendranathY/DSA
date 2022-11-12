import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubStringsOfGivenString {

    public static void main(String[] args){
        String s = "abcabcbb";
        List<String> list = longestSubStringsWithOutRepeatCharacters(s);
        list.forEach(System.out::println);
    }

    static List<String> longestSubStringsWithOutRepeatCharacters(String s){

        List<String> res = new ArrayList<>();

        int start =0, end=0, max_len = 0;

        int string_start = 0, string_end = 0;
        Set<Character> set = new HashSet<>();

        while(end < s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                if(max_len < set.size() ){
                    max_len = set.size();
                    string_end = end;
                    string_start = start;
                }
                end++;

            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        res.add(s.substring(string_start,string_end+1));
        return res;
    }
}
