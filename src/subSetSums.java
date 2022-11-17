import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class subSetSums {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);

        Collections.sort(arr);

        ArrayList<Integer> res = new ArrayList<>();
        subSetSums(arr,0,0,res);
        res.stream().sorted().forEach(System.out::println);
    }

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){

        ArrayList<Integer> res = new ArrayList<>();
        res.add(0);
        for(int i=0;i<arr.size(); i++){
            int sum = 0;
            for(int j=i; j<arr.size(); j++) {
                sum += arr.get(j);
                res.add(sum);
            }
        }
        return res;
        //return (ArrayList<Integer>) res.stream().sorted().collect(Collectors.toList());
    }

    static void subSetSums(ArrayList<Integer> arr, int i,int sum, ArrayList<Integer> res){

        //base case
        if(i==arr.size()) {
            res.add(sum);
            return;
        }
        // laziest work
        subSetSums(arr,i+1,sum + arr.get(i),res);
        subSetSums(arr,i+1,sum,res);


    }
}
