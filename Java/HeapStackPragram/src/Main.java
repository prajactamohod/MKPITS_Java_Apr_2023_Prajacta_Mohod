public class Main {
    public static void main(String[]args) {
        String str1 = "wardha";
        String str2 = "Amravati";
        String str3 = "Pune";
        String str4 = "Nagpur";
        String str5=new String("wardha").intern();
        String str6=new String("Amravati").intern();
        String str7=new String("Pune").intern();
        System.out.println(str1==str5);

    }

}