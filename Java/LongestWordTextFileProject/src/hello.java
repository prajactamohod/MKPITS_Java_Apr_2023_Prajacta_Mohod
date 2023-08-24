//public class longestWordFile {
//    public static void main(String[]args){
//        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
//        try{
//            System.out.println("Enter file name");
//            File file=new File (b.readLine());
//            if (file.exists()) {
//                BufferedReader br= new BufferedReader(new FileReader(file.toString()));
//                String str=br.readLine();
//                while(str !=null) {
//                    System.out.println(str);
//                    str = br.readLine();
//
//                }
//            } else {
//                System.out.println("File dose not exists");
//            }
//        }
//        catch(FileNotFoundException e) {
//            System.out.println(e);
//        }
//        catch(IOException e){
//            System.out.println(e);
//
//        }
//
//    }