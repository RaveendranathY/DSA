import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

    public static void main(String[] args) {

        String s = "aabb";
        partition(s).forEach(System.out::println);
    }

    public static List<List<String>> partition(String s){

        List<List<String>> res = new ArrayList<>();

        fun(s,0,new ArrayList<>(),res);

        return res;

    }

    private static void fun(String s, int index, List<String> curr, List<List<String>> res) {

        //base case
        if(index == s.length())
            res.add(new ArrayList<>(curr));

        for(int i=index; i<s.length();i++){

            if(palindrome(s,index,i)){
                curr.add(s.substring(index,i+1));
                fun(s,i+1,curr,res);
                curr.remove(curr.size()-1);
            }

        }
    }

    private static boolean palindrome(String s, int index, int i) {
        int start = index,end=i;
        while (start<=end){
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

}
