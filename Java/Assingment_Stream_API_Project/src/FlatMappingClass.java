

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

public class FlatMappingClass {
    public static void main(String[] args) {


        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(Arrays.asList(89, 67, 45));
        listOfList.add(Arrays.asList(76, 44, 34));
        listOfList.add(Arrays.asList(99,56, 34));
        System.out.println(listOfList);
        List<Integer> mergedList = listOfList.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(mergedList);
        int s = mergedList.stream().reduce(0,Integer::sum);     //Method Reference

        System.out.println(s);
    }
}