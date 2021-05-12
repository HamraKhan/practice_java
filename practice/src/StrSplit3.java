public class StrSplit3 {
    public static void SplitStringExample3(){
        String  strMain = "Welcome to this world";
        String[] arrSplit_3 = strMain.split("\\s");
        for (int i=0; i < arrSplit_3.length; i++){
            System.out.println(arrSplit_3[i]);
        }
    }
}
