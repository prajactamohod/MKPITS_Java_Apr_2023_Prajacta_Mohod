import java.util.HashMap;
import java.util.Set;

public class HashMap_InterfaceMethod_Second {



        public static void main(String[] args) {

            HashMap hashMap1 = new HashMap();  //Created Hashmap1

            hashMap1.put(101, "Prince");
            hashMap1.put(102, "Prajacta");

            System.out.println(hashMap1);
            HashMap hashMap2=new HashMap();  //Created HashMap2
            hashMap2.putAll(hashMap1);
            System.out.println(hashMap2); //Printing



            hashMap2.replace(101,"Prajwal");  //Replace the Value
            System.out.println(hashMap2);





//            Set set = hashMap1.entrySet();
//            System.out.println(hashMap);
//
//            System.out.println(hashMap.get(102));  //Printing the value by get method

//    HAshMap hAshMap2=new HashMap();
//    hAshMap2.putAll(hashMap1);            //Put All Method To call
//}
        }
    }


