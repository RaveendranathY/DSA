import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InterSectionOfTwoArrays {
    public static void main(String[] args){

        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        Set<String> set = new HashSet<>();
        Arrays.stream(s1).forEach(set::add);
        List<String> res =  Arrays.stream(s2).filter(x->!set.add(x)).collect(Collectors.toList());

        System.out.println(res.stream().distinct());

    }
}
