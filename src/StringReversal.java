public class StringReversal {
    public static void main(String[] args) {
        String s = "the simple engineer";
        System.out.println(reverse(s));
    }

    static String reverse(String s){
        // what is the base case
        if(s.length() ==1 )
            return s;
        // what is the smallest thing I can contribute
        return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
    }
}
