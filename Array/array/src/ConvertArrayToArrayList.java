import java.util.*;
import java.util.stream.Collectors;

public class ConvertArrayToArrayList {

    public static void main(String[] args){

        Integer[] arr = new Integer[]{1,2,3,5};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.addAll(list,arr);

        list.addAll(Arrays.asList(arr));

       List<Integer> res =  Arrays.stream(arr).collect(Collectors.toList());

        Integer[] test = (Integer[]) list.toArray();

    }
}

