public class PowOFN {

    public static void main(String[] args){

        int n = -200;
        System.out.println(pow(2.00000,-2147483648));

    }

    public static double pow(double x , int n){

        double res = 1.0;

        long fin_n = Math.abs((long)(n));

        System.out.println(fin_n);
        while(fin_n > 0 ){

            if(fin_n % 2 == 1){

                res = res * x;
                fin_n--;
            }
            else{

                x = x*x;
                fin_n = fin_n/2;
            }

        }

        return (n > 0)? res: 1/res;
    }
}
