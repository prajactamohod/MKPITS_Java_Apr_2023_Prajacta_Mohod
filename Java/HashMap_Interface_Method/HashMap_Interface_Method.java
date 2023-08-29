import java.util.HashMap;
import java.util.Set;


public class HashMap_Interface_Method {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        hashMap.put(101, "Prince");
        hashMap.put(102, "Prajacta");

        System.out.println(hashMap);
        Set set = hashMap.entrySet();
        System.out.println(hashMap);

        System.out.println(hashMap.get(102));  //Printing the value by get method

//    HAshMap hAshMap2=new HashMap();
//    hAshMap2.putAll(hashMap1);            //Put All Method To call
//}
    }
}
