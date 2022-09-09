package Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args){
        System.out.println("Running Data and Time!");

        /******
         * Value	            |       Example
         * 01. yyyy-MM-dd       |	    "1988-09-29"
         * 02. dd/MM/yyyy       |	    "29/09/1988"
         * 03. dd-MMM-yyyy      |	    "29-Sep-1988"
         * 04. E, MMM dd yyyy	|       "Thu, Sep 29 1988"
         * ******/

        /******
         * Read this => https://www.w3schools.com/java/java_date.asp.
         * ******/

//      01.LocalDate()
        LocalDate myLocalDate=LocalDate.now();
        System.out.println("My local date => "+myLocalDate);

//      02.LocalTime()
        LocalTime myLocalTime=LocalTime.now();
        System.out.println("My Local time => "+myLocalTime);

//      03.LocalDateTime()
        LocalDateTime myLocalDataTime=LocalDateTime.now();
        System.out.println("My Local data & time => "+myLocalDataTime);

//      04.DateTimeFormatter()
        DateTimeFormatter myDateTimeFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        String formattedDataTime=myLocalDataTime.format(myDateTimeFormat);
        System.out.println("Formatted Data & Time => "+formattedDataTime);
    }
}
