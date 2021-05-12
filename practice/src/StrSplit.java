class StrSplit {
    public static void SplitStringExample(){
        String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
        String[] arrSplit = strMain.split(", ");
        for (int i=0; i < arrSplit.length; i++)
        {
            System.out.println(arrSplit[i]);
        }
    }
}
