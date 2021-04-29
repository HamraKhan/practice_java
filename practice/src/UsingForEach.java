import org.w3c.dom.ls.LSOutput;

public class UsingForEach {
    public static void ForEachExample(){
        String[] arrData = {"Alpha", "Beta", "Gamma", "Delta", "Sigma"};
        //the conventional approach of using the for loop
        System.out.println("Using conventional For Loop");
        for (int i = 0; i< arrData.length; i++){
            System.out.println(arrData[i]);
        }
        System.out.println("\nUsing Foreach loop:");
        //the optimized method of using the for loop - also called the foreach loop
        for (String strTemp : arrData){
            System.out.println(strTemp);
        }
    }
}

