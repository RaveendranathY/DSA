public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(5));
    }

    public static int sumOfNaturalNumbers(int num){


        //what is the base case
         if(num == 1)
             return 1;

        // what is the laziest work I can do to contribute the problem

          return num + sumOfNaturalNumbers(num-1);






    }
}
