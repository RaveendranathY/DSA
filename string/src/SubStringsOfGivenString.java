import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStringsOfGivenString {

    public static void main(String[] args) {

        String s = "abcabcbb";

        List<String> subStrings = generateSubStrings(s);
        subStrings.forEach(System.out::println);
    }

    private static List<String> generateSubStrings(String s) {

        List<String> list = new ArrayList<>();

        for(int i=0; i< s.length(); i++){

            for(int j=i; j<s.length(); j++){
                list.add(s.substring(i,j+1));
            }
        }
        return list;
    }


}
