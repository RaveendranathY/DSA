public class UniquePaths {

    public static void main(String[] args){

        System.out.println(uniquePaths(3,4));

    }

    public static int uniquePaths(int m, int n){

        int total_Steps = m+n-2;

        int down_steps = m-1;

        int res = 1;

        for(int i=1; i<=down_steps;i++){

            res = res * (total_Steps-down_steps+i)/i;

        }

        return res;
        //return countUniquePaths(0,0,m,n);
    }

    private static int countUniquePaths(int i, int j,int m, int n) {

        if( i >m-1 || j> n-1)
            return 0;
        if(i== m-1 && j == n-1)
            return 1;

        return countUniquePaths(i+1,j,m,n) + countUniquePaths(i,j+1,m,n);

    }
}
