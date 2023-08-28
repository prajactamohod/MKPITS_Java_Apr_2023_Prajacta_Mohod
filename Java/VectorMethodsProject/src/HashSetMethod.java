import com.sun.source.tree.IntersectionTypeTree;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetMethod {
    public static void main(String [] args){
//        HashSet hashset=new HashSet();
//        hashset.add(89);
//        hashset.add(96);
//        hashset.add(56);
//        hashset.add(45);
//
//        System.out.println(hashset);
//
//        Object[]arr=hashset.toArray();
//        System.out.println("The array is");
//        for(int count = 0; count < arr.length; count++)
//            System.out.println(arr[count]);




        //Used of Union Method

        Integer[]numArray1={34,54,65,66};
        Integer[]numArray2={44,65,12,43};

        HashSet  hashset1=new HashSet(Arrays.asList(numArray1));
        HashSet  hashset2=new HashSet(Arrays.asList(numArray2));


        System.out.println(hashset1);
        System.out.println(hashset2);

        HashSet unionofSet1andSet2=new HashSet();
        unionofSet1andSet2.addAll(hashset1);
        unionofSet1andSet2.addAll(hashset2);

        System.out.println(unionofSet1andSet2);
        System.out.println("Intersection:");

        HashSet intersectionofSet1andSet2=new HashSet(hashset1);
        intersectionofSet1andSet2.retainAll(hashset2);

        System.out.println("Intersection element from numArray1 and numArray2 :" + intersectionofSet1andSet2);
    }

}
