package date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {


    public Date convert(LocalDate date) {
        // todo finish this
        return Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public LocalDateTime convert(Date date) {
        // todo finish this
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

        // 1981/02/30&18:20
    public static int daysBetween(String firstDate, String lastDate) {
        //JSR 310
        //todo finish this
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd&HH:mm");
        LocalDateTime firstDateDate = LocalDateTime.parse(firstDate, dateTimeFormatter);
        LocalDateTime lastDateDate = LocalDateTime.parse(lastDate, dateTimeFormatter);
        return (int) ChronoUnit.DAYS.between(firstDateDate, lastDateDate);
    }



    public static void main(String[] args) {



        System.out.println(daysBetween("2020/02/02&20:20", "2030/03/03&03:03"));

//
//        String str = "java";
//        str = str.toUpperCase();
//
//        Date date = new Date();
//        System.out.println("date = " + date.getYear());
    }
}
