package case_study;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        String date = "34/06/2005";

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);

        System.out.println(formatter.format(localDate));
        LocalDate localDateNow = LocalDate.now();
        int days = Period.between(localDate,localDateNow).getYears();
        System.out.println(days);
    }
}
