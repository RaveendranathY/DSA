public class SearchIn2DMatrix {

    public static void main(String[] args){

        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int target = 45;

        for(int i=0; i< mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == target)
                    System.out.println(true);
            }
        }

    }
}

