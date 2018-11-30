import java.io.*;
import java.util.*;

public class MyDate implements DateInterface
{
    int Day, Dow, Month, Year;
    /** @return the day of the month (1-31) */
    public int getDay()
    {
        return Day;
    }
    /** @return the day of the week (0-6) */
    public int getDow()
    {
        return Dow;
    }
    /** @return the month of the year (1-12) */
    public int getMonth()
    {
        return Month;
    }
    /** @return the year (four digits) */
    public int getYear()
    {
        return Year;
    }
    /** sets the date
      @param m the month of the year (1-12)
      @param d the day of the mongth (1-31)
      @param y the year (four digits)
      @param dow the day of the week (0-6) */
    public void set(int m, int d, int y, int dow)
    {
        Month = m;
        Day = d;
        Year = y;
        Dow = dow;
    } 
    /** moves the date forward by exactly one day */
    public void tomorrow()
    {
        Day++;
        Dow++;
        //Moves the months with 31 days forward
        if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 && Day > 31)
        {
            Month++;
            Day = 1;
        }
        //Moves the months with 30 days forward
        if (Month == 4 || Month == 6 || Month == 9 || Month == 11 && Day > 30)
        {
            Month++;
            Day = 1; 
        }
        //Checks if Feb. is a leap year
        if (((Year % 4 == 0) && (Year % 100 != 0)) || (Year % 400 == 0))
        {
            if (Month == 2 && Day > 29)
            {
                Month++;
                Day = 1;
            }
        }
        else if (Month == 2 && Day > 28)
        {
                Month++;
                Day =1; 
        }
        //Moves forward a year
        if (Month == 12 && Day > 31)
        {
            Year++;
            Month = 1;
            Day = 1; 
        }
        //Moves the week forward
        if (Dow > 6)
        {
            Dow = 0;
        }
    }   
    /** @return the date as a String in the format */
    public String toString()
    {
        String DowString = new String();
        String MonthString = new String();
        //Change day of week to string
        if (Dow == 0)
        {
            DowString = "Sunday";
        }
        if (Dow == 1)
        {
            DowString = "Monday";
        }
        if (Dow == 2)
        {
            DowString = "Tuesday";
        }
        if (Dow == 3)
        {
            DowString = "Wednesday";
        }
        if (Dow == 4)
        {
            DowString = "Thursday";
        }
        if (Dow == 5)
        {
            DowString = "Friday";
        }
        if (Dow == 6)
        {
            DowString = "Saturday";
        }
        //Change month to string
        if (Month == 1)
        {
            MonthString = "January";
        }
        if (Month == 2)
        {
            MonthString = "February";
        }
        if (Month == 3)
        {
            MonthString = "March";
        }
        if (Month == 4)
        {
            MonthString = "April";
        }
        if (Month == 5)
        {
            MonthString = "May";
        }
        if (Month == 6)
        {
            MonthString = "June";
        }
        if (Month == 7)
        {
            MonthString = "July";
        }
        if (Month == 8)
        {
            MonthString = "August";
        }
        if (Month == 9)
        {
            MonthString = "September";
        }
        if (Month == 10)
        {
            MonthString = "October";
        }
        if (Month == 11)
        {
            MonthString = "November";
        }
        if (Month == 12)
        {
            MonthString = "December";
        }
        
        //changes answer to string
        String answer = new String();
        answer = DowString+ ", " + MonthString + " " + Day + " " + Year;
        return answer;
    }
    public void today()
    {   
    }
    public void yesterday()
    {
    }
}
