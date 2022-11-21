import java.util.*;

public class DuplicateElementsInArray {

    public static void main(String[] args){

        int[] arr = new int[] {111, 333, 555, 777, 333, 444, 555};

        duplicateElements(arr);

    }

    public static void duplicateElements(int[] arr){

        //brute Force
        System.out.println("*** --- brute Force  *** --- ");

        for(int i=0; i<arr.length;i++){
            for(int j= i+1; j<arr.length;j++){
                if(arr[i] == arr[j])
                    System.out.println("Duplicate Element :" + arr[i]);
            }
        }

        // sorting
        System.out.println(" *** ---   sorting  *** --- ");
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1])
                System.out.println("Duplicate Element :" + arr[i]);
        }

        //using Hash set
        System.out.println(" *** --- Hash set *** --- ");
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length;i++){
            if(!set.add(arr[i]))
                System.out.println("Duplicate Element : " + arr[i]);
        }

        //using HashMap
        System.out.println(" *** --- HashMap *** --- ");

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        map.entrySet().stream().filter(x-> x.getValue()>1).forEach(x-> System.out.println("Duplicate element : " + x.getKey()));

        //using Java8 streams
        System.out.println(" *** --- java 8 streams --- ***");
        Set<Integer> hashSet = new HashSet<>();
        Arrays.stream(arr).filter(x-> !hashSet.add(x)).
                forEach(x-> System.out.println("Duplicate Element : " + x));

    }




}
