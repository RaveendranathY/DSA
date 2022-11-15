public class Palindrome {
    public static void main(String[] args) {
        String s = "test";
        System.out.println(palindrome(s));
    }

    public static boolean palindrome(String s){

        // what is the base case
        if(s.length() ==0 || s.length() == 1)
            return true;

        // what is the smallest work I can contribute to the problem
        if(s.charAt(0) == s.charAt(s.length()-1))
                return palindrome(s.substring(1,s.length()-1));

            return false;


    }
}
