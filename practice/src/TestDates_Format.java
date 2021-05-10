import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates_Format {
    public static void DatesExample(){

        //Current System Date and time is assigned to objDate
        Date objDate = new Date();
        System.out.println(objDate);

        //Date format is specified
        String strDateFormat = "hh:mm:ss a dd-MMM-yyyy";

        //Date format string is passed as an argument to the Date format object
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);

        //Date formatting is applied to the current date
        System.out.println(objSDF.format(objDate));
    }
}

