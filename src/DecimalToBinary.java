public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 233;
        System.out.println(decimalToBinary(num));
    }

    public static String decimalToBinary(int num){

        //what is the base Case
        if(num == 1)
            return "1";

        // what is the laziest work I can do to help the problem
         return decimalToBinary(num/2) + (num%2);



    }
}
