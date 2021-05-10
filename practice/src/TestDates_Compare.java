import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class TestDates_Compare {
    public static void CompareToExample() throws ParseException{

        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
        Date dt_1 = objSDF.parse("20-08-1981");
        Date dt_2 = objSDF.parse("12-10-2012");

        System.out.println("Date1 : " + objSDF.format(dt_1));
        System.out.println("Date2 : " + objSDF.format(dt_2));

        // compareTo method returns the value greater than 0 if this Date is after the Date argument.
        if (dt_1.compareTo(dt_2) > 0){
            System.out.println("Date 1 occurs after Date 2");
        }

        // compareTo method returns the value less than 0 if this Date is before the Date argument.
        else if (dt_1.compareTo(dt_2) < 0){
            System.out.println("Date 1 occurs before Date 2");
        }

        //compareTo method returns the value 0 if the argument Date is equal to the second Date
        else if (dt_1.compareTo(dt_2) == 0){
            System.out.println("Both are same dates");
        }

        else {
            System.out.println("You seem to be a time traveller!!");
        }
    }
}
