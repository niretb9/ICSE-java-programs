package com.empty;

/*import java.util.*; // Scanner , StringTokenizer
import java.lang.*; // Math library and string library methods Math.sqrt(), isUpperCase(),
parseing methods
 // wrapper class
import java.util.Date; // a specific instant in time
import java.util.Calendar ; // Conversion of Date to integer fields
*/
import java.util.*;
class DatePlay
{
    public static void main(String args[])
    {
        Date d = new Date(); // creating object for Date class
        System.out.println("Date : " + d);
    }
}
// Calendar Class java.util.Calendar
//Calendar c = Calendar.getInstance(); // object creation for Calendar class
//set(int field, int value); // set a specified field with specific value
//get(int field); // obtain value fo specific field
/*Calendar Fields:
Calendar.DATE - Stores numeric day
Calendar.MONTH - Stores numeric month
Calendar.YEAR - Stores numeric year
Calendar.DAY_OF_MONTH - Stores day of month
Calendar.DAY_OF_WEEK - Stores character week
Calendar.DAY_OF_YEAR - Stores day of the year
Calendar.HOUR - Stores hh part of time hh:min:ss.ms
Calendar.MINUTE - Stores min part of time hh:min:ss.ms
Calendar.SECOND - Stores ss part of time hh:min:ss.ms
Calendar.MILLISECOND - Stores ms part of time hh:min:ss.ms */
class Calendar_class
{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();
        System.out.println("Today is " + (c.get(Calendar.MONTH)+1) + " / "
                + (c.get(Calendar.DATE)) + " / "
                + (c.get(Calendar.YEAR)));

        System.out.println("Time is " + (c.get(Calendar.HOUR)) + " : "
                + (c.get(Calendar.MINUTE)));

        System.out.println("TODAY : " + (c.get(Calendar.DAY_OF_MONTH)) + " , "
                + (c.get(Calendar.DAY_OF_WEEK)) + " , "
                + (c.get(Calendar.DAY_OF_YEAR)));
    }
}
