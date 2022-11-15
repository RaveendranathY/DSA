public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber_iterative(7));
    }

    static int fibonacciNumber(int num){

        // what is the base case
            if(num == 1 || num == 2)
                return 1;


        // what is the laziest work I can do to contribute the problem
            return fibonacciNumber(num-1) + fibonacciNumber(num-2);


    }

    static int fibonacciNumber_iterative(int num){

        int n1= 1, n2 = 1;
        int res = 0;
        for(int i = 3; i<= num; i++){

            res = n1 + n2;
            n2= n1;
            n1=res;


        }

        return res;

    }

}
